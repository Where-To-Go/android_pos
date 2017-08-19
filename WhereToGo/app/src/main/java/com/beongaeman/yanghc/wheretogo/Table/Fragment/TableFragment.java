package com.beongaeman.yanghc.wheretogo.Table.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.Splash.FindUserFragment;
import com.beongaeman.yanghc.wheretogo.Splash.SignUpFragment;
import com.beongaeman.yanghc.wheretogo.Splash.SplashActivity;
import com.beongaeman.yanghc.wheretogo.Table.MainActivity;
import com.beongaeman.yanghc.wheretogo.Table.SemiMainActivity;
import com.beongaeman.yanghc.wheretogo.VO.Table;

import java.util.ArrayList;

/**
 * Created by YangHC on 2017-07-01.
 */

public class TableFragment extends android.support.v4.app.Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ArrayList<Button> menuBtns;
    private ArrayList<Table> tables;
    private RecyclerView recyclerView;
//    private Recl
    private GridView tableGrid;
    private LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_table, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.list_table);
        tableGrid = (GridView) view.findViewById(R.id.grid_main_table);

        tables = new ArrayList<>();
        for (int i = 0; i < 27; i++) {
            tables.add(new Table());
        }

        linearLayoutManager = new LinearLayoutManager(MainActivity.context, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        TableRecyclerAdapter tableRecyclerAdapter = new TableRecyclerAdapter(MainActivity.context,tables,R.layout.fragment_table);
        recyclerView.setAdapter(tableRecyclerAdapter);

        TableGridAdapter tableGridAdapter = new TableGridAdapter(MainActivity.context, tables);
        tableGrid.setAdapter(tableGridAdapter);
        tableGrid.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_sign_in:
                Intent intent = new Intent(SplashActivity.context, SemiMainActivity.class);
//                intent.putExtra(/*사용자계정정보*/);
                startActivity(intent);
                getActivity().finish();
                break;
            case R.id.btn_sign_up:
                ((SplashActivity) getActivity()).addFragment(new SignUpFragment());
                break;
            case R.id.findUser:
                ((SplashActivity) getActivity()).addFragment(new FindUserFragment());
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
