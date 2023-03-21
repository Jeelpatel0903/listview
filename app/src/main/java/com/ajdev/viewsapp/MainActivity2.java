package com.ajdev.viewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spn;
        AutoCompleteTextView autocom;

        spn = findViewById(R.id.spnv);
        autocom = findViewById(R.id.autocom);

        ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrcity = new ArrayList<>();


        arrlist.add("jeel");
        arrlist.add("dev");
        arrlist.add("ayushi");
        arrlist.add("nency");
        arrlist.add("keyur");
        arrlist.add("dhrashti");


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrlist);
        spn.setAdapter(adapter);

        arrcity.add("ahmedabad");
        arrcity.add("surat");
        arrcity.add("baroda");
        arrcity.add("rajkot");
        arrcity.add("jamnagar");
        arrcity.add("panchmahal");
        arrcity.add("surendrnagar");
        arrcity.add("kathch");
        arrcity.add("mandvi");
        arrcity.add("gujrat");



        //Intent intext = new Intent(MainActivity2.this,MainActivity3.class);



        ArrayAdapter auto = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrlist);
        autocom.setAdapter(auto);
        autocom.setThreshold(1);


    }
}