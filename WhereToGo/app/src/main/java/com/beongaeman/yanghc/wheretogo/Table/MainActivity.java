package com.beongaeman.yanghc.wheretogo.Table;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;

import com.beongaeman.yanghc.wheretogo.ExitDialog;
import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.Table.Fragment.TableFragment;
import com.beongaeman.yanghc.wheretogo.VO.Table;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static Context context;
    public static Intent intent;
    public static Activity activity;


    private FrameLayout layout;
    private Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        intent = getIntent();
        activity = this;

        initViews();
    }

    private void initViews(){
        layout = (FrameLayout) findViewById(R.id.layout_home);

        homeBtn = (Button) findViewById(R.id.btn_main_home);
        homeBtn.setOnClickListener(this);

        addFragment(new TableFragment());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_home:
                //TODO: go to home

                break;
        }
    }

    public void addFragment(android.support.v4.app.Fragment fragment) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left, 0, 0);
        ft.replace(R.id.layout_home, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void switchFragment(android.support.v4.app.Fragment fragment) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left, 0, 0);
        ft.replace(R.id.layout_home, fragment);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            ExitDialog exitDialog = new ExitDialog(this);
            exitDialog.show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        context = null;
        intent = null;
        activity = null;

        System.gc();
    }
}
