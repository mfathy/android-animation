package propertyanimation.sriyank.com.propertyanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = (ImageView) findViewById(R.id.image);

    }

    public void rotateAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.rotate);
        anim.setTarget(mImage);
        anim.start();

    }

    public void scaleAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.scale);
        anim.setTarget(mImage);
        anim.start();

    }

    public void translateAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.translate);
        anim.setTarget(mImage);
        anim.start();

    }

    public void alphaAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.alpha);
        anim.setTarget(mImage);
        anim.start();

    }

    public void setAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.set);
        anim.setTarget(mImage);
        anim.start();

    }


}
