package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button per;
    public String[] permission;
    private static final int enable = 0;
    private static final int discover = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        per = findViewById(R.id.per);

        permission = new String[]{
                Manifest.permission.ACCESS_BACKGROUND_LOCATION,
                Manifest.permission.BLUETOOTH_CONNECT,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA
        };
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                requestPermissions(permission,discover);
            }

        });
    }
}