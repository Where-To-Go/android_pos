package com.beongaeman.yanghc.wheretogo.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.beongaeman.yanghc.wheretogo.Login.Login;
import com.beongaeman.yanghc.wheretogo.Login.LoginService;
import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.Table.SemiMainActivity;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by YangHC on 2017-07-01.
 */

public class SignFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    private ImageButton signUpBtn;
    private ImageButton signInBtn;
    private TextView findUser;
    private EditText edit_sign_in_id;
    private EditText edit_sign_in_pw;
    private String Userid;
    private String Userpw;
    private final String SERVER_ADDRESS = "http://13.59.184.129:8080/wheretogo/api/{version}/pos/signin";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        signInBtn = (ImageButton) view.findViewById(R.id.btn_sign_in);
        signInBtn.setOnClickListener(this);
        signUpBtn = (ImageButton) view.findViewById(R.id.btn_sign_up);
        signUpBtn.setOnClickListener(this);
        findUser = (TextView) view.findViewById(R.id.findUser);
        findUser.setOnClickListener(this);
        edit_sign_in_id = (EditText) view.findViewById(R.id.edit_sign_in_id);
        edit_sign_in_pw = (EditText) view.findViewById(R.id.edit_sign_in_pw);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                Userid = edit_sign_in_id.getText().toString();
                Userpw = edit_sign_in_pw.getText().toString();
                LoginService loginService = LoginService.retrofit.create(LoginService.class);
                Login login = new Login();
                login.setEmail(Userid);
                login.setPasswd(Userpw);

                Map<String, Object> map = new ArrayMap<>();
//put something inside the map, could be null
                map.put("code", login);

                RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),(new JSONObject(map)).toString());
//serviceCaller is the interface initialized with retrofit.create...
//                Call<ResponseBody> response = serviceCaller.login("loginpostfix", body);

                Call<List<Login>> call=null ;
//                = loginService.repoLogin(1,login);

                Log.e("RETROFIT", "OnClick");
//                Log.e("RETROFIT", call.);

                call.enqueue(new Callback<List<Login>>() {
                    @Override
                    public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
                        Log.e("RETROFIT", "Success");
                        Log.e("ReTROFIT", response.message());
                        Intent intent = new Intent(SplashActivity.context, SemiMainActivity.class);
//                intent.putExtra(/*사용자계정정보*/);
                        startActivity(intent);
                        getActivity().finish();
                    }

                    @Override
                    public void onFailure(Call<List<Login>> call, Throwable t) {
                        Log.e("RETROFIT", "Fail");
                    }
                });
                break;
            case R.id.btn_sign_up:
                ((SplashActivity) getActivity()).addFragment(new SignUpFragment());
                break;
            case R.id.findUser:
                ((SplashActivity) getActivity()).addFragment(new FindUserFragment());
                break;
        }
    }
}
