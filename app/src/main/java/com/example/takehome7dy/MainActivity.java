package com.example.takehome7dy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Page Yo!");
    }

    public void startActivity(View view) {
        Intent intent=new Intent(this,Second.class);
        startActivity(intent);
    }
}

