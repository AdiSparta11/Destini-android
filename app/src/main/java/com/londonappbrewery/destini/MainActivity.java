package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView text1;
    private Button b1;
    private Button b2;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        text1 = (TextView) findViewById(R.id.storyTextView);
        b1 = (Button) findViewById(R.id.buttonTop);
        b2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(mStoryIndex==1 || mStoryIndex == 2) {
                   text1.setText(R.string.T3_Story);
                   b1.setText(R.string.T3_Ans1);
                   b2.setText(R.string.T3_Ans2);
                   mStoryIndex=3;
               }else 
               {
                   text1.setText(R.string.T6_End);
                   b1.setVisibility(View.GONE);
                   b2.setVisibility(View.GONE);
               }
              }

        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    text1.setText(R.string.T2_Story);
                    b1.setText(R.string.T2_Ans1);
                    b2.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                } else if (mStoryIndex == 2) {
                    text1.setText(R.string.T4_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }
                else {
                    text1.setText(R.string.T5_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }
            }


        });
    }
}
