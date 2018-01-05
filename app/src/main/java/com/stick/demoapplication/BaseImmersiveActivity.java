package com.stick.demoapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

/**
 * Created by Administrator - stick on 2018/1/3.
 * e-mail:253139409@qq.com
 */

public class BaseImmersiveActivity extends AppCompatActivity {


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }


    public void setFullScreenWithViewGroup(int toolBarColor, ViewGroup viewGroup) {
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
           //让应用主体占据状态栏空间
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //设置透明状态栏,这样才能让 ContentView 向上
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        View statusBarView = new View(this);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                (int) getStatusBarHeight());
        statusBarView.setBackgroundColor(toolBarColor);
        viewGroup.addView(statusBarView, 0, lp);
    }

    public float getStatusBarHeight() {
        float statusBarHeight = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        statusBarHeight = getResources().getDimensionPixelSize(resourceId);
//        if (resourceId > 0) {
//            statusBarHeight = getResources().getDimensionPixelSize(resourceId);
//            final float scale = getResources().getDisplayMetrics().density;
//            statusBarHeight = statusBarHeight / scale;
//        }
        System.out.println("status_bar_height=" + statusBarHeight);
        return statusBarHeight;
    }
}
