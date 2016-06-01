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

public class Picture2 extends AppCompatActivity {

    private ImageView imgA;
    private ImageView imgB;

    private TextView timer;
    private CountDownTimer mCountDownTimer;

    private ImageButton imgBtt2_1;
    private ImageButton imgBtt2_2;
    private ImageButton imgBtt2_3;
    private ImageButton imgBtt2_4;
    private ImageButton imgBtt2_5;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture2);

        imgA = (ImageView) findViewById(R.id.img2A);
        imgB = (ImageView) findViewById(R.id.img2B);
        timer = (TextView) findViewById(R.id.timer);
        imgA.setImageResource(R.drawable.b_1);
        imgB.setImageResource(R.drawable.b_2);

        imgBtt2_1 = (ImageButton) findViewById(R.id.imgBtt2_1);
        imgBtt2_2 = (ImageButton) findViewById(R.id.imgBtt2_2);
        imgBtt2_3 = (ImageButton) findViewById(R.id.imgBtt3_3);
        imgBtt2_4 = (ImageButton) findViewById(R.id.imgBtt2_4);
        imgBtt2_5 = (ImageButton) findViewById(R.id.imgBtt2_5);

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

    public void onPic2 (View view){

        if (view == imgBtt2_1 && imgBtt2_1.isEnabled() == true){
            imgBtt2_1.setBackgroundResource(R.drawable.circle);
            imgBtt2_1.setEnabled(false);
            count++;
        } else if (view == imgBtt2_2 && imgBtt2_2.isEnabled() == true){
            imgBtt2_2.setBackgroundResource(R.drawable.circle);
            imgBtt2_2.setEnabled(false);
            count++;
        } else if (view == imgBtt2_3 && imgBtt2_3.isEnabled() == true){
            imgBtt2_3.setBackgroundResource(R.drawable.circle);
            imgBtt2_3.setEnabled(false);
            count++;
        } else if (view == imgBtt2_4 && imgBtt2_4.isEnabled() == true){
            imgBtt2_4.setBackgroundResource(R.drawable.circle);
            imgBtt2_4.setEnabled(false);
            count++;
        } else if (view == imgBtt2_5 && imgBtt2_5.isEnabled() == true){
            imgBtt2_5.setBackgroundResource(R.drawable.circle);
            imgBtt2_5.setEnabled(false);
            count++;
        }

        if (count == 5){
            mCountDownTimer.cancel();
            finish();
            Intent intent = new Intent(this,Picture3.class);
            startActivity(intent);
        }


    }
}
