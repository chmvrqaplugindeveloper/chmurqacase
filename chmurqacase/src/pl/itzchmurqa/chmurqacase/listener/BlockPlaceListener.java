package pl.itzchmurqa.chmurqacase.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import pl.itzchmurqa.chmurqacase.itembuilder.ItemBuilder;
import pl.itzchmurqa.harrypotter.util.ChatUtil;

public class BlockPlaceListener implements Listener{
	
	@EventHandler(priority=EventPriority.MONITOR)
	public void onPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();
		if(e.isCancelled()) {
			return;
		}
		
		if(b.getType() == Material.CHEST) {
			ItemMeta im = p.getItemInHand().getItemMeta();
			if(im.getDisplayName() != null) {
				if(im.getDisplayName().toLowerCase().equalsIgnoreCase(ChatUtil.Color("&6CASE"))){
					b.setType(Material.AIR);
					ChatUtil.sendB("&4&lGRACZ "+p.getName()+" &4&lOTWORZYL CASE");
					ChatUtil.sendB("");
					ChatUtil.sendB("&4&lWYLOSOWAL:");
					ChatUtil.sendB("");
					if(Math.random() * 100 <= 20) {
						ItemStack item1 = new ItemBuilder(Material.DIAMOND_SWORD).addEnchant(Enchantment.DAMAGE_ALL, 6).addEnchant(Enchantment.FIRE_ASPECT, 2).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item1);
						ChatUtil.sendB("&a&lDIAX MIECZ 6/2");
					}
					
					if(Math.random() * 100 <= 30) {
						ItemStack item2 = new ItemBuilder(Material.DIAMOND_PICKAXE).addEnchant(Enchantment.DIG_SPEED, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item2);
						ChatUtil.sendB("&a&lDIAX KILOF 6/3");
					}
					
					if(Math.random() * 100 <= 30) {
						ItemStack item3 = new ItemBuilder(Material.DIAMOND_SPADE).addEnchant(Enchantment.DIG_SPEED, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item3);
						ChatUtil.sendB("&a&lDIAX LOPATA 6/3");
					}
					
					if(Math.random() * 100 <= 10) {
						ItemStack item4 = new ItemBuilder(Material.DIAMOND_AXE).addEnchant(Enchantment.DIG_SPEED, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item4);
						ChatUtil.sendB("&a&lDIAX SIEKIERE 6/3");
					}
					
					if(Math.random() * 100 <= 2) {
						ItemStack item5 = new ItemBuilder(Material.DIAMOND_CHESTPLATE).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item5);
						ChatUtil.sendB("&a&lDIAX KLATE 6/3");
					}
					
					if(Math.random() * 100 <= 2) {
						ItemStack item6 = new ItemBuilder(Material.DIAMOND_LEGGINGS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item6);
						ChatUtil.sendB("&a&lDIAX SPODNIE 6/3");
					}
					
					if(Math.random() * 100 <= 4) {
						ItemStack item7 = new ItemBuilder(Material.DIAMOND_BOOTS).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item7);
						ChatUtil.sendB("&a&lDIAX BUTY 6/3");
					}
					
					if(Math.random() * 100 <= 2) {
						ItemStack item8 = new ItemBuilder(Material.DIAMOND_HELMET).addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6).addEnchant(Enchantment.DURABILITY, 3).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item8);
						ChatUtil.sendB("&a&lDIAX HELM 6/3");
					}
					
					if(Math.random() * 100 <= 5) {
						ItemStack item9 = new ItemBuilder(Material.BOW).addEnchant(Enchantment.ARROW_DAMAGE, 6).addEnchant(Enchantment.DURABILITY, 3).addEnchant(Enchantment.ARROW_INFINITE, 1).toItemStack();
						b.getWorld().dropItemNaturally(b.getLocation(), item9);
						ChatUtil.sendB("&a&lLUK 6/3/1");
					}
				}
			}
		}
	}
		
}
