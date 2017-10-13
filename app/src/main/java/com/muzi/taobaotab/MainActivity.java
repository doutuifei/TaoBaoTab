package com.muzi.taobaotab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();//fragment列表
    private List<String> stringList = new ArrayList<>();//tab名的列表
    private MyFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        getData();

        for (int i = 0; i < stringList.size(); i++) {
            tabLayout.addTab(tabLayout.newTab().setText(stringList.get(i)));
        }

        adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, stringList);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void getData() {
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());
        fragmentList.add(new TypeFragment());

        stringList.add("16:00\n拍卖结束");
        stringList.add("17:00\n疯狂抢购中");
        stringList.add("18:00\n即将开始");
        stringList.add("19:00\n即将开始");
        stringList.add("20:00\n即将开始");
        stringList.add("21:00\n即将开始");
        stringList.add("22:00\n即将开始");
        stringList.add("23:00\n即将开始");
    }
}
