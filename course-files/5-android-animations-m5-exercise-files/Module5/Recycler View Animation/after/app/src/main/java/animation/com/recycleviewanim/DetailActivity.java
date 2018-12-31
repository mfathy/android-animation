package animation.com.recycleviewanim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailActivity extends AppCompatActivity{


    private ArrayList<Data.Information> mData = new Data().getData();

    private int mPosition;

    private ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        mImageView = (ImageView) findViewById(R.id.detailImage);

        mPosition = getIntent().getIntExtra("position", 0);

        mImageView.setImageResource(mData.get(mPosition).ItemId);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCircularRevealAnim(mImageView, mPosition);
            }
        });




    }

    private void performCircularRevealAnim(View view, int position) {

        final TextView textDesc = (TextView) findViewById(R.id.textDescription);

        int centerX = (view.getLeft() + view.getRight()) / 2; // Center point of Image width along X-axis
        int centerY = (view.getTop() + view.getBottom()) / 2; // Center point of Image height long Y-axis

        float radius = Math.max(textDesc.getWidth(), textDesc.getHeight()) * 2.0f;

        if (textDesc.getVisibility() == View.INVISIBLE) { // When TextView is Invisible
            textDesc.setVisibility(View.VISIBLE);
            textDesc.setText(mData.get(position).title);

            ViewAnimationUtils.createCircularReveal(textDesc, centerX, centerY, 0, radius).start();

        } else {    // When TextView is Visible

            Animator reveal = ViewAnimationUtils.createCircularReveal(
                    textDesc, centerX, centerY, radius, 0);

            reveal.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    textDesc.setVisibility(View.INVISIBLE);
                }
            });
            reveal.start();
        }
    }



}
