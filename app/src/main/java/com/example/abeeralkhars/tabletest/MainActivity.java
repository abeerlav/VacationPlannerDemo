package com.example.abeeralkhars.tabletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.abeeralkhars.tabletest.model.EmployeeVacation;
import com.example.abeeralkhars.tabletest.model.Vacation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private LinearLayoutManager linearLayoutManager, linearLayoutManagerEmployee;
    private RecyclerView recyclerViewEmployeeVacation, recyclerViewEmployee;
    private RecyclerViewAdapter recyclerViewAdapter;
    private EmployeeAdapter employeeAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);
        
        /*List<EmployeeVacation> rowListItem = getAllEmployeesVacations();
        
        linearLayoutManager = new LinearLayoutManager(MainActivity.this) {
    
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        linearLayoutManagerEmployee = new LinearLayoutManager(MainActivity.this) {
    
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        
        recyclerViewEmployeeVacation = (RecyclerView) findViewById(R.id.recycler_view_employee_vacation);
        recyclerViewEmployee = (RecyclerView) findViewById(R.id.recycler_view_employee);
        
        employeeAdapter = new EmployeeAdapter(MainActivity.this, rowListItem);
        recyclerViewEmployee.setLayoutManager(linearLayoutManagerEmployee);
        recyclerViewEmployee.setAdapter(employeeAdapter);
        
        
        // recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        recyclerViewEmployeeVacation.setLayoutManager(linearLayoutManager);
        recyclerViewEmployeeVacation.setAdapter(recyclerViewAdapter);
        */
    }
    
}
  /*  private List<EmployeeVacation> getAllEmployeesVacations() {
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
    
}*/

