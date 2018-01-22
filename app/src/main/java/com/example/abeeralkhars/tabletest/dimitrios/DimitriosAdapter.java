package com.example.abeeralkhars.tabletest.dimitrios;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.dimitrios.DimitriosAdapter.RowViewHolder;
import com.example.abeeralkhars.tabletest.R;

/** Created by dimitrios on 22/01/2018. */

class DimitriosAdapter extends RecyclerView.Adapter<RowViewHolder> {
    
    
    @Override
    public RowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
    
    @Override
    public void onBindViewHolder(RowViewHolder holder, int position) {
    
    }
    
    @Override
    public int getItemCount() {
        return 0;
    }
    
    static class RowViewHolder extends RecyclerView.ViewHolder {
        
        RecyclerView mNestedRecyclerView;
        
        public static RowViewHolder newInstance(ViewGroup parent) {
            return new RowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_row, parent, false));
        }
        
        public RowViewHolder(View itemView) {
            super(itemView);
            mNestedRecyclerView = itemView.findViewById(R.id.nested_recycler);
            
        }
    }
}
