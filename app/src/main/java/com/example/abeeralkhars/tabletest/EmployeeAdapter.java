package com.example.abeeralkhars.tabletest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.model.EmployeeVacation;

import java.util.List;

/**
 * Created by abeeralkhars on 23/01/2018 AD.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewHolder> {
    
    private List<EmployeeVacation> rowList;
    private Context context;
    
    public EmployeeAdapter(Context context, List<EmployeeVacation> item) {
        this.rowList = item;
        this.context = context;
    }
    
    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("viewType", String.valueOf(viewType));
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_viewholder, parent, false);
        EmployeeViewHolder rcv = new EmployeeViewHolder(layoutView);
        return rcv;
    }
    
    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        EmployeeVacation employeeVacation = rowList.get(position);
        System.out.println("employee position: " + position + " " + employeeVacation.getEmployeeName());
        holder.name.setText(employeeVacation.getEmployeeName());
        
    }
    
    
    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return position;
    }
    
    @Override
    public int getItemCount() {
        return this.rowList.size();
    }
}