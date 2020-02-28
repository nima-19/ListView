package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView myListView = findViewById(R.id.myListView);
        final ArrayList<String> Country = new ArrayList<>(asList ("India","Japan","Australia","Indonesia","Turkey"));

        /*Let’s assume you want to display a list in your Android app.
        For this you will use the ListView provided by Android.
        ListViews don’t actually contain any data themselves.
        It’s just a UI element without data in it. You can populate your ListViews by using an Android adapter
        
        Adapter is an interface whose implementations provide data and control the display of that data.
        ListViews own adapters that completely control the ListView’s display.
        So adapters control the content displayed in the list as well as how to display it.
        */
        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Country);
        myListView.setAdapter(Adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Good Morning " + Country.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
