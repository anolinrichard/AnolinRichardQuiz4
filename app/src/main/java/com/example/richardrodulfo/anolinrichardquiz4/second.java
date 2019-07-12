package com.example.richardrodulfo.anolinrichardquiz4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class second extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtName = findViewById(R.id.tvName);
        txtPassword = findViewById(R.id.tvPassword);
    }

    public void onReturn (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void onLogin(View v) {
        FileInputStream fis = null;
        StringBuffer buffer = new StringBuffer();
        int letter = 0;
        try {
            File file = new File(getExternalFilesDir(null), "user2.text"); //matic na siya na hahanap ng pat
            fis = new FileInputStream(file);
            while ((letter = fis.read()) != -1) {
                buffer.append((char) letter);
            }
            Toast.makeText(this, buffer.toString(), Toast.LENGTH_LONG).show();
            /* firstLetter = "" + (char)fis.read();*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        txtName.setText(buffer.substring(0, buffer.indexOf(",")));
        txtPassword.setText(buffer.substring(buffer.indexOf(",") + 1));


        Intent i2 = new Intent(this, third.class);
        startActivity(i2);
    }
    }
