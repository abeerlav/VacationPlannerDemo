package com.example.abeeralkhars.tabletest.dimitrios;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.widget.HorizontalScrollView;

import com.example.abeeralkhars.tabletest.EmployeeAdapter;
import com.example.abeeralkhars.tabletest.R;
import com.example.abeeralkhars.tabletest.RecyclerViewAdapter;
import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.List;

/** Created by dimitrios on 22/01/2018. */

public class VacationPlannerActivity extends AppCompatActivity {
    
    RecyclerView usersRecyclerView;
    RecyclerView vacationGridRecycler;
    HorizontalScrollView horizontalScrollView;
    int previousScroll = 0;
    
    private boolean scrollingUpdatePending;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimitrios);
        bindViews();
    }
    
    private void bindViews() {
        usersRecyclerView = findViewById(R.id.recyclerUsers);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        vacationGridRecycler = findViewById(R.id.recyclerVacationGrid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 12, LinearLayoutManager.VERTICAL, false);
        vacationGridRecycler.setLayoutManager(gridLayoutManager);
        horizontalScrollView = findViewById(R.id.horizontalScrollView);
        
        
        usersRecyclerView.setAdapter(new EmployeeAdapter(this, getAllEmployeesVacations()));
        vacationGridRecycler.setAdapter(new RecyclerViewAdapter(this, getAllEmployeesVacations()));
        
        vacationGridRecycler.addOnScrollListener(new OnScrollListener() {
            
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (!scrollingUpdatePending) {
                    scrollingUpdatePending = true;
                    usersRecyclerView.scrollBy(dx, dy);
                    scrollingUpdatePending = false;
                }
            }
        });
        
        usersRecyclerView.addOnScrollListener(new OnScrollListener() {
            
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (!scrollingUpdatePending) {
                    scrollingUpdatePending = true;
                    vacationGridRecycler.scrollBy(dx, dy);
                    scrollingUpdatePending = false;
                }
            }
        });
        
    }
    
    private List<EmployeeVacation> getAllEmployeesVacations() {
        List<Vacation> aEmployeeVacation = new ArrayList<Vacation>();
        List<Vacation> bEmployeeVacation = new ArrayList<Vacation>();
        
        aEmployeeVacation.add(new Vacation(3, 7, "type1"));
        aEmployeeVacation.add(new Vacation(1, 1, "type2"));
        //  aEmployeeVacation.add(new Vacation(3,4, "type1"));
        
        bEmployeeVacation.add(new Vacation(0, 1, "type1"));
        bEmployeeVacation.add(new Vacation(7, 8, "type1"));
        
        EmployeeVacation employeeA = new EmployeeVacation("Abeer", aEmployeeVacation);
        EmployeeVacation employeeB = new EmployeeVacation("Sara", bEmployeeVacation);
        
        List<EmployeeVacation> employeeVacationList = new ArrayList<EmployeeVacation>();
        employeeVacationList.add(employeeA);
        employeeVacationList.add(employeeB);
          employeeVacationList.add(employeeB);
           employeeVacationList.add(employeeA);
          employeeVacationList.add(employeeB);
        return employeeVacationList;
        
    }
}
