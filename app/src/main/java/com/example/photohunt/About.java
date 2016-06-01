package com.example.photohunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.photohunt.Picture.Picture1;

public class About extends AppCompatActivity {

    Button returnBtt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        returnBtt = (Button) findViewById(R.id.aboutBtt);
    }

    public void returnClick (View view){
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
