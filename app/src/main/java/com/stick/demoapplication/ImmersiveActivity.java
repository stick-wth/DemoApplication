package com.stick.demoapplication;

import android.graphics.Color;
import android.os.Build;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;


public class ImmersiveActivity extends BaseImmersiveActivity {

    private static final String TAG = "IMMERSIVEACT";
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immersive);
        toolbar = findViewById(R.id.immersive_toolbar);
        toolbar.setBackgroundColor(Color.RED);
        //setFullScreen(this,Color.RED);
    }

    public void immersive_btnClick(View v) {

        switch (v.getId()) {
            case R.id.btn_rel_immersive:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    View decorView = getWindow().getDecorView();
                    decorView.setSystemUiVisibility(
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
                }
                break;
            case R.id.btn_rel_immersive_exit:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    Window window = getWindow();
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(
                            0);
                }
                break;
            case R.id.btn_immersive_status:
                toolbar.setBackgroundColor(Color.YELLOW);
                setFullScreenWithViewGroup(Color.YELLOW, (ViewGroup) toolbar.getParent());
                break;
            case R.id.btn_immersive_status_exit:
                Window window = getWindow();
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(
                        0);
                break;
        }
    }
}
