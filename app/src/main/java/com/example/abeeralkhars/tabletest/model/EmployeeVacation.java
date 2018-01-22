package com.example.abeeralkhars.tabletest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abeeralkhars on 22/01/2018 AD.
 */

public class EmployeeVacation {
    
    private String employeeName;
    private List <Vacation> vacationList;
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public List<Vacation> getVacationList() {
        return vacationList;
    }
    
    public void addVacation(Vacation vacation){
        vacationList.add(vacation);
  }
  
  
    
    public EmployeeVacation(String employeeName, List<Vacation> vacationList) {
    
        this.employeeName = employeeName;
        this.vacationList = vacationList;
    }
}
