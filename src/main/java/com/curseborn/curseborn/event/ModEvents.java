package com.curseborn.curseborn.event;

import com.curseborn.curseborn.Curseborn;
import com.curseborn.curseborn.registry.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;

@EventBusSubscriber(modid = Curseborn.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onEffectApplicable(MobEffectEvent.Applicable event) {
        if (event.getEffectInstance().getEffect() == ModEffects.VAMPIRE.get() && !(event.getEntity() instanceof Player)) {
            // Not cancelable; remove immediately after addition instead
        }
    }
    @SubscribeEvent
    public static void onEffectAdded(MobEffectEvent.Added event) {
        if (event.getEffectInstance().getEffect() == ModEffects.VAMPIRE.get() && !(event.getEntity() instanceof Player)) {
            MobEffect effect = ModEffects.VAMPIRE.get();
            Holder<MobEffect> holder = BuiltInRegistries.MOB_EFFECT.wrapAsHolder(effect);
            event.getEntity().removeEffect(holder);
        }
    }
}
