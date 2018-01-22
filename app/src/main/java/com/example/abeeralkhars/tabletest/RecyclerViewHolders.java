package com.example.abeeralkhars.tabletest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by abeeralkhars on 18/01/2018 AD.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements OnClickListener {
    
    TextView janCell, febCell, marCell, aprCell, mayCell, junCell, julCell, augCell, SepCell, octCell, novCell, desCell;
    
    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
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
    
    @Override
    public void onClick(View view) {
        Log.i("POS_CLICKED: ", "" + getAdapterPosition());
    }
}
