package com.gzeinnumer.trainingdaggerpandec.dagger;

import com.gzeinnumer.trainingdaggerpandec.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//todo 7
@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();
}
