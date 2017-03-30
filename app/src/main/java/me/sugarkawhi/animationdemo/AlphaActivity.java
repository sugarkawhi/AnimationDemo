package me.sugarkawhi.animationdemo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlphaActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        iv = (ImageView) findViewById(R.id.iv);

    }

    public void alpha(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "alpha", 1.0f, 0.3f, 0.7f, 1.0f);
        animator.setDuration(2000);
        animator.start();
    }
}
