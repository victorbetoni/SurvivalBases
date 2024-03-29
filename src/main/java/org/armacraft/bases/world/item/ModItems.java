package org.armacraft.bases.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.armacraft.bases.SurvivalBases;
import org.armacraft.bases.world.block.ModBlocks;
import org.armacraft.bases.world.structure.ModStructureTemplates;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SurvivalBases.MODID);

    public static final RegistryObject<StructureItem> CONCRETE_WALL_STRUCTURE =
            ITEMS.register("concrete_wall",
                    () -> new StructureItem((StructureItem.Properties) new StructureItem.Properties()
                            .setMaterialBlock(ModBlocks.CONCRETE_BLOCK.get())
                            .setTemplate(ModStructureTemplates.WALL_2X3.get())
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<StructureItem> CONCRETE_DOOR_STRUCTURE =
            ITEMS.register("concrete_door",
                    () -> new StructureItem((StructureItem.Properties) new StructureItem.Properties()
                            .setMaterialBlock(ModBlocks.CONCRETE_BLOCK.get())
                            .setTemplate(ModStructureTemplates.DOOR.get())
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));
}
