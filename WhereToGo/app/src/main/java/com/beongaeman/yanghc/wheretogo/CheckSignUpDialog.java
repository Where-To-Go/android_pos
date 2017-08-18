package com.beongaeman.yanghc.wheretogo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

/**
 * Created by 조연희 on 2017-08-17.
 */

public class CheckSignUpDialog extends android.support.v4.app.DialogFragment  {

    private Button checkSignUpBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.dialog_check_sign_up,container,false);
        getDialog().setTitle("CheckSignUpDailog");
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        initView();
        return view;
    }

    public void onResume(){
        super.onResume();
        Window window = getDialog().getWindow();
        window.setLayout(400,250);
        window.setGravity(Gravity.CENTER);
    }

    public void initView(){
//        checkSignUpBtn = (Button) getView().findViewById(R.id.btn_check_sign_up);
//        checkSignUpBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ((SplashActivity)getActivity()).addFragment(new SignFragment());
//            }
//        });
    }





//
//
//    private Context context;
//    private Button CheckSignUpBtn;
//
//    public CheckSignUpDialog(@NonNull Context context) {
//        super(context);
//        this.context = context;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_check_sign_up);
//
//        CheckSignUpBtn = (Button)findViewById(R.id.btn_check_sign_up);
//        CheckSignUpBtn.setOnClickListener(this);
//
//    }
//
//
//    @Override
//    public void onClickListner(View v) {
//        switch (v.getId()){
//            case R.id.btn_check_sign_up:
//
//            break;
//
//        }
//    }

}
