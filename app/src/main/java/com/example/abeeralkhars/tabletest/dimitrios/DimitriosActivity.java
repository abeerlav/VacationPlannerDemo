package com.example.abeeralkhars.tabletest.dimitrios;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.abeeralkhars.tabletest.R;

/** Created by dimitrios on 22/01/2018. */

public class DimitriosActivity extends AppCompatActivity{
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimitrios);
    
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DimitriosAdapter());
    }
}
