package me.sugarkawhi.animationdemo;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScaleActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void scaleX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "scaleX", 1.0f, 2.0f, 1.0f);
        animator.setDuration(600);
        animator.start();
    }

    public void scaleY(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "scaleY", 1.0f, 2.0f, 1.0f);
        animator.setDuration(600);
        animator.start();
    }
}
