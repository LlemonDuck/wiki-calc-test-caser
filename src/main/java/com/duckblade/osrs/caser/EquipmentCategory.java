package com.duckblade.osrs.caser;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://oldschool.runescape.wiki/w/Module:CombatStyles
@RequiredArgsConstructor
public enum EquipmentCategory
{

	TWO_HANDED_SWORD(10, Arrays.asList(
		new PlayerCombatStyle(0, "Chop", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Slash", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Smash", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	AXE(1, Arrays.asList(
		new PlayerCombatStyle(0, "Chop", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Hack", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Smash", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	BANNER(24, Arrays.asList(
		new PlayerCombatStyle(0, "Lunge", AttackType.STAB, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Swipe", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Pound", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.STAB, Stance.DEFENSIVE)
	)),
	BLADED_STAFF(21, Arrays.asList(
		new PlayerCombatStyle(0, "Jab", AttackType.STAB, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Swipe", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Fend", AttackType.CRUSH, Stance.DEFENSIVE),
		new PlayerCombatStyle(4, "Spell", AttackType.MAGIC, Stance.AUTOCAST)
	)),
	BLUDGEON(26, Arrays.asList(
		new PlayerCombatStyle(0, "Pound", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(1, "Pummel", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Smash", AttackType.CRUSH, Stance.AGGRESSIVE)
	)),
	BLUNT(2, Arrays.asList(
		new PlayerCombatStyle(0, "Pound", AttackType.CRUSH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Pummel", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.CRUSH, Stance.DEFENSIVE)
	)),
	BOW(3, Arrays.asList(
		new PlayerCombatStyle(0, "Accurate", AttackType.RANGED, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Rapid", AttackType.RANGED, Stance.RAPID),
		new PlayerCombatStyle(3, "Longrange", AttackType.RANGED, Stance.LONGRANGE)
	)),
	BULWARK(27, Collections.singletonList(
		new PlayerCombatStyle(0, "Pummel", AttackType.CRUSH, Stance.ACCURATE)
	)),
	CHINCHOMPAS(7, Arrays.asList(
		new PlayerCombatStyle(0, "Short fuse", AttackType.RANGED, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Medium fuse", AttackType.RANGED, Stance.RAPID),
		new PlayerCombatStyle(3, "Long fuse", AttackType.RANGED, Stance.LONGRANGE)
	)),
	CLAW(4, Arrays.asList(
		new PlayerCombatStyle(0, "Chop", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Slash", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Lunge", AttackType.STAB, Stance.CONTROLLED),
		new PlayerCombatStyle(3, "Block", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	CROSSBOW(5, Arrays.asList(
		new PlayerCombatStyle(0, "Accurate", AttackType.RANGED, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Rapid", AttackType.RANGED, Stance.RAPID),
		new PlayerCombatStyle(3, "Longrange", AttackType.RANGED, Stance.LONGRANGE)
	)),
	PARTISAN(29, Arrays.asList(
		new PlayerCombatStyle(0, "Stab", AttackType.STAB, Stance.ACCURATE),
		new PlayerCombatStyle(0, "Lunge", AttackType.STAB, Stance.AGGRESSIVE),
		new PlayerCombatStyle(0, "Pound", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(0, "Block", AttackType.STAB, Stance.ACCURATE)
	)),
	PICKAXE(11, Arrays.asList(
		new PlayerCombatStyle(0, "Spike", AttackType.STAB, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Impale", AttackType.STAB, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Smash", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.STAB, Stance.DEFENSIVE)
	)),
	POLEARM(12, Arrays.asList(
		new PlayerCombatStyle(0, "Jab", AttackType.STAB, Stance.CONTROLLED),
		new PlayerCombatStyle(1, "Swipe", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Fend", AttackType.STAB, Stance.DEFENSIVE)
	)),
	POLESTAFF(18, Arrays.asList(
		new PlayerCombatStyle(0, "Bash", AttackType.CRUSH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Pound", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.CRUSH, Stance.DEFENSIVE)
	)),
	POWERED_STAFF(23, Arrays.asList(
		new PlayerCombatStyle(0, "Accurate", AttackType.MAGIC, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Accurate", AttackType.MAGIC, Stance.ACCURATE),
		new PlayerCombatStyle(3, "Longrange", AttackType.MAGIC, Stance.LONGRANGE)
	)),
	SALAMANDER(6, Arrays.asList(
		new PlayerCombatStyle(0, "Scorch", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(1, "Flare", AttackType.RANGED, Stance.ACCURATE),
		new PlayerCombatStyle(2, "Blaze", AttackType.MAGIC, Stance.DEFENSIVE)
	)),
	SCYTHE(14, Arrays.asList(
		new PlayerCombatStyle(0, "Reap", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Chop", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Jab", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	SLASH_SWORD(9, Arrays.asList(
		new PlayerCombatStyle(0, "Chop", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Slash", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Lunge", AttackType.STAB, Stance.CONTROLLED),
		new PlayerCombatStyle(3, "Block", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	SPEAR(15, Arrays.asList(
		new PlayerCombatStyle(0, "Lunge", AttackType.STAB, Stance.CONTROLLED),
		new PlayerCombatStyle(1, "Swipe", AttackType.SLASH, Stance.CONTROLLED),
		new PlayerCombatStyle(2, "Pound", AttackType.CRUSH, Stance.CONTROLLED),
		new PlayerCombatStyle(3, "Block", AttackType.STAB, Stance.DEFENSIVE)
	)),
	SPIKED(16, Arrays.asList(
		new PlayerCombatStyle(0, "Pound", AttackType.CRUSH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Pummel", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Spike", AttackType.STAB, Stance.CONTROLLED),
		new PlayerCombatStyle(3, "Block", AttackType.CRUSH, Stance.DEFENSIVE)
	)),
	STAB_SWORD(17, Arrays.asList(
		new PlayerCombatStyle(0, "Stab", AttackType.STAB, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Lunge", AttackType.STAB, Stance.AGGRESSIVE),
		new PlayerCombatStyle(2, "Slash", AttackType.SLASH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.STAB, Stance.DEFENSIVE)
	)),
	STAFF(18, Arrays.asList(
		new PlayerCombatStyle(0, "Bash", AttackType.CRUSH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Pound", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Focus", AttackType.CRUSH, Stance.DEFENSIVE),
		new PlayerCombatStyle(4, "Spell", AttackType.MAGIC, Stance.AUTOCAST)
	)),
	THROWN(19, Arrays.asList(
		new PlayerCombatStyle(0, "Accurate", AttackType.RANGED, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Rapid", AttackType.RANGED, Stance.RAPID),
		new PlayerCombatStyle(3, "Longrange", AttackType.RANGED, Stance.LONGRANGE)
	)),
	UNARMED(0, Arrays.asList(
		new PlayerCombatStyle(0, "Punch", AttackType.CRUSH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Kick", AttackType.CRUSH, Stance.AGGRESSIVE),
		new PlayerCombatStyle(3, "Block", AttackType.CRUSH, Stance.DEFENSIVE)
	)),
	WHIP(20, Arrays.asList(
		new PlayerCombatStyle(0, "Flick", AttackType.SLASH, Stance.ACCURATE),
		new PlayerCombatStyle(1, "Lash", AttackType.SLASH, Stance.CONTROLLED),
		new PlayerCombatStyle(3, "Deflect", AttackType.SLASH, Stance.DEFENSIVE)
	)),
	;

	@Getter
	private final int varbValue;

	@Getter
	private final List<PlayerCombatStyle> playerCombatStyles;

	public static EquipmentCategory fromVarbit(int varb) {
		return Arrays.stream(values())
				.filter(c -> c.varbValue == varb)
				.findFirst()
				.orElse(null);
	}

}
