package de.keks.internal.core.cApi.KChunk;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;



public class KChunkTeleport {
	public static void saveTeleport(Chunk chunk) {
		for (Entity entity : chunk.getEntities()) {
			try {
				if (entity instanceof Player) {
					Location l = entity.getLocation();
					l.setY(entity.getWorld().getHighestBlockYAt(l));
					entity.teleport(l);
				}
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
