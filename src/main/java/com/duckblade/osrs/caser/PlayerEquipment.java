package com.duckblade.osrs.caser;

import com.google.common.collect.ImmutableMap;
import lombok.Value;
import net.runelite.api.*;
import net.runelite.client.game.ItemManager;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

@Value
public class PlayerEquipment {

    private static final Map<Integer, Integer> REPLACEMENTS = ImmutableMap.<Integer, Integer>builder()
            .put(ItemID.INFERNAL_CAPE_L, ItemID.INFERNAL_CAPE)
            .build();

    Integer head;
    Integer cape;
    Integer neck;
    Integer ammo;
    Integer weapon;
    Integer body;
    Integer shield;
    Integer legs;
    Integer hands;
    Integer feet;
    Integer ring;

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        BiConsumer<String, Integer> append = (name, value) -> {
            if (value != null) {
                sb.append(name)
                        .append(": findEquipmentById(")
                        .append(value)
                        .append("),\n");
            }
        };

        append.accept("head", head);
        append.accept("cape", cape);
        append.accept("neck", neck);
        append.accept("ammo", ammo);
        append.accept("weapon", weapon);
        append.accept("body", body);
        append.accept("shield", shield);
        append.accept("legs", legs);
        append.accept("hands", hands);
        append.accept("feet", feet);
        append.accept("ring", ring);

        sb.append('}');
        return sb.toString();
    }

    public static PlayerEquipment fromClient(ItemManager im, Client client) {
        ItemContainer equipment = client.getItemContainer(InventoryID.EQUIPMENT);
        if (equipment == null) {
            throw new RuntimeException("equipment == null");
        }

        Function<EquipmentInventorySlot, Integer> getItem = (slot) -> {
            Item item = equipment.getItem(slot.getSlotIdx());
            if (item == null) {
                return null;
            }

            int itemId = item.getId();
            return REPLACEMENTS.getOrDefault(itemId, itemId);
        };

        return new PlayerEquipment(
                getItem.apply(EquipmentInventorySlot.HEAD),
                getItem.apply(EquipmentInventorySlot.CAPE),
                getItem.apply(EquipmentInventorySlot.AMULET),
                getItem.apply(EquipmentInventorySlot.AMMO),
                getItem.apply(EquipmentInventorySlot.WEAPON),
                getItem.apply(EquipmentInventorySlot.BODY),
                getItem.apply(EquipmentInventorySlot.SHIELD),
                getItem.apply(EquipmentInventorySlot.LEGS),
                getItem.apply(EquipmentInventorySlot.GLOVES),
                getItem.apply(EquipmentInventorySlot.BOOTS),
                getItem.apply(EquipmentInventorySlot.RING)
        );
    }

}
