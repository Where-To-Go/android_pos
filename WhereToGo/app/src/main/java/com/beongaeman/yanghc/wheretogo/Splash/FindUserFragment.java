package com.beongaeman.yanghc.wheretogo.Splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.beongaeman.yanghc.wheretogo.R;

/**
 * Created by 조연희 on 2017-08-16.
 */

public class FindUserFragment extends android.support.v4.app.Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_find_user, container, false);

        return view ;
    }
}
