package com.example.philipphiri.hackgsuanthemapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton one, two, three, four, five;
    private boolean butOne, butTwo, butThree, butFour, butFive;
    private List<ImageButton> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (ImageButton) findViewById(R.id.imageButton1);
        findViewById(R.id.imageButton1).setOnClickListener(this);
        two = (ImageButton) findViewById(R.id.imageButton2);
        findViewById(R.id.imageButton2).setOnClickListener(this);
        three = (ImageButton) findViewById(R.id.imageButton3);
        findViewById(R.id.imageButton3).setOnClickListener(this);
        four = (ImageButton) findViewById(R.id.imageButton4);
        findViewById(R.id.imageButton4).setOnClickListener(this);
        five = (ImageButton) findViewById(R.id.imageButton5);
        findViewById(R.id.imageButton5).setOnClickListener(this);

        buttons = new ArrayList<>();
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);

        butOne = true;
        butTwo = true;
        butThree = true;
        butFour = true;
        butFive = true;


//
//
//        one.setOnClickListener(new View.OnClickListener()
//        {
//
//            @Override
//            public void onClick(View v) {
//                if (off) {
//                    float x = (float) 1.25;
//                    float y = (float) 1.25;
//
//                    one.setScaleX(x);
//                    one.setScaleY(y);
//                    one.setBackgroundResource(R.drawable.one);
//                    off = false;
//                } else {
//                    float x = 1;
//                    float y = 1;
//
//                    one.setScaleX(x);
//                    one.setScaleY(y);
//                    one.setBackgroundResource(R.drawable.one);
//
//
//                    off = true;
//                }
//            }
//        });
//
//
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageButton1) {
           enlarge(one, R.drawable.one, R.id.imageButton1, butOne);
            butOne = !butOne;
            butTwo = true;
            butThree = true;
            butFour = true;
            butFive = true;
        } else if (view.getId() == R.id.imageButton2) {
            enlarge(two, R.drawable.two, R.id.imageButton2, butTwo);
            butOne = true;
            butTwo = !butTwo;
            butThree = true;
            butFour = true;
            butFive = true;
        } else if (view.getId() == R.id.imageButton3) {
            enlarge(three, R.drawable.three, R.id.imageButton3, butThree);
            butOne = true;
            butTwo = true;
            butThree = !butThree;
            butFour = true;
            butFive = true;
        } else if (view.getId() == R.id.imageButton4) {
            enlarge(four, R.drawable.four, R.id.imageButton4, butFour);
            butOne = !true;
            butTwo = true;
            butThree = true;
            butFour = !butFour;
            butFive = true;
        } else if (view.getId() == R.id.imageButton5) {
            enlarge(five, R.drawable.five, R.id.imageButton5, butFive);
            butOne = true;
            butTwo = true;
            butThree = true;
            butFour = true;
            butFive = !butFive;
        }

    }

    private void enlarge(ImageButton but, int background, int idd, boolean bbutton)  {
        Log.d("BUTTON!", bbutton + " ");
        if (bbutton) {
            float x = (float) 1.25;
            float y = (float) 1.25;

            but.setScaleX(x);
            but.setScaleY(y);
            but.setBackgroundResource(background);
        } else {
            float x = 1;
            float y = 1;

            but.setScaleX(x);
            but.setScaleY(y);
            but.setBackgroundResource(background);
        }

        for(ImageButton button: buttons) {
            if(button.getId() != idd) {
                float x = 1;
                float y = 1;

                button.setScaleX(x);
                button.setScaleY(y);
                //button.setBackgroundResource(background);
            }
        }
    }

}
