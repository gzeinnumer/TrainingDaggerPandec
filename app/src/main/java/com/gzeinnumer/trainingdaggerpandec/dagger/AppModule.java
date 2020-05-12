package com.gzeinnumer.trainingdaggerpandec.dagger;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.gzeinnumer.trainingdaggerpandec.SessionManager;
import com.gzeinnumer.trainingdaggerpandec.network.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//todo 10
@Module
class AppModule {

    //todo 12
    @Singleton
    @Provides
    static String providesString(){
        return "ProvideString";
    }//end todo 12

    //todo 15
    @Singleton
    @Provides
    static Context provideContext(Application application){
        return application.getApplicationContext();
    }//end todo 15

    //todo 20
    @Provides
    @Singleton
    static Retrofit providesRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static ApiService providesApiService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }//end todo 20

    //todo 24
    @Singleton
    @Provides
    static SessionManager providesSessionManager(Context context){
        return new SessionManager(context);
    }
    //end todo 24
}
