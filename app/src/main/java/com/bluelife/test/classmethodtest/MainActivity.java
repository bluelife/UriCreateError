package com.bluelife.test.classmethodtest;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler;
    private HandlerThread mThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);

        mThread = new HandlerThread("ActionHandleThread");
        mThread.start();
        mHandler = new Handler(mThread.getLooper());
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                URI.create("http://maps.google.com/maps/geo?q = 0.0,0.0&output = responseText&sensor = true");
            }
        });

    }

}
