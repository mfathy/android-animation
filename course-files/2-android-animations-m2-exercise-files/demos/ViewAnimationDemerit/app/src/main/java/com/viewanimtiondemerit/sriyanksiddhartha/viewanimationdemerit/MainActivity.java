package com.viewanimtiondemerit.sriyanksiddhartha.viewanimationdemerit;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mImageView = (ImageView) findViewById(R.id.dummyImage);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Image Clicked", Toast.LENGTH_SHORT).show();

            }
        });



    }


    public void translateAnimation(View view) {

        TranslateAnimation mTranslateAnim = new TranslateAnimation(

                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 0.0f,
                Animation.ABSOLUTE, 200.0f

        );
        mTranslateAnim.setDuration(1000);
        mTranslateAnim.setFillAfter(true);
        mImageView.startAnimation(mTranslateAnim);

    }



}
