package com.example.abeeralkhars.tabletest.dimitrios;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.R;
import com.example.abeeralkhars.tabletest.dimitrios.NestedAdapter.NestedViewHolder;

/** Created by dimitrios on 22/01/2018. */

public class NestedAdapter extends RecyclerView.Adapter<NestedViewHolder> {
    
    
    @Override
    public NestedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
    
    @Override
    public void onBindViewHolder(NestedViewHolder holder, int position) {
    
    }
    
    @Override
    public int getItemCount() {
        return 0;
    }
    
    static class NestedViewHolder extends RecyclerView.ViewHolder {
        
        public NestedViewHolder(View itemView) {
            super(itemView);
        }
        
        public static NestedViewHolder newInstance(ViewGroup parent) {
            return new NestedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_planner_row_item, parent, false));
        }
    }
}
