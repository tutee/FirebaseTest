package com.example.matias.firebasetest;

import android.app.Application;

import com.firebase.client.Firebase;


public class ToDoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
