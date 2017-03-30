package me.sugarkawhi.animationdemo;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TranslationActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void translationX(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "translationX", 50, -30, 20, -10, 0);
        animator.setDuration(1000);
        animator.start();
    }

    public void translationY(View view) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(iv, "translationY", 50, -30, 20, -10, 0);
        animator.setDuration(1000);
        animator.start();
    }
}
