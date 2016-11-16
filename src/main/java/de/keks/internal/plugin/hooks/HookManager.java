package de.keks.internal.plugin.hooks;

import de.keks.cubit.CubitPlugin;
import de.keks.internal.core.tasks.RegisterPluginHooksTask;
import de.keks.internal.plugin.hooks.classes.EconomyHook;
import de.keks.internal.plugin.hooks.classes.VaultHook;
import de.keks.internal.plugin.hooks.classes.WorldEditHook;
import de.keks.internal.plugin.hooks.classes.WorldGuardHook;


public class HookManager {

	private WorldGuardHook worldGuardManager;
	private WorldEditHook worldEditManager;
	private VaultHook vaultManager;

	public HookManager(final CubitPlugin cubit) {

		worldGuardManager = new WorldGuardHook(cubit);
		cubit.getServer().getScheduler().scheduleSyncDelayedTask(cubit, new RegisterPluginHooksTask(worldGuardManager));

		worldEditManager = new WorldEditHook(cubit);
		cubit.getServer().getScheduler().scheduleSyncDelayedTask(cubit, new RegisterPluginHooksTask(worldEditManager));

		vaultManager = new VaultHook(cubit);
		cubit.getServer().getScheduler().scheduleSyncDelayedTask(cubit, new RegisterPluginHooksTask(vaultManager));

	}

	public EconomyHook getEconomyManager() {
		return vaultManager;
	}

	public WorldGuardHook getWorldGuardManager() {
		return worldGuardManager;
	}

	public WorldEditHook getWorldEditManager() {
		return worldEditManager;
	}

}
