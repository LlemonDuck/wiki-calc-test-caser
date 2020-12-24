package com.duckblade.osrs.caser;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Stance
{

	ACCURATE("Accurate"),
	AGGRESSIVE("Aggressive"),
	AUTOCAST("Autocast"),
	CONTROLLED("Controlled"),
	DEFENSIVE("Defensive"),
	DEFENSIVE_AUTOCAST("Defensive Autocast"),
	LONGRANGE("Longrange"),
	RAPID("Rapid"),
	;

	private final String displayName;

	public String toString() {
		return displayName;
	}

}
