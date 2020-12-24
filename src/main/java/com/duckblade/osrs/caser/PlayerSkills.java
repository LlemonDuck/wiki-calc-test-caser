package com.duckblade.osrs.caser;

import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.Skill;

@Value
public class PlayerSkills {

    int atk;
    int str;
    int ranged;
    int magic;

    public String toString() {
        return "{\n" +
                "atk: " + atk + ",\n" +
                "str: " + str + ",\n" +
                "ranged: " + ranged + ",\n" +
                "magic: " + magic + ",\n" +
                "}";
    }

    public static PlayerSkills fromClient(Client c) {
        return new PlayerSkills(
                c.getBoostedSkillLevel(Skill.ATTACK),
                c.getBoostedSkillLevel(Skill.STRENGTH),
                c.getBoostedSkillLevel(Skill.RANGED),
                c.getBoostedSkillLevel(Skill.MAGIC)
        );
    }

}
