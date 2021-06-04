
package net.mcreator.opgenerators.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.opgenerators.itemgroup.CompressedItemsItemGroup;
import net.mcreator.opgenerators.OpGeneratorsModElements;

@OpGeneratorsModElements.ModElement.Tag
public class CompressedOsmiumItem extends OpGeneratorsModElements.ModElement {
	@ObjectHolder("op_generators_:compressed_osmium")
	public static final Item block = null;
	public CompressedOsmiumItem(OpGeneratorsModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CompressedItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("compressed_osmium");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
