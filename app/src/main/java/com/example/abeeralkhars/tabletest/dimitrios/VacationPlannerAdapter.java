package com.example.abeeralkhars.tabletest.dimitrios;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abeeralkhars.tabletest.dimitrios.VacationPlannerAdapter.RowViewHolder;
import com.example.abeeralkhars.tabletest.R;
import com.example.abeeralkhars.tabletest.model.EmployeeVacation;

import java.util.List;

/** Created by dimitrios on 22/01/2018. */

class VacationPlannerAdapter extends RecyclerView.Adapter<RowViewHolder> {
    
    private List<EmployeeVacation> employeesList;
    private Context context;
    
    public VacationPlannerAdapter(List<EmployeeVacation> employeesList, Context context) {
        this.employeesList = employeesList;
        this.context=context;

        
    }
    
    @Override
    public RowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
 
        return RowViewHolder.newInstance(parent);
        
    }
    
    @Override
    public void onBindViewHolder(RowViewHolder holder, int position) {
      EmployeeVacation employeeVacation=  employeesList.get(position);
       LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        holder.employeeTextView.setText(employeeVacation.getEmployeeName());
        //holder.employeeImageView.setImageBitmap();
        holder.mNestedRecyclerView.setLayoutManager(linearLayoutManager);
        holder.mNestedRecyclerView.setAdapter(new NestedAdapter(employeeVacation.getVacationList(),context));
    }
    
    @Override
    public int getItemCount() {
        return this.employeesList.size();
    }
    
    
    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return position;
    }
    
    static class RowViewHolder extends RecyclerView.ViewHolder {
        
       RecyclerView mNestedRecyclerView;
        ImageView    employeeImageView;
        TextView employeeTextView;
        
        public static RowViewHolder newInstance(ViewGroup parent) {
            return new RowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_row, parent, false));
        }
        
        public RowViewHolder(View itemView) {
            super(itemView);
           mNestedRecyclerView = itemView.findViewById(R.id.nested_recycler);
            employeeImageView = itemView.findViewById(R.id.employee_photo);
            employeeTextView = itemView.findViewById(R.id.employee_name);
            
            
        }
    }
}
