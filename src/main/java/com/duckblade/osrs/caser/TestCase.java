package com.duckblade.osrs.caser;

import lombok.Value;
import net.runelite.api.Prayer;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class TestCase {

    int monsterId;

    PlayerSkills skills;

    List<Prayer> prayers;

    PlayerCombatStyle style;

    PlayerEquipment equipment;

    int maxHit;

    public String toString() {
        return "import { expect, test } from '@jest/globals';\n" +
                "import {\n" +
                "  calculate,\n" +
                "  findEquipmentById,\n" +
                "  getTestMonsterById,\n" +
                "  getTestPlayer,\n" +
                "} from '@/tests/utils/TestUtils';\n" +
                (prayers.isEmpty() ? "" : "import {Prayer} from '@/enums/Prayer';\n") +
                "\n" +
                "test('generated', () => {\n" +
                "const monster = getTestMonsterById(" +
                monsterId +
                ");\n" +
                "const player = getTestPlayer(monster, {\n" +
                "skills: " +
                skills +
                ",\n" +
                "prayers: [" +
                prayers.stream().map(p -> "Prayer." + p.name()).collect(Collectors.joining(",")) +
                "],\n" +
                "style: " +
                style +
                ",\n" +
                "equipment: " +
                equipment +
                ",\n" +
                "});\n" +
                "\n" +
                "const { maxHit } = calculate(player, monster);\n" +
                "expect(maxHit).toBe(" +
                maxHit +
                ");\n" +
                "});";
    }

}
