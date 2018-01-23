package com.example.abeeralkhars.tabletest.dimitrios;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.R;

/**
 * Created by abeeralkhars on 23/01/2018 AD.
 */

public class HeaderViewHolder extends RecyclerView.ViewHolder {
    
    public HeaderViewHolder(View itemView) {
        super(itemView);
    }
    public static HeaderViewHolder newInstance(ViewGroup parent) {
        
        return new HeaderViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_row_header, parent, false));
        
    }
}