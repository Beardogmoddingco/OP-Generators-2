
package net.mcreator.opgenerators.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.opgenerators.OpGeneratorsModElements;

@OpGeneratorsModElements.ModElement.Tag
public class BlackDiamondAxeItem extends OpGeneratorsModElements.ModElement {
	@ObjectHolder("op_generators_:black_diamond_axe")
	public static final Item block = null;
	public BlackDiamondAxeItem(OpGeneratorsModElements instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BlackDiamondItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("black_diamond_axe"));
	}
}
