
package net.mcreator.opgenerators.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.opgenerators.item.CopperWireItem;
import net.mcreator.opgenerators.OpGeneratorsModElements;

@OpGeneratorsModElements.ModElement.Tag
public class CraftingPartsItemGroup extends OpGeneratorsModElements.ModElement {
	public CraftingPartsItemGroup(OpGeneratorsModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcrafting_parts") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperWireItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
