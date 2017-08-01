package com.beongaeman.yanghc.wheretogo.Splash;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beongaeman.yanghc.wheretogo.R;

/**
 * Created by YangHC on 2017-07-01.
 */

public class SignInFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        return view ;
    }
}
