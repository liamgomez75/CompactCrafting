/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.liamgomez75.compactcrafting;

import com.gmail.liamgomez75.listeners.WorkbenchListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author liamgomez75 <liamgomez75@gmail.com>
 */
public class CompactCrafting extends JavaPlugin {
        @Override
        public void onEnable() {
            getServer().getPluginManager().registerEvents(new WorkbenchListener(this), this);
            saveDefaultConfig();
        }
    }
