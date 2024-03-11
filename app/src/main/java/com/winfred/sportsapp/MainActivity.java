package com.winfred.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    List<Sports> sportsList;

    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      adapter view
        recycler_view=findViewById(R.id.recyclerview);

//      data source
        sportsList=new ArrayList<>();
        Sports sport1=new Sports("Volleyball",R.drawable.volleyball);
        Sports sport2=new Sports("Football",R.drawable.football);
        Sports sport3=new Sports("Basketball",R.drawable.basketball);
        Sports sport4=new Sports("Tennis",R.drawable.tennnis);
        Sports sport5=new Sports("Ping Pong",R.drawable.pingpong);

        sportsList.add(sport1);
        sportsList.add(sport2);
        sportsList.add(sport3);
        sportsList.add(sport4);
        sportsList.add(sport5);

//      adapter
        adapter=new CustomAdapter(sportsList);

        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setAdapter(adapter);


    }
}