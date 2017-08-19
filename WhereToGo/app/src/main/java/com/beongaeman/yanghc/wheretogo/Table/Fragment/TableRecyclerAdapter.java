package com.beongaeman.yanghc.wheretogo.Table.Fragment;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.beongaeman.yanghc.wheretogo.R;
import com.beongaeman.yanghc.wheretogo.VO.Table;

import java.util.List;

public class TableRecyclerAdapter extends RecyclerView.Adapter<TableRecyclerAdapter.ViewHolder> {

    Context context;
    List<Table> items;
    int item_layout;

    public TableRecyclerAdapter(Context context, List<Table> items, int item_layout) {
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_table_list, parent, false);
        return new ViewHolder(v);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Table table = items.get(position);

        String tableNum;
        if(position<9){
            tableNum="0"+String.valueOf(position+1);
        }else{
            tableNum=String.valueOf(position+1);
        }

        holder.numTxt.setText(tableNum);
        holder.peopleTxt.setText("("+0+"/"+table.getMaxPeople()+")");
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView numTxt;
        TextView peopleTxt;

        public ViewHolder(View itemView) {
            super(itemView);
            numTxt = (TextView)itemView.findViewById(R.id.txt_table_list_num);
            peopleTxt = (TextView) itemView.findViewById(R.id.txt_table_list_people);
        }
    }


}
