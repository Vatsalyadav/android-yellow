package com.vatsalyadav.apps.daggermvvm.di;

import com.vatsalyadav.apps.daggermvvm.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    // All the Activities need to be added here

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity(); // AuthActivity is now a potential client to inject dependencies into


}
