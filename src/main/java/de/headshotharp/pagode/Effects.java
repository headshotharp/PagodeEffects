package de.headshotharp.pagode;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Effects extends JavaPlugin implements Listener
{
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerMove(PlayerMoveEvent e)
	{
		Location loc = e.getPlayer().getLocation();
		if (loc.getX() >= -465 && loc.getX() <= -449)
		{
			if (loc.getY() >= 87 && loc.getY() <= 95)
			{
				if (loc.getZ() >= 321 && loc.getZ() <= 337)
				{
					e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
					e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 1));
				}
			}
		}
	}
}
