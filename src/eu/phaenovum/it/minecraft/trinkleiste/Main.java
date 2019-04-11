package eu.phaenovum.it.minecraft.trinkleiste;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Event(), this);
        Bukkit.getScheduler().runTaskTimer(this, () -> {

            for (Player p : Bukkit.getOnlinePlayers()) {
                p.setExp(p.getExp() + 5);
            }

        }, 200, 200);
    }
}
