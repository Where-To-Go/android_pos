package com.beongaeman.yanghc.wheretogo.Table.Fragment;

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

public class TableListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Table> tables;

    public TableListAdapter(Context context, ArrayList<Table> tables) {
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
                    .inflate(R.layout.view_table_list, null);

        TextView tableNumTxt = (TextView) convertView.findViewById(R.id.txt_table_list_num);
        TextView tablePeopleTxt = (TextView) convertView.findViewById(R.id.txt_table_list_people);

        String tableNum;
        if(position<9){
            tableNum="0"+String.valueOf(position+1);
        }else{
            tableNum=String.valueOf(position+1);
        }

        tableNumTxt.setText(tableNum);
        tablePeopleTxt.setText("("+0+"/"+table.getMaxPeople()+")");

        return convertView;
    }
}