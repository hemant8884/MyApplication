package com.example.design115.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //call next activity
        callNextActivity();
    }
    public void  callNextActivity()
    {
        Thread time=new Thread()
        {
            @Override
            public void run() {
                try {
                       sleep(5*1000);
                       Intent intent=new Intent(getBaseContext(),Login.class);
                       startActivity(intent);
                       finish();
                }
                catch (Exception ex)
                {

                }
            }
        };
        time.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
