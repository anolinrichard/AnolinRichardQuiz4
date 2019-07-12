package com.example.richardrodulfo.anolinrichardquiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onReturn (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void onLogin (View v){
        Intent i2 = new Intent(this, third.class);
        startActivity(i2);
    }
}
