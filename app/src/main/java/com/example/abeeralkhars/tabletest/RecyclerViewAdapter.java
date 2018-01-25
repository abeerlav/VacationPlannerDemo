package com.example.abeeralkhars.tabletest;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by abeeralkhars on 18/01/2018 AD.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    
    private final int CELLS_COUNT = 12;
    private List<EmployeeVacation> rowList;
    private Context context;
    private int rowIndex = 0;
    
    public RecyclerViewAdapter(Context context, List<EmployeeVacation> rowList) {
        this.rowList = rowList;
        this.context = context;
        Log.i("Adapter", "construct ");
    }
    
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("Adapter ", "onCreateViewHolder " + viewType);
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_cell, parent, false);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }
    
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        
        if (isNewRow(position))
            rowIndex = position;
        int columnIndex = position - rowIndex;
        int employeeIndex = rowIndex / CELLS_COUNT;
        //   holder.vacationCell.setText("P:"+String.valueOf(position)+" R:"+String.valueOf(rowIndex)+"  C:"+String.valueOf(columnIndex)+" E:"+String.valueOf(employeeIndex));
        
        if (checkEmployeeVacationForMonth(employeeIndex, columnIndex)) {
            Drawable rec = context.getResources().getDrawable(R.drawable.rectangle, context.getTheme());
            // using gradientDrawable, we can modify rec param for the start and end day of the vacation
            GradientDrawable gradientDrawable = (GradientDrawable) rec;
            holder.vacationCell.setImageResource(R.drawable.rectangle);
        }
    }
    
    private boolean isNewRow(int position) {
        if (position == 0)
            return true;
        if (position > CELLS_COUNT - 1)
            return position % CELLS_COUNT == 0;
        return false;
    }
    
    private boolean checkEmployeeVacationForMonth(int employeeIndex, int month) {
        ArrayList<Vacation> vacations = (ArrayList<Vacation>) rowList.get(employeeIndex).getVacationList();
        // in the MyGate app we need to get the day and the month in integer format form the date to make it works
        for (Vacation vacation : vacations) {
            int start = vacation.getStartDate();
            int end = vacation.getEndDate();
            if (month == start)
                return true;
            if (month == end)
                return true;
            if (start < month && end > month)
                return true;
        }
        return false;
        
    }
    
    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return position;
    }
    
    @Override
    public int getItemCount() {
        return rowList.size() * CELLS_COUNT;
    }
    
}