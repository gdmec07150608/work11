package com.example.dzq.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MyActivity","onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        Log.v("MyActivity","onStart方法被执行");
    }
    protected void onResume(){
        Log.v("MyActivity","onResume方法被执行");
    }
    protected void onPause(){
        Log.v("MyActicvity","onPause方法被执行");
    }
    protected void onStop(){
        Log.v("MyActicvity","onStop方法被执行");
    }
    protected void onRestart(){
        Log.v("MyActicvity","onRestart方法被执行");
    }
    protected void onDestory(){
        Log.v("MyActicvity","onDestory方法被执行");
    }
}




