package com.gzeinnumer.trainingdaggerpandec;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.gzeinnumer.trainingdaggerpandec.util.UtilsHelper.myLogD;

//todo 27
@Singleton
public class RepositoryExample {
    private static final String TAG = "RepositoryExample";

    private SessionManager sessionManager;
    private Context context;

    @Inject
    RepositoryExample(Context context, SessionManager sessionManager){
        this.context = context;
        this.sessionManager = sessionManager;
    }

    public void exampleFunction(){
        Toast.makeText(context, "exampleFunction", Toast.LENGTH_SHORT).show();
        myLogD(TAG, "exampleFunction : "+ sessionManager.getId());
    }
}
