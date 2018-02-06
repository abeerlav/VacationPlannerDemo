package com.example.abeeralkhars.tabletest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by abeeralkhars on 18/01/2018 AD.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> implements OnClickListener {
    
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
        drawCellRectangles(employeeIndex, columnIndex, holder.vacationCell);
        
    }
    
    private boolean isNewRow(int position) {
        if (position == 0)
            return true;
        if (position > CELLS_COUNT - 1)
            return position % CELLS_COUNT == 0;
        return false;
    }
    
    private void drawCellRectangles(int employeeIndex, int cell, FrameLayout frameLayout) {
        
        ArrayList<Vacation> vacations = (ArrayList<Vacation>) rowList.get(employeeIndex).getVacationList();
        
        for (Vacation vacation : vacations) {
            int startMonth = findMonthOfDate(vacation.getStartDate());
            int endMonth = findMonthOfDate(vacation.getEndDate());
            int startDay = findDayOfDate(vacation.getStartDate());
            int endDay = findDayOfDate(vacation.getEndDate());
            
            
            if (cell == startMonth && cell == endMonth) {
                int marginStart = convertDpToPx(calculatePercentage(startDay));
                int rectangleWidth = convertDpToPx(calculatePercentage(endDay - startDay));
                drawRectangle(marginStart, rectangleWidth, frameLayout);
                
            } else if (cell == startMonth && cell != endMonth) {
                int marginStart = convertDpToPx(calculatePercentage(startDay));
                int rectangleWidth = convertDpToPx(calculatePercentage(30));
                drawRectangle(marginStart, rectangleWidth, frameLayout);
                
            } else if (cell == endMonth && cell != startMonth) {
                int marginStart = 0;
                int rectangleWidth = convertDpToPx(calculatePercentage(startDay));
                drawRectangle(marginStart, rectangleWidth, frameLayout);
                
            } else if (startMonth < cell && endMonth > cell) {
                int marginStart = 0;
                int rectangleWidth = convertDpToPx(30);
                drawRectangle(marginStart, rectangleWidth, frameLayout);
                
            }
        }
        
    }
    
    private int findMonthOfDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH);
        
    }
    
    private int findDayOfDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_MONTH);
    }
    
    private int convertDpToPx(int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }
    
    private int calculatePercentage(int num) {
        if (num == 1)
            return 0;
        return (num * 100) / 30;
        
    }
    
    private int calculateMarginEnd(int endDay) {
        return 31 - endDay;
    }
    
    private void drawRectangle(int marginStart, int width, FrameLayout layout) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.color.colorAccent);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(width, LayoutParams.MATCH_PARENT);
        params.setMarginStart(marginStart);
        imageView.setLayoutParams(params);
        layout.addView(imageView);
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
    
    
    private int calculateMarginStart(LinearLayout layout, int day) {
        
        int count = layout.getChildCount();
        if (count != 0) {
            View child = layout.getChildAt(count - 1);
            int width = child.getLayoutParams().width;
            ViewGroup.MarginLayoutParams vlp = (MarginLayoutParams) child.getLayoutParams();
            int rightMargin = vlp.getMarginStart();
            System.out.println("width: " + (rightMargin + width));
            return (rightMargin + width);
        }
        return -1;
    }
    
    private int calculateWidth(int startDay, int endDay) {
        return endDay - startDay;
    }
    
    @Override
    public void onClick(View view) {
    
    }
}