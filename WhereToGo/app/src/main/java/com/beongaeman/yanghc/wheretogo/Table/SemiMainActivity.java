package com.beongaeman.yanghc.wheretogo.Table;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.beongaeman.yanghc.wheretogo.ExitDialog;
import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.Splash.SplashActivity;

/**
 * Created by 조연희 on 2017-08-16.
 */

public class SemiMainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context context;
    private Intent intent;
    private Activity activity;

    private ImageButton manageSaleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semimain);
        context = this;
        intent = getIntent();
        activity = this;

        initViews();
    }


    private void initViews() {
        manageSaleBtn = (ImageButton) findViewById(R.id.btn_manage_sale);
        manageSaleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_manage_sale:
                Intent intent = new Intent(this,MainActivity.class);
//                intent.putExtra(/*사용자계정정보*/);
                startActivity(intent);
//                finish();
                break;
        }
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
}
