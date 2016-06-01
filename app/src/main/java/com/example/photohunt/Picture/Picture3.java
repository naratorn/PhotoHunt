package com.example.photohunt.Picture;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.photohunt.MainActivity;
import com.example.photohunt.R;

public class Picture3 extends AppCompatActivity {

    private ImageView imgA;
    private ImageView imgB;

    private TextView timer;
    private CountDownTimer mCountDownTimer;

    private ImageButton imgBtt3_1;
    private ImageButton imgBtt3_2;
    private ImageButton imgBtt3_3;
    private ImageButton imgBtt3_4;
    private ImageButton imgBtt3_5;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture3);
        imgA = (ImageView) findViewById(R.id.img3A);
        imgB = (ImageView) findViewById(R.id.img3B);
        timer = (TextView) findViewById(R.id.timer);
        imgA.setImageResource(R.drawable.c_1);
        imgB.setImageResource(R.drawable.c_2);

        imgBtt3_1 = (ImageButton) findViewById(R.id.imgBtt3_1);
        imgBtt3_2 = (ImageButton) findViewById(R.id.imgBtt3_2);
        imgBtt3_3 = (ImageButton) findViewById(R.id.imgBtt3_3);
        imgBtt3_4 = (ImageButton) findViewById(R.id.imgBtt3_4);
        imgBtt3_5 = (ImageButton) findViewById(R.id.imgBtt3_5);

        mCountDownTimer = new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mCountDownTimer.cancel();
                timer.setText("time out");
                finish();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        };
        mCountDownTimer.start();
    }

    public void onPic3 (View view){

        if (view == imgBtt3_1 && imgBtt3_1.isEnabled() == true){
            imgBtt3_1.setBackgroundResource(R.drawable.circle);
            imgBtt3_1.setEnabled(false);
            count++;
        } else if (view == imgBtt3_2 && imgBtt3_2.isEnabled() == true){
            imgBtt3_2.setBackgroundResource(R.drawable.circle);
            imgBtt3_2.setEnabled(false);
            count++;
        } else if (view == imgBtt3_3 && imgBtt3_3.isEnabled() == true){
            imgBtt3_3.setBackgroundResource(R.drawable.circle);
            imgBtt3_3.setEnabled(false);
            count++;
        } else if (view == imgBtt3_4 && imgBtt3_4.isEnabled() == true){
            imgBtt3_4.setBackgroundResource(R.drawable.circle);
            imgBtt3_4.setEnabled(false);
            count++;
        } else if (view == imgBtt3_5 && imgBtt3_5.isEnabled() == true){
            imgBtt3_5.setBackgroundResource(R.drawable.circle);
            imgBtt3_5.setEnabled(false);
            count++;
        }

        if (count == 5){
            mCountDownTimer.cancel();
            finish();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }


    }
}
