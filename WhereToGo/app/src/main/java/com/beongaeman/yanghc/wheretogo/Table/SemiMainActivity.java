package com.beongaeman.yanghc.wheretogo.Table;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.beongaeman.yanghc.wheretogo.R;

/**
 * Created by 조연희 on 2017-08-16.
 */

public class SemiMainActivity extends AppCompatActivity {
    private Context context;
    private Intent intent;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semimain);
        context = this;
        intent = getIntent();
        activity = this;

        initViews();
    }


    private void initViews(){
    }
}
