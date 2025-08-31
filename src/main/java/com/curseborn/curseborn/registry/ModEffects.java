package com.curseborn.curseborn.registry;

import com.curseborn.curseborn.Curseborn;
import com.curseborn.curseborn.effect.VampireMobEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Curseborn.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> VAMPIRE = MOB_EFFECTS.register("vampire", VampireMobEffect::new);
}
