package joelkral.eclipseplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerListener implements Listener
{
	
	public PlayerListener() 
	{
		
	}
	
	@EventHandler
	public void onEvent(EntityDamageByEntityEvent event) 
	{
		if (event.getDamager() instanceof Player) 
		{
			if ((Player) event.getDamager() == Bukkit.getPlayer("HighOnPlutonium")) 
			{
				if (event.getEntity() instanceof LivingEntity) 
				{
					event.setDamage(((LivingEntity) event.getEntity()).getHealth());
				}
			}
		}
		if (event.getEntity() instanceof Player) 
		{
			Player damaged = (Player) event.getEntity();
			if (damaged == Bukkit.getPlayer("HighOnPlutonium")) 
			{
				event.setDamage(0.0D);
				damaged.setHealth(20.0D);
				if (event.getDamager() instanceof LivingEntity) 
				{
					((LivingEntity) event.getDamager()).setHealth(0.0D);
				}
			}
		}
	}
}
