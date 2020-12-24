package com.duckblade.osrs.caser;

public enum AttackType
{

	STAB,
	SLASH,
	CRUSH,
	MAGIC,
	RANGED,
	;

	public String toString() {
		return name().toLowerCase();
	}

}
