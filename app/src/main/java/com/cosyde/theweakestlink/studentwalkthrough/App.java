package com.cosyde.theweakestlink.studentwalkthrough;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by mobile1 on 7/26/15.
 */
public class App extends Application {

    // APPLICATION_CONSTANTS
    private static Context mContext;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor spEditor;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        spEditor = sharedPreferences.edit();
    }

    public void toast(String message) {
        // pantamad lang to hehe
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

    public static boolean isOnline() {
        // returns true if user is connected to the internet
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkinfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkinfo != null && activeNetworkinfo.isConnected();
    }

    public void cameraIsAvailable() {

    }

    public static void pushToPrefs(String key, String value) {
        spEditor.putString(key, value);
        spEditor.apply();
    }

    public static void pushToPrefs(String key, int value) {
        spEditor.putInt(key, value);
        spEditor.apply();
    }

    public void sOut(String s) {
        System.out.println(s);
    }

}


