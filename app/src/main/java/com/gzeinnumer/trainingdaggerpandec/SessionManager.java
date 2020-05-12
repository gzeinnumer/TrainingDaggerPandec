package com.gzeinnumer.trainingdaggerpandec;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

//todo 23
public class SessionManager {
    private static final String TAG = "SessionManager";

    private static String PREF_NAME = "session";
    private static String KEY_ID = "id";

    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    public SessionManager(Context context) {
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    void setId(int id){
        editor.putInt(KEY_ID, id);
        editor.apply();
    }

    int getId(){
        return prefs.getInt(KEY_ID,0);
    }
}
