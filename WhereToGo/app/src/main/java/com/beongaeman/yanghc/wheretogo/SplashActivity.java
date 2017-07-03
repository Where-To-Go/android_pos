package com.beongaeman.yanghc.wheretogo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends Activity implements Runnable {

    //Delayed time for loading
    private static final long SPLASH_DURATION = 3000L;

    public static Context context;
    public static Intent intent;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        context = this;
        intent = ((SplashActivity) context).getIntent();
        mHandler = new Handler();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.layout_splash, new LoadingFragment());
        fragmentTransaction.commit();
    }


    @Override
    protected void onResume() {
        super.onResume();
        mHandler.postDelayed(this, SPLASH_DURATION);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(this);
    }

    @Override
    public void run() {
        switchFragment(new SignFragment());

    }

    public void addFragment(Fragment fragment) {
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left, 0, 0);
        ft.replace(R.id.layout_splash, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void switchFragment(Fragment fragment) {
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left, 0, 0);
        ft.replace(R.id.layout_splash, fragment);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        }else {
            ExitDialog exitDialog = new ExitDialog(context);
            exitDialog.show();
        }
    }

    public static void putExtra(String name, String value) {
        intent.putExtra(name, value);
    }

    public static String getExtra(String name) {
        return intent.getStringExtra(name);
    }

    public static void putIntExtra(String name, int value) {
        intent.putExtra(name, value);
    }

    public static int getIntExtra(String name) {
        return intent.getIntExtra(name, 0);
    }

}
