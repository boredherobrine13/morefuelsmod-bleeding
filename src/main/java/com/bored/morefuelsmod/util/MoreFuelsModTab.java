package com.bored.morefuelsmod.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.bored.morefuelsmod.MoreFuelsMod;
import com.bored.morefuelsmod.item.ModItems;

public class MoreFuelsModTab extends CreativeTabs{
	
	public MoreFuelsModTab() {
		super(MoreFuelsMod.modId);
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.cokeItem);
	}
	@Override
	public boolean hasSearchBar(){
		return true;
	}
}
