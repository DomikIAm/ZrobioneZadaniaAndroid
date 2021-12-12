package com.example.listmuzyka;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    android.widget.ListView ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Object ListView=(ListView) findViewById(R.id.list);

            ArrayList<String> arrayList=new ArrayList<>();

            arrayList.add("HipHop");
            arrayList.add("RnB");
            arrayList.add("Reggae");
            arrayList.add("Trap");
            arrayList.add("Drill");
            arrayList.add("Rock");
            arrayList.add("Punk Rock");
            arrayList.add("Jazz");
            arrayList.add("Blues");
            arrayList.add("Metal");
     ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);
    ((android.widget.ListView) ListView).setAdapter(arrayAdapter);
        }
    }

