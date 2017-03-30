package me.sugarkawhi.animationdemo;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class RotationActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void rotationY(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "rotationY", 0, 180, 0, -180, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void rotationX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "rotationX", 0, 180, 0, -180, 0);
        animator.setDuration(2000);
        animator.start();
    }

    public void rotation(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "rotation", 0, 180, 0, -180, 0);
        animator.setDuration(2000);
        animator.start();
    }
}
