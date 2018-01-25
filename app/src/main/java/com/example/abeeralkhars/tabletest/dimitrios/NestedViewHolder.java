package com.example.abeeralkhars.tabletest.dimitrios;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abeeralkhars.tabletest.R;

/**
 * Created by abeeralkhars on 23/01/2018 AD.
 */

public class NestedViewHolder  extends RecyclerView.ViewHolder {
    
    public TextView janCell, febCell, marCell, aprCell, mayCell, junCell, julCell, augCell, SepCell, octCell, novCell, desCell;
    
    public NestedViewHolder(View itemView) {
        super(itemView);
        janCell = (TextView) itemView.findViewById(R.id.jan_cell);
        
        febCell = (TextView) itemView.findViewById(R.id.feb_cell);
        
        marCell = (TextView) itemView.findViewById(R.id.mar_cell);
        
        aprCell = (TextView) itemView.findViewById(R.id.apr_cell);
        
        mayCell = (TextView) itemView.findViewById(R.id.may_cell);
        
        junCell = (TextView) itemView.findViewById(R.id.jun_cell);
        julCell = (TextView) itemView.findViewById(R.id.jul_cell);
        
        augCell = (TextView) itemView.findViewById(R.id.aug_cell);
        SepCell = (TextView) itemView.findViewById(R.id.sep_cell);
        
        octCell = (TextView) itemView.findViewById(R.id.oct_cell);
        
        novCell = (TextView) itemView.findViewById(R.id.nov_cell);
        desCell = (TextView) itemView.findViewById(R.id.des_Cell);
        
    }
    
    
    public static NestedViewHolder newInstance(ViewGroup parent) {
        
        return new NestedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_planner_row_item, parent, false));
        
    }
}
    

