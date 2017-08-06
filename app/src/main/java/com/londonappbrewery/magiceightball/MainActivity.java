package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        //each different answer that appears on the ball(array to hold different ball array images from drawable folder)
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        final Button myButton = (Button) findViewById(R.id.askButton);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //Every "Ask" button is pressed, the 8 ball gives an swer from the array
            public void onClick(View v) {
                Log.d("Dicee", "Ze button has been pressed");
                Random randomNumbergenerator = new Random();
                int number = randomNumbergenerator.nextInt(5);


                ballDisplay.setImageResource(ballArray[number]);//want to put a randomnumber to get from array
            }

        });
    }

}

