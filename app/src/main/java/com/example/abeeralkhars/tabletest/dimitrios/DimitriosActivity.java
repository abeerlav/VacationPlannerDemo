package com.example.abeeralkhars.tabletest.dimitrios;

import android.os.Bundle;
import android.provider.Settings.System;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.abeeralkhars.tabletest.MainActivity;
import com.example.abeeralkhars.tabletest.R;
import com.example.abeeralkhars.tabletest.RecyclerViewAdapter;
import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.List;

/** Created by dimitrios on 22/01/2018. */

public class DimitriosActivity extends AppCompatActivity{
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimitrios);
        List<EmployeeVacation> rowListItem = getAllEmployeesVacations();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DimitriosActivity.this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DimitriosAdapter recyclerViewAdapter = new DimitriosAdapter(rowListItem,DimitriosActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    private List<EmployeeVacation> getAllEmployeesVacations() {
        List<Vacation> aEmployeeVacation = new ArrayList<Vacation>();
        List<Vacation> bEmployeeVacation = new ArrayList<Vacation>();
        List<Vacation> cEmployeeVacation = new ArrayList<Vacation>();
        List<Vacation> dEmployeeVacation = new ArrayList<Vacation>();
        
        aEmployeeVacation.add(new Vacation("Jan", "Jan", "type1"));
        aEmployeeVacation.add(new Vacation("Mar", "apr", "type2"));
        aEmployeeVacation.add(new Vacation("Oct", "oct", "type1"));
        
        bEmployeeVacation.add(new Vacation("Mar", "Apr", "type1"));
        bEmployeeVacation.add(new Vacation("Nov", "Nov", "type1"));
        
        EmployeeVacation employeeA = new EmployeeVacation("Abeer", aEmployeeVacation);
        EmployeeVacation employeeB = new EmployeeVacation("Sara", bEmployeeVacation);
        
        List<EmployeeVacation> employeeVacationList = new ArrayList<EmployeeVacation>();
        employeeVacationList.add(employeeA);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        employeeVacationList.add(employeeB);
        
        return employeeVacationList;
        
    }
}
