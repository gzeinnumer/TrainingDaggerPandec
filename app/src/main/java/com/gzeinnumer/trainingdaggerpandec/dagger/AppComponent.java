package com.gzeinnumer.trainingdaggerpandec.dagger;

import android.app.Application;

import com.gzeinnumer.trainingdaggerpandec.MyApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

//todo 4
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                //todo 8
                ActivityBuildersModule.class,
                //end todo 8
                //todo 11
                AppModule.class
                //end todo 11
        }
)
public interface AppComponent extends AndroidInjector<MyApp> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}

//todo 5 rebuild