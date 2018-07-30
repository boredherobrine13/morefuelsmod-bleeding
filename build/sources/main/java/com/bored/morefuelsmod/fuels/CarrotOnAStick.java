package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class CarrotOnAStick implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Items.CARROT_ON_A_STICK){
			return 300;
		}
		return 0;
	}
}