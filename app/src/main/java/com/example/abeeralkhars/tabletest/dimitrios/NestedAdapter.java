package com.example.abeeralkhars.tabletest.dimitrios;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abeeralkhars.tabletest.R;
import com.example.abeeralkhars.tabletest.dimitrios.NestedAdapter.NestedViewHolder;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.List;

/** Created by dimitrios on 22/01/2018. */

public class NestedAdapter extends RecyclerView.Adapter<NestedViewHolder> {
    
    private List<Vacation> vacationList;
    private Context context;
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
    
    public NestedAdapter(List<Vacation> vacationList, Context context) {
        this.vacationList = vacationList;
        this.context = context;
        
    }
    
    @Override
    public NestedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        
        return NestedViewHolder.newInstance(parent);
    }
    
    @Override
    public void onBindViewHolder(NestedViewHolder holder, int position) {
        ArrayList<Vacation> vacations = (ArrayList<Vacation>) vacationList;
        
        for (Vacation vacation : vacations) {
            
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
    public int getItemCount() {
        return 1;
    }
    
    @Override
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return position;
        
    }
    
    static class NestedViewHolder extends RecyclerView.ViewHolder {
        
        TextView janCell, febCell, marCell, aprCell, mayCell, junCell, julCell, augCell, SepCell, octCell, novCell, desCell;
        
        public NestedViewHolder(View itemView) {
            super(itemView);
            
            janCell = (TextView) itemView.findViewById(R.id.jan_cell);
            
            febCell = (TextView) itemView.findViewById(R.id.feb_cell);
            
            marCell = (TextView) itemView.findViewById(R.id.mar_cell);
            
            aprCell = (TextView) itemView.findViewById(R.id.apr_cell);
            
            mayCell = (TextView) itemView.findViewById(R.id.may_cell);
            
            junCell = (TextView) itemView.findViewById(R.id.jun_cell);
            julCell = (TextView) itemView.findViewById(R.id.jul_cell);
            
            augCell = (TextView) itemView.findViewById(R.id.aug_cell);
            SepCell = (TextView) itemView.findViewById(R.id.sep_cell);
            
            octCell = (TextView) itemView.findViewById(R.id.oct_cell);
            
            novCell = (TextView) itemView.findViewById(R.id.nov_cell);
            desCell = (TextView) itemView.findViewById(R.id.des_Cell);
            
        }
        
        
        public static NestedViewHolder newInstance(ViewGroup parent) {
            
            return new NestedViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_planner_row_item, parent, false));
            
        }
    }
    
    
}