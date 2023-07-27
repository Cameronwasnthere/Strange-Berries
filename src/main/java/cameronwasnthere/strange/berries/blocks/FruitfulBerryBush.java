package cameronwasnthere.strange.berries.blocks;

import java.util.Random;

import cameronwasnthere.strange.berries.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class FruitfulBerryBush extends SweetBerryBushBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE = Properties.AGE_3;
    final Random rdm = new Random();

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        final int rdmBerry = rdm.nextInt(2);
        if (rdmBerry == 0) {
            return new ItemStack(ModItems.HEALING_BERRIES);
        }
        else {
            return new ItemStack(ModItems.REGENERATION_BERRIES);
        }
     }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int age = state.get(AGE);
        boolean bl = age == 3;
        final int rdmBerry = rdm.nextInt(2);
        if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL) && rdmBerry == 0) {
           return ActionResult.PASS; 
        }
        else if (age > 1) {
           int amount = 1 + world.random.nextInt(2);
           if (rdmBerry == 0) {
            dropStack(world, pos, new ItemStack(ModItems.HEALING_BERRIES, amount + (bl ? 1 : 0)));
           }
           else {
            dropStack(world, pos, new ItemStack(ModItems.REGENERATION_BERRIES, amount + (bl ? 1 : 0)));
           }
           world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
           world.addParticle(ParticleTypes.HEART, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.2D, (double)pos.getZ() + 0.5D, 24.0D, 0.0D, 0.0D);
           world.setBlockState(pos, state.with(AGE, 1), 2);
           return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    public boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.GRASS_BLOCK) || floor.isOf(Blocks.DIRT) || floor.isOf(Blocks.COARSE_DIRT);
     }
 
    public FruitfulBerryBush(AbstractBlock.Settings settings) {
        super(settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
            entity.slowMovement(state, new Vec3d(0.800000011920929D, 0.75D, 0.800000011920929D));
            if (state.get(AGE) > 2) {
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40));
                ((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 40));
            }
        }
    }
}