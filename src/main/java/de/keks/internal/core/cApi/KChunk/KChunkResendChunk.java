package de.keks.internal.core.cApi.KChunk;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;


public class KChunkResendChunk {

	private static String getVersion() {
		String[] array = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",");
		if (array.length == 4)
			return array[3] + ".";
		return "";
	}

	@SuppressWarnings("deprecation")
	public static void refreshChunk(final Chunk chunk) {

		if (getVersion().contains("1_8_R3")) {
			NMSVersion1_10_R1.refreshChunk(chunk);

		} else {
			for (Player player : Bukkit.getOnlinePlayers()) {
				if (player.getWorld().refreshChunk(chunk.getX(), chunk.getZ())) {
				}
			}
		}
	}
}
