package de.keks.internal.plugin.hooks.classes;

import org.bukkit.OfflinePlayer;

import de.keks.internal.plugin.hooks.HookCheck;



public abstract class EconomyHook implements HookCheck {
	public abstract double getMoney(OfflinePlayer player);

	public abstract void giveMoney(OfflinePlayer player, double amount);

	public abstract String formatMoney(double amount);
}
