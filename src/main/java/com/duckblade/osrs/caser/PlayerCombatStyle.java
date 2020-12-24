package com.duckblade.osrs.caser;

import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;

@Value
public class PlayerCombatStyle {

    int varpValue;
    String name;
    AttackType type;
    Stance stance;

    public String toString() {
        return "{\n" +
                "name: '" + name + "',\n" +
                "type: '" + type + "',\n" +
                "stance: '" + stance + "'\n" +
                "}";
    }

    public static PlayerCombatStyle fromClient(Client c) {
        EquipmentCategory cat = EquipmentCategory.fromVarbit(c.getVarbitValue(Varbits.EQUIPPED_WEAPON_TYPE));
        if (cat == null) {
            throw new RuntimeException("Failed to find equipment category");
        }

        int stanceBit = c.getVarpValue(VarPlayer.ATTACK_STYLE);
        for (PlayerCombatStyle s : cat.getPlayerCombatStyles()) {
            if (s.varpValue == stanceBit) {
                return s;
            }
        }

        throw new RuntimeException("Failed to find combat style");
    }

}
