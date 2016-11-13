package com.example.pablo.testancome;

import android.app.Application;

import edu.puc.astral.CloudManager;

/**
 * Created by Pablo on 11/13/2016.
 */
public class MainApplication extends Application {
    private static final String HOST_IP = "35.162.189.56";
    private static final String SENDER_ID = "458767247936";

    @Override
    public void onCreate() {
        super.onCreate();

        CloudManager.initialize(this, SENDER_ID, HOST_IP);
    }
}
