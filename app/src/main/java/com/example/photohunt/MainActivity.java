package com.example.photohunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.photohunt.Picture.Picture1;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startButton = (Button) findViewById(R.id.startBtt);
        setContentView(R.layout.activity_main);
    }

    public void startClick(View view){
        finish();
        Intent intent = new Intent(this,Picture1.class);
        startActivity(intent);

    }

    public void aboutClick(View view){
        finish();
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }

    public void exitClick(View view){
        finish();
        System.exit(0);
    }
}
