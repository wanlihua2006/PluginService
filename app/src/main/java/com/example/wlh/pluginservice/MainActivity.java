package com.example.wlh.pluginservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_hook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_hook = findViewById(R.id.btn_hook);
        btn_hook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "start target service", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,TargetService.class);
                startService(intent);
            }
        });
    }
}

/**
 * 2019-07-16 23:18:08.187 29249-29249/com.example.wlh.pluginservice D/IActivityManagerProxy: wanlihua debug hook startService ok
 * 2019-07-16 23:18:08.226 29249-29249/com.example.wlh.pluginservice D/ProxyService: wanlihua debug work here? ProxyService
 * 2019-07-16 23:18:08.227 29249-29249/com.example.wlh.pluginservice D/TargetService: wanlihua debug TargetService onCreate!
 * 2019-07-16 23:18:08.227 29249-29249/com.example.wlh.pluginservice D/TargetService: wanlihua debug TargetService onStartCommand!
 **/