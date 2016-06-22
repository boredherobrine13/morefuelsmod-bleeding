package com.bored.morefuelsmod;

import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.DEADBUSH)){
					return 200;
				}
				if(fuel.getItem() == Item.getItemFromBlock(Blocks.CACTUS)){
					return 300;
				}
				//Sponges. Wet sponge burns too, need to figure out how to disable that.
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.sponge)){
				//}
				//Removed until further notice. Will be re added but must be enabled by config flag.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WEB)){
					return 160;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.LEVER)){
					return 120;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.GRASS)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.DOUBLE_PLANT)){
					return 200;
				}
				//Flowers start here
				//This code SHOULD cover all flowers.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_FLOWER)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.YELLOW_FLOWER)){
					return 100;
				}
				//Flowers end here
				if (fuel.getItem() == Items.ITEM_FRAME){
					return 900;
				}
				if (fuel.getItem() == Items.BED){
					return 1500;
				}
				if (fuel.getItem() == Items.PAINTING){
					return 1000;
				}
				if (fuel.getItem() == Items.SIGN){
				//Actual calculation here was 633.33~ but I rounded.
					return 640;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.LADDER)){
				//Actual calculation here was 233.33~ but I rounded.
					return 240;
				}
				//Rails start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RAIL)) {
				//Actual calculation here was 13.75  but I rounded.
					return 20;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.ACTIVATOR_RAIL)){
				//Actual calculation here was 73.33~ but I rounded.
					return 80;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.DETECTOR_RAIL)){
				//Actual calculation here was 23.33~ but I rounded.
					return 20;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.GOLDEN_RAIL)){
					return 40;
				}
				//Pistons start here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.PISTON)){
					return 1020;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.STICKY_PISTON)){
					return 1040;
				}
				//Pistons end here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.VINE)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WATERLILY)){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TRIPWIRE_HOOK)){
				//Actual calculation here was 210 but I rounded.
					return 220;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.HAY_BLOCK)){
					return 900;
				}
				//Wool and Carpet handled here
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CARPET)){
				//Actual calculation here was 133.33~ but I rounded.
					return 140;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOOL)){
					return 200;
				}
				//Arrows handled here
				if (fuel.getItem() == Items.ARROW){
				//Actual calculation here was 55 but I rounded
					return 60;
				}
				if (fuel.getItem() == Items.FEATHER){
					return 100;
				}
				if (fuel.getItem() == Items.WHEAT){
					return 100;
				}
				//Seeds handled here, all 60 tick burn times
				if (fuel.getItem() == Items.WHEAT_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Items.MELON_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Items.PUMPKIN_SEEDS){
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TORCH)){
				//Actual calculation here was 30 but I rounded.
					return 40;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_TORCH)){
					return 120;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.UNLIT_REDSTONE_TORCH)){
				//just in case someone gets one of these in their inventory..
					return 120;
				}
				//Doors! Try the back one ;)
				if (fuel.getItem() == Items.OAK_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.ACACIA_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.BIRCH_DOOR){
					//you little birch!
					return 600;
				}
				if (fuel.getItem() == Items.DARK_OAK_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.JUNGLE_DOOR){
					return 600;
				}
				if (fuel.getItem() == Items.SPRUCE_DOOR){
					return 600;
				}
				//Buttons
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.WOODEN_BUTTON)){
					return 300;
				}
				if (fuel.getItem() == Items.BOWL){
				//Actual calculation here was 225 but I rounded.
					return 240;
				}
				//Updated boat handler to 1.9 to include different woods.
				if (fuel.getItem() == Items.BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.ACACIA_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.BIRCH_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.DARK_OAK_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.JUNGLE_BOAT){
					return 1500;
				}
				if (fuel.getItem() == Items.SPRUCE_BOAT){
					return 1500;
				}
				//End of new boat handling procedure
				if (fuel.getItem() == Items.REEDS){
					return 300;
				}
				if (fuel.getItem() == Items.PAPER){
					return 300;
				}
				if (fuel.getItem() == Items.BOOK) {
					return 1000;
				}
				if (fuel.getItem() == Items.WRITABLE_BOOK){
					//unwritten writable book
					return 1120;
				}
				if (fuel.getItem() == Items.WRITTEN_BOOK){
					//already written writable book
					return 1120;
				}
				if (fuel.getItem() == Items.CHEST_MINECART){
				//Vanilla chest only burns for 300 Ticks.
					return 400;
				}
				//Maps, all 200 ticks
				if (fuel.getItem() == Items.MAP){
					return 2500;
				}
				if (fuel.getItem() == Items.FILLED_MAP){
					return 2500;
				}
				//Fishing Rods and Carrot on a Stick.
				if (fuel.getItem() == Items.FISHING_ROD){
					return 320;
				}
				if (fuel.getItem() == Items.CARROT_ON_A_STICK){
					return 340;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TALLGRASS)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.BROWN_MUSHROOM_BLOCK)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.RED_MUSHROOM_BLOCK)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				//Armor stands
				if (fuel.getItem() == Items.ARMOR_STAND){
					return 620;
				}
				//Easter egg. Commented for now....because its pretty darn illogical tbh.
				//if (fuel.getItem() == Items.saddle){
				//	return 1000000;
				//}
				//Now for some weird misc. things
				if (fuel.getItem() == Items.FIRE_CHARGE){
				//Actual calculation here was 1466.66~ but I rounded.
					return 1480;
				}
				if (fuel.getItem() == Items.FIREWORK_CHARGE){
					return 3220;
				}
				if (fuel.getItem() == Items.FIREWORKS){
					return 5120;
				}
				if (fuel.getItem() == Items.GUNPOWDER){
					return 1600;
				}
				if (fuel.getItem() == Items.BLAZE_POWDER){
					return 1200;
				}
				if (fuel.getItem() == Items.MAGMA_CREAM){
					return 2000;
				}
				if (fuel.getItem() == Items.GHAST_TEAR){
					return 2000;
				}
				//Attempt to implement spawn eggs as being burnable...idk why.
				if (fuel.getItem() == Items.SPAWN_EGG){
					return 5000;
				}
				//Stupid stuff made burn-able just so we can get rid of it.
				if (fuel.getItem() == Items.POISONOUS_POTATO){
					return 100;
				}
				if (fuel.getItem() == Items.ROTTEN_FLESH){
					return 100;
				}
				if (fuel.getItem() == Items.SPIDER_EYE){
					return 100;
				}
				if (fuel.getItem() == Items.FERMENTED_SPIDER_EYE){
					return 220;
				}
				if (fuel.getItem() == Items.RABBIT_FOOT){
					return 200;
				}
				//Lets make all leather burnable...it makes some sense.
				//All leather items ticks are calculated by multiplying the base tick.
				//Working on being able to burn damaged leather.
				if (fuel.getItem() == Items.LEATHER){
					return 100;
				}
				if (fuel.getItem() == Items.LEATHER_BOOTS){
					return 400;
				}
				if (fuel.getItem() == Items.LEATHER_CHESTPLATE){
					return 800;
				}
				if (fuel.getItem() == Items.LEATHER_HELMET){
					return 500;
				}
				if (fuel.getItem() == Items.LEATHER_LEGGINGS){
					return 700;
				}
				//Adding 1.9 Stuff
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_PLANT)){
					return 600;
				}
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.CHORUS_FLOWER)){
					return 600;
				}
				if (fuel.getItem() == Items.SHIELD){
					return 1820;
				}
				if (fuel.getItem() == Items.DRAGON_BREATH){
					return 2060;
				}
				//Adding TNT
				if (fuel.getItem() == Item.getItemFromBlock(Blocks.TNT)){
					return 8080;
				}
				//Adding Minecart with TNT
				if (fuel.getItem() == Items.TNT_MINECART){
					return 8180;
				}
				if (fuel.getItem() == ModItems.pelletsFuel){
					return 1000;
				}
				return 0;
	}
}