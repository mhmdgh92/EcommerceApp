package com.mhmdgh.ecommerceapp;

import android.os.Bundle;

import com.reactnativenavigation.NavigationActivity;
import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends NavigationActivity {

    protected void onCreate(Bundle savedInstanceState) {
    SplashScreen.show(this); 
    super.onCreate(savedInstanceState);
    }
}