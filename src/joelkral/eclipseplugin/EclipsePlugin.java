package joelkral.eclipseplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EclipsePlugin extends JavaPlugin
{
	private final PlayerListener playerListener = new PlayerListener();
	@Override
	public void onEnable() 
	{
		this.getLogger().info("Hello from the Eclipse Plugin");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerListener, this);
	}
	
	@Override
	public void onDisable() 
	{
		this.getLogger().info("Bye Bye");
	}
}
