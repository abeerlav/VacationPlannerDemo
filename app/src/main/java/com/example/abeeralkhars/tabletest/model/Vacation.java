package com.example.abeeralkhars.tabletest.model;

import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;

/**
 * Created by abeeralkhars on 22/01/2018 AD.
 */

public class Vacation {
    private int startDate;
    private int endDate;
    private String vacationType;
    
    public int getStartDate() {
        return startDate;
    }
    
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
    
    public int getEndDate() {
        return endDate;
    }
    
    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
    
    public String getVacationType() {
        return vacationType;
    }
    
    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }
    
    public Vacation(int startDate, int endDate, String vacationType) {
    
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
    }
}
