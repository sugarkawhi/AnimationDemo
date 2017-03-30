package me.sugarkawhi.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scale(View view) {
        Intent intent = new Intent(this,ScaleActivity.class);
        startActivity(intent);
    }

    public void translation(View view) {
        Intent intent = new Intent(this, TranslationActivity.class);
        startActivity(intent);
    }

    public void rotation(View view) {
        Intent intent = new Intent(this,RotationActivity.class);
        startActivity(intent);
    }

    public void alpha(View view) {
        Intent intent = new Intent(this,AlphaActivity.class);
        startActivity(intent);
    }
}
