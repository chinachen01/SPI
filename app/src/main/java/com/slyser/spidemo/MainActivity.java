package com.slyser.spidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.slyser.lib.MessageService;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceLoader<MessageService> serviceServiceLoader = ServiceLoader.load(MessageService.class);
        for (MessageService messageService : serviceServiceLoader) {
            Log.d("auto service", "msg:" + messageService.getMessage());
        }
    }
}
