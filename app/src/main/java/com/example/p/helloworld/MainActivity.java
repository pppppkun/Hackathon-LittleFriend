package com.example.p.helloworld;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.example.p.helloworld.non_activity.BaseActivity;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends BaseActivity implements
        FragmentOne.OnFragmentInteractionListener,
        FragmentTwo.OnFragmentInteractionListener,
        FragmentThree.OnFragmentInteractionListener{

    BottomTabBar m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = findViewById(R.id.bottom_tab_bar);
        m.init(getSupportFragmentManager())
                .setImgSize(100, 100)
                .setFontSize(16)
                .setChangeColor(0xEE82EE, Color.GRAY)
                .setTabPadding(20, 20, 20)
                .addTabItem("搜索", R.drawable.search_default, FragmentOne.class)
                .addTabItem("答题", R.drawable.search_default, FragmentTwo.class)
                .addTabItem("用户", R.drawable.search_default, FragmentThree.class)
                .setTabBarBackgroundColor(Color.WHITE)
                .isShowDivider(true);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
