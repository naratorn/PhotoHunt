package com.example.photohunt.Picture;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.photohunt.MainActivity;
import com.example.photohunt.R;

public class Picture1 extends AppCompatActivity {

    private ImageView imgA;
    private ImageView imgB;

    private TextView timer;
    private CountDownTimer mCountDownTimer;

    private ImageButton imgBtt1_1;
    private ImageButton imgBtt1_2;
    private ImageButton imgBtt1_3;
    private ImageButton imgBtt1_4;
    private ImageButton imgBtt1_5;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        imgA = (ImageView) findViewById(R.id.img1A);
        imgB = (ImageView) findViewById(R.id.img1B);
        timer = (TextView) findViewById(R.id.timer);
        imgA.setImageResource(R.drawable.a_1);
        imgB.setImageResource(R.drawable.a_2);


        imgBtt1_1 = (ImageButton) findViewById(R.id.imgBtt1_1);
        imgBtt1_2 = (ImageButton) findViewById(R.id.imgBtt1_2);
        imgBtt1_3 = (ImageButton) findViewById(R.id.imgBtt1_3);
        imgBtt1_4 = (ImageButton) findViewById(R.id.imgBtt1_4);
        imgBtt1_5 = (ImageButton) findViewById(R.id.imgBtt1_5);

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

    public void onPic1 (View view){

        if (view == imgBtt1_1 && imgBtt1_1.isEnabled() == true){
            imgBtt1_1.setBackgroundResource(R.drawable.circle);
            imgBtt1_1.setEnabled(false);
            count++;
        } else if (view == imgBtt1_2 && imgBtt1_2.isEnabled() == true){
            imgBtt1_2.setBackgroundResource(R.drawable.circle);
            imgBtt1_2.setEnabled(false);
            count++;
        } else if (view == imgBtt1_3 && imgBtt1_3.isEnabled() == true){
            imgBtt1_3.setBackgroundResource(R.drawable.circle);
            imgBtt1_3.setEnabled(false);
            count++;
        } else if (view == imgBtt1_4 && imgBtt1_4.isEnabled() == true){
            imgBtt1_4.setBackgroundResource(R.drawable.circle);
            imgBtt1_4.setEnabled(false);
            count++;
        } else if (view == imgBtt1_5 && imgBtt1_5.isEnabled() == true){
            imgBtt1_5.setBackgroundResource(R.drawable.circle);
            imgBtt1_5.setEnabled(false);
            count++;
        }

        if (count == 5){
            mCountDownTimer.cancel();
            finish();
            Intent intent = new Intent(this,Picture2.class);
            startActivity(intent);
        }


    }


}
