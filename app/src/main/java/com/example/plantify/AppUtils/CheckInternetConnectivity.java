package com.example.plantify.AppUtils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckInternetConnectivity {

    /* To Check Internet Connectivity reachable or not*/
    //returns true if internet is connected
    public static boolean isInternet(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

/*    //to check firebase is reachable or not
    public static boolean isServer() {
        return true;
    }*/
}