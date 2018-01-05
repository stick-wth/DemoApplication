package com.stick.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main_btnClick(View v){
        switch (v.getId()){
            case R.id.btn_immersive:
                startActivity(new Intent(this,ImmersiveActivity.class));
                break;
            case R.id.btn_ToBNAct:
                startActivity(new Intent(this,BottomNavigationActivity.class));
                break;
            case R.id.btn_ToNDAct:
                startActivity(new Intent(this,NavigationDrawerActivity.class));
                break;
        }
    }
}
