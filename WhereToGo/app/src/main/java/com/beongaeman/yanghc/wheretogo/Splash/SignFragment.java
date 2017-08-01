package com.beongaeman.yanghc.wheretogo.Splash;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.beongaeman.yanghc.wheretogo.Table.MainActivity;
import com.beongaeman.yanghc.wheretogo.R;

/**
 * Created by YangHC on 2017-07-01.
 */

public class SignFragment extends Fragment implements View.OnClickListener{
    private ImageButton signUpBtn;
    private ImageButton signInBtn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign, container, false);

        initViews(view);

        return view ;
    }

    private void initViews(View view){
        signInBtn = (ImageButton) view.findViewById(R.id.btn_sign_in);
        signInBtn.setOnClickListener(this);
        signUpBtn = (ImageButton) view.findViewById(R.id.btn_sign_up);
        signUpBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_sign_in:
                Intent intent = new Intent(SplashActivity.context,MainActivity.class);
//                intent.putExtra(/*사용자계정정보*/);
                startActivity(intent);
                getActivity().finish();
                break;
            case R.id.btn_sign_up:
                ((SplashActivity)getActivity()).addFragment(new SignUpFragment());
                break;
        }
    }
}
