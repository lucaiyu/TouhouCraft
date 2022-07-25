package com.lucaiyu.touhoucraft.item;

import com.lucaiyu.touhoucraft.gui.OpenGuideBook;
import com.lucaiyu.touhoucraft.init.TabInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class GuideBook extends Item {
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.isRemote){
            DistExecutor.safeCallWhenOn(Dist.CLIENT, ()-> OpenGuideBook::new);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public GuideBook(){
        super(new Properties().group(TabInit.touhouGroup));
    }
}
