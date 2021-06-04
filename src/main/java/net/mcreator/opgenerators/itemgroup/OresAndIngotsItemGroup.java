
package net.mcreator.opgenerators.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.opgenerators.block.BlackIronOreBlock;
import net.mcreator.opgenerators.OpGeneratorsModElements;

@OpGeneratorsModElements.ModElement.Tag
public class OresAndIngotsItemGroup extends OpGeneratorsModElements.ModElement {
	public OresAndIngotsItemGroup(OpGeneratorsModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabores_and_ingots") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlackIronOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
