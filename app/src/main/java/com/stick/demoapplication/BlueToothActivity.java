package com.stick.demoapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BlueToothActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, BlueToothActivity.class);
//        starter.putExtra();
        context.startActivity(starter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_tooth);

    }
}
