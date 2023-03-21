package com.ajdev.viewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spn;

        spn = findViewById(R.id.spnv);

        ArrayList<String> arrlist = new ArrayList<>();

        arrlist.add("jeel");
        arrlist.add("dev");
        arrlist.add("ayushi");
        arrlist.add("nency");
        arrlist.add("keyur");
        arrlist.add("dhrashti");


        Intent intext = new Intent(MainActivity2.this,MainActivity3.class);


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrlist);
        spn.setAdapter(adapter);


    }
}