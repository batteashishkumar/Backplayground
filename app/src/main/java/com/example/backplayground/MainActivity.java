package com.example.backplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
static MainActivity x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=this;
//        Async_back async_back=new Async_back();
//        async_back.execute();
    }
 static    MainActivity getInstance(){return x; }
}
