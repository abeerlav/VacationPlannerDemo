package com.example.abeeralkhars.tabletest.model;

import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;

import java.util.Date;

/**
 * Created by abeeralkhars on 22/01/2018 AD.
 */

public class Vacation {
    private Date startDate;
    private Date endDate;
    private String vacationType;
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public String getVacationType() {
        return vacationType;
    }
    
    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }
    
    public Vacation(Date startDate, Date endDate, String vacationType) {
    
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
    }
}
