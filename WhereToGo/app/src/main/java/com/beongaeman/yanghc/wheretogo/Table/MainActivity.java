package com.beongaeman.yanghc.wheretogo.Table;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.beongaeman.yanghc.wheretogo.ExitDialog;
import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.VO.Table;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private Context context;
    private Intent intent;
    private Activity activity;

    private Button exitBtn;
    private GridView tableGrid;

    private ArrayList<Table> tables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        intent = getIntent();
        activity = this;

        initViews();

    }

    private void initViews(){
        tableGrid = (GridView) findViewById(R.id.grid_tables);
        exitBtn = (Button) findViewById(R.id.btn_main_exit);
        exitBtn.setOnClickListener(this);

        tables = new ArrayList<>();
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());

        MyAdapter myAdapter = new MyAdapter(this,tables);
        tableGrid.setAdapter(myAdapter);
        tableGrid.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_exit_exit:
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            ExitDialog exitDialog = new ExitDialog(this);
            exitDialog.show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
