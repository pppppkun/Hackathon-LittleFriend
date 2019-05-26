package com.example.p.helloworld;

import android.os.Bundle;
import android.util.Log;
import com.example.p.helloworld.non_activity.BaseActivity;

public class HelloWorldActivity extends BaseActivity {

    private static final String TAG = "HelloWorldActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d("data","onCreate execute");
    }
}
