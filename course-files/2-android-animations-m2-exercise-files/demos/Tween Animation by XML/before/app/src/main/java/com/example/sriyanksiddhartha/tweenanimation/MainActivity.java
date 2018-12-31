package com.example.sriyanksiddhartha.tweenanimation;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
    private ImageView mImageView;

    private Animation mRotateAnim;
    private Animation mScaleAnim;
    private Animation mTranslateAnim;
    private Animation mAlphaAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.volleyball);
    }


    public void scaleAnimation(View view) {

        mScaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        mImageView.startAnimation(mScaleAnim);
    }

    public void translateAnimation(View view) {

        mTranslateAnim = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        mImageView.startAnimation(mTranslateAnim);
    }

    public void alphaAnimation(View view) {
        mAlphaAnim = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mImageView.startAnimation(mAlphaAnim);
    }

    public void rotateAnimation(View view) {

        mRotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        mImageView.startAnimation(mRotateAnim);
    }




}
