package com.example.abeeralkhars.tabletest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by abeeralkhars on 18/01/2018 AD.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements OnClickListener {
    
    LinearLayout vacationCell;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        vacationCell = (LinearLayout) itemView.findViewById(R.id.vacation_cell);
      
        

        
    }
    
    @Override
    public void onClick(View view) {
        Log.i("POS_CLICKED: ", "" + getAdapterPosition());
    }
}
