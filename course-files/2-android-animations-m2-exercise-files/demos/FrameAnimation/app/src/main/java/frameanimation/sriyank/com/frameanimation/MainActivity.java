package frameanimation.sriyank.com.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startFrameAnimation(View view) {
        ImageView dummyFrame = (ImageView) findViewById(R.id.imageFrame);

        dummyFrame.setBackgroundResource(R.drawable.frame);

        AnimationDrawable frameAnimation = (AnimationDrawable) dummyFrame.getBackground();

        if (frameAnimation.isRunning()) {
            frameAnimation.stop();
        } else {
            frameAnimation.stop();
            frameAnimation.start();
        }


    }


}
