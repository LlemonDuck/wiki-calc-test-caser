package com.duckblade.osrs.caser;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CaserPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CaserPlugin.class);
		RuneLite.main(args);
	}
}
