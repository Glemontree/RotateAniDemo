package com.glemontree.rotateanidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;

public class RotateAni extends AppCompatActivity {
    private LinearLayout llRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        llRotate = (LinearLayout) findViewById(R.id.ll_rotate);
        beginAnimation();
    }

    private void beginAnimation() {
        RotateAnimation rotate = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 2f,
                RotateAnimation.RELATIVE_TO_SELF, 2f);

        rotate.setDuration(3000);
        llRotate.startAnimation(rotate);
    }
}
