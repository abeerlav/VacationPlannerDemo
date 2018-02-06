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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        try {  aEmployeeVacation.add(new Vacation(dateFormat.parse("2018-01-5T00:00:00.000+03:00"), dateFormat.parse(
                    "2018-01-15T00:00:00.000+03:00"), "type2"));
    
    
            aEmployeeVacation.add(new Vacation(dateFormat.parse("2018-1-26T00:00:00.000+03:00")
             , dateFormat.parse("2018-03-15T00:00:00.000+03:00"), "type1"));
    
          //  aEmployeeVacation.add(new Vacation(dateFormat.parse("2018-03-20T00:00:00.000+03:00"),
          //      dateFormat.parse("2018-03-25T00:00:00.000+03:00"), "type2"));
          
        } catch (ParseException e) {
            e.printStackTrace();
        }
        EmployeeVacation employeeA = new EmployeeVacation("Abeer", aEmployeeVacation);
        List<EmployeeVacation> employeeVacationList = new ArrayList<EmployeeVacation>();
        employeeVacationList.add(employeeA);
        employeeVacationList.add(employeeA);
        employeeVacationList.add(employeeA);
        return employeeVacationList;
        
    }
}
