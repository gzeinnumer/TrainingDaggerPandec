package com.gzeinnumer.trainingdaggerpandec;

import com.gzeinnumer.trainingdaggerpandec.dagger.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

//todo 2
public class MyApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return null;
        //todo 6 komentarkan yang diatas
            return DaggerAppComponent.builder().application(this).build();
        //end todo 6
    }
}
