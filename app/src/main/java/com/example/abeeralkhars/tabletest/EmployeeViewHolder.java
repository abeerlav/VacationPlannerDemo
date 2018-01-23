package com.example.abeeralkhars.tabletest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abeeralkhars on 23/01/2018 AD.
 */

class EmployeeViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    ImageView photo;
    public EmployeeViewHolder(View itemView) {
        super(itemView);
        name=  (TextView) itemView.findViewById(R.id.employee_name);
        photo = (ImageView)itemView.findViewById(R.id.employee_photo);
    }
    
    
}