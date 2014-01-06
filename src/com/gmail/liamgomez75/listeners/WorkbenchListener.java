/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.liamgomez75.listeners;

import com.gmail.liamgomez75.compactcrafting.CompactCrafting;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

/**
 *
 * @author liamgomez75 <liamgomez75@gmail.com>
 */

public class WorkbenchListener implements Listener {
      
        /**
        * Plugin used for customizable values and localisation.
        */
        private CompactCrafting plugin;
    
        /**
        * Constructor - Initializes plugin.
        *
        * @param plugin    plugin used to set config values and localisation
        */
        public WorkbenchListener(CompactCrafting plugin) {
            this.plugin = plugin;
        }
    
        
    
        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent e){
            final Player player = e.getPlayer();
            if( (e.getAction() == (Action.RIGHT_CLICK_AIR))) {
                    if(player.getInventory().getItemInHand().getType() == Material.WORKBENCH && player.hasPermission("craft.WorkBench")) {
                        Inventory inv = Bukkit.getServer().createInventory(null, InventoryType.WORKBENCH);
                        //player.openInventory(inv);
                        player.openWorkbench(null, true);
                    }
                }
            }
        }
