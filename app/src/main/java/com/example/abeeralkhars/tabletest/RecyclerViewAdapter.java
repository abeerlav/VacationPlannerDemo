package com.example.abeeralkhars.tabletest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abeeralkhars on 18/01/2018 AD.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    
    private final String JAN = "Jan";
    private final String FEB = "Feb";
    private final String MAR = "Mar";
    private final String APR = "Apr";
    private final String MAY = "May";
    private final String JUN = "Jun";
    private final String JUL = "Jul";
    private final String AUG = "Aug";
    private final String SEP = "Sep";
    private final String OCT = "Oct";
    private final String NOV = "Nov";
    private final String DEC = "Dec";
    private List<EmployeeVacation> rowList;
    private Context context;
    
    
    public RecyclerViewAdapter(Context context, List<EmployeeVacation> rowList) {
        this.rowList = rowList;
        this.context = context;
    }
    
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("viewType", String.valueOf(viewType));
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_planner_row_item, null);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }
    
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        EmployeeVacation employeeVacation = rowList.get(position);
        System.out.println("employee position: " + position + " "+employeeVacation.getEmployeeName());
        ArrayList<Vacation> vacationList = (ArrayList<Vacation>) employeeVacation.getVacationList();
        
        for (Vacation vacation : vacationList) {
            switch (vacation.getStartDate()) {
                case JAN:
                    holder.janCell.setText("*");
                    
                    break;
                case FEB:
                    holder.febCell.setText("*");
                    
                    break;
                case MAR:
                    holder.marCell.setText("*");
                    
                    break;
                case APR:
                    holder.aprCell.setText("*");
                    
                    break;
                case MAY:
                    holder.mayCell.setText("*");
                    
                    break;
                case JUN:
                    holder.junCell.setText("*");
                    
                    break;
                case JUL:
                    holder.julCell.setText("*");
                    
                    break;
                case AUG:
                    holder.augCell.setText("*");
                    
                    break;
                case SEP:
                    holder.SepCell.setText("*");
                    
                    break;
                case OCT:
                    holder.octCell.setText("*");
                    
                    break;
                case NOV:
                    holder.novCell.setText("*");
                    
                    break;
                case DEC:
                    holder.desCell.setText("*");
                    
                    break;
                
            }
        }
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