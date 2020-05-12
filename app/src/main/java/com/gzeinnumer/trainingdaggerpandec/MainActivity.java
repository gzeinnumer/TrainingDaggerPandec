package com.gzeinnumer.trainingdaggerpandec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.gzeinnumer.trainingdaggerpandec.network.ApiService;
import com.gzeinnumer.trainingdaggerpandec.network.ResponsePost;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.gzeinnumer.trainingdaggerpandec.util.UtilsHelper.myLogD;

//todo 9 ubah AppCompatActivity ke DaggerAppCompatActivity
public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = "MainActivity";

    //todo 13
    @Inject
    String str;

    //todo 16
    @Inject
    Context context;

    //todo 21
    @Inject
    ApiService apiService;

    //todo 25
    @Inject
    SessionManager sessionManager;

    //todo 28
    @Inject
    RepositoryExample repositoryExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 14
        myLogD(TAG, "String Inject : "+ str);

        //todo 17
        Toast.makeText(context, "String Inject : "+ str, Toast.LENGTH_LONG).show();

        //todo 22
        apiService.getPost(1).enqueue(new Callback<List<ResponsePost>>() {
            @Override
            public void onResponse(Call<List<ResponsePost>> call, Response<List<ResponsePost>> response) {
                myLogD(TAG, "ApiService Inject(Success) : "+ response.body().size());
            }

            @Override
            public void onFailure(Call<List<ResponsePost>> call, Throwable t) {
                myLogD(TAG, "ApiService Inject(error) : "+ t.getMessage());
            }
        });

        //todo 26
//        sessionManager = new SessionManager(getApplicationContext());
        sessionManager.setId(1);
        Toast.makeText(context, String.valueOf(sessionManager.getId()), Toast.LENGTH_SHORT).show();
        myLogD(TAG, "Session Inject : "+ sessionManager.getId());

        //todo 29
//        SessionManager mySession = new SessionManager(getApplicationContext());
//        repositoryExample = new RepositoryExample(getApplicationContext(), mySession);
        repositoryExample.exampleFunction();
    }
}
