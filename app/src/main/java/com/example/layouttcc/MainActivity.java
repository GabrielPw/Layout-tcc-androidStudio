package com.example.layouttcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.layouttcc.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_main);
    }

    public void servicosAct(View view){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}