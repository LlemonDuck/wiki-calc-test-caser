package com.duckblade.osrs.caser;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.CommandExecuted;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatCommandManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@PluginDescriptor(
        name = "Wiki DPS Calc Test Caser"
)
@Singleton
public class CaserPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private ClientThread clientThread;

    @Inject
    private ItemManager itemManager;

    @Inject
    private ChatCommandManager chatCommandManager;

    private int lastHitsplat = -1;
    private int lastTarget = -1;

    @Subscribe
    public void onHitsplatApplied(HitsplatApplied e) {
        if (e.getHitsplat().isMine()) {
            this.lastHitsplat = e.getHitsplat().getAmount();
            if (e.getHitsplat().getHitsplatType() == HitsplatID.DAMAGE_MAX_ME) {
                writeCase();
            }
        }
    }

    @Subscribe
    public void onCommandExecuted(CommandExecuted e) {
        if (e.getCommand().equals("caser")) {
            clientThread.invokeLater(() -> {
                if (lastHitsplat == -1) {
                    client.addChatMessage(ChatMessageType.GAMEMESSAGE, "a", "No hitsplat tracked.", "b");
                    return;
                }
                if (lastTarget == -1) {
                    client.addChatMessage(ChatMessageType.GAMEMESSAGE, "a", "No monster tracked. Using Abyssal demon.", "b");
                }

                writeCase();
            });
        }
    }

    @Subscribe
    public void onInteractingChanged(InteractingChanged e)
    {
        if (e.getSource() == client.getLocalPlayer()) {
            Actor target = e.getTarget();
            if (target instanceof NPC) {
                lastTarget = ((NPC) target).getId();
            }
        }
    }

    private void writeCase() {
        TestCase testCase = new TestCase(
                lastTarget,
                PlayerSkills.fromClient(client),
                getPrayers(),
                PlayerCombatStyle.fromClient(client),
                PlayerEquipment.fromClient(itemManager, client),
                lastHitsplat
        );
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(testCase.toString()), null);
        client.addChatMessage(ChatMessageType.GAMEMESSAGE, "a", "Copied.", "b");
        lastHitsplat = -1;
    }

    private List<Prayer> getPrayers() {
        List<Prayer> ret = new ArrayList<>();
        for (Prayer p : Prayer.values()) {
            if (client.isPrayerActive(p)) {
                ret.add(p);
            }
        }

        return ret;
    }

}
