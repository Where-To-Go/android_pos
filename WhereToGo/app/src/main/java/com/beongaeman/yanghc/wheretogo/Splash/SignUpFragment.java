package com.beongaeman.yanghc.wheretogo.Splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.beongaeman.yanghc.wheretogo.CheckSignUpDialog;
import com.beongaeman.yanghc.wheretogo.R;

/**
 * Created by YangHC on 2017-07-01.
 */

public class SignUpFragment extends android.support.v4.app.Fragment implements View.OnClickListener{
    private Button signUpCompleteBtn;
    private Button trunOnRePasswdBtn;
    private Button trunOnPasswdBtn;
    private EditText signUpRePasswd;
    private EditText signUpPasswd;
    private boolean PasswdCheck=true;
    private boolean rePasswdCheck =true;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        initViews(view);
        return view ;
    }
    private void initViews(View view){
        signUpCompleteBtn = (Button)view.findViewById(R.id.btn_sign_up_complete);
        signUpCompleteBtn.setOnClickListener(this);
        trunOnRePasswdBtn =(Button)view.findViewById(R.id.btn_turn_on_re_passwd);
        trunOnRePasswdBtn.setOnClickListener(this);
        trunOnPasswdBtn =(Button)view.findViewById(R.id.btn_turn_on_passwd);
        trunOnPasswdBtn.setOnClickListener(this);
        signUpRePasswd = (EditText)view.findViewById(R.id.edit_sign_up_re_pw);
        signUpPasswd= (EditText)view.findViewById(R.id.edit_sign_up_pw);
//        signUpInfoBtn = (ImageButton)view.findViewById(R.id.btn_sign_up_info);
//        signUpInfoBtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sign_up_complete:
                CheckSignUpDialog checkSignUpDialog = new CheckSignUpDialog();
                checkSignUpDialog.show(getFragmentManager(),"CheckSignUpDialog");
                break;
            case R.id.btn_turn_on_re_passwd:
                if(rePasswdCheck==true) {
                    signUpRePasswd.setInputType(0x00000001);
                    rePasswdCheck=false;
                }else {
                    signUpRePasswd.setInputType(0x00000081);
                    rePasswdCheck=true;
                }
                break;
            case R.id.btn_turn_on_passwd:
                if(PasswdCheck==true) {
                    signUpPasswd.setInputType(0x0000001);
                    PasswdCheck=false;
                }else {
                    signUpPasswd.setInputType(0x00000081);
                    PasswdCheck=true;
                }
                break;
        }
    }
}
