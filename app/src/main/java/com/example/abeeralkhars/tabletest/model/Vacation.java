package com.example.abeeralkhars.tabletest.model;

/**
 * Created by abeeralkhars on 22/01/2018 AD.
 */

public class Vacation {
    private String startDate;
    private String endDate;
    private String vacationType;
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public String getVacationType() {
        return vacationType;
    }
    
    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }
    
    public Vacation(String startDate, String endDate, String vacationType) {
    
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
    }
}
