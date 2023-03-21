package com.ajdev.viewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lstview;

        lstview = findViewById(R.id.listview);

        ArrayList<String> arrlist = new ArrayList<>();

        arrlist.add("jeel");
        arrlist.add("dev");
        arrlist.add("ayushi");
        arrlist.add("nency");
        arrlist.add("keyur");
        arrlist.add("dhrashti");
        arrlist.add("arjun");
        arrlist.add("Shreya");
        arrlist.add("pratik");
        arrlist.add("pujan");
        arrlist.add("heet");
        arrlist.add("jeel");
        arrlist.add("dev");
        arrlist.add("ayushi");
        arrlist.add("nency");
        arrlist.add("keyur");
        arrlist.add("dhrashti");
        arrlist.add("arjun");
        arrlist.add("Shreya");
        arrlist.add("pratik");
        arrlist.add("pujan");
        arrlist.add("heet");

        Intent intext = new Intent(MainActivity.this,MainActivity2.class);


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrlist);
        lstview.setAdapter(adapter);

        lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0;i<=10;i++)
                {
                   if(position == i)
                    startActivity(intext);
                }

            }
        });
    }
}