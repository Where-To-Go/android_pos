package com.beongaeman.yanghc.wheretogo.Table;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.VO.Table;

import java.util.ArrayList;

/**
 * Created by YangHC on 2017-07-03.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Table> tables;

    public MyAdapter(Context context, ArrayList<Table> tables) {
        this.context = context;
        this.tables = tables;
    }

    @Override
    public int getCount() {
        return tables.size();
    }

    @Override
    public Object getItem(int position) {
        return tables.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Table table = tables.get(position);
        if (convertView == null)
            convertView = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.view_grid, null);

        TextView tv = (TextView) convertView.findViewById(R.id.txt_table_num);

        String num;
        if(position<9){
            num="0"+String.valueOf(position+1);
        }else{
            num=String.valueOf(position+1);
        }
        tv.setText("테이블 "+num);

        return convertView;
    }
}