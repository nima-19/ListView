package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> Country = new ArrayList<>();
        Country.add("India");
        Country.add("Japan");
        Country.add("Australia");
        Country.add("Indonesia");
        Country.add("Turkey");
        /*Let’s assume you want to display a list in your Android app.
        For this you will use the ListView provided by Android.
        ListViews don’t actually contain any data themselves.
        It’s just a UI element without data in it. You can populate your ListViews by using an Android adapter

        Adapter is an interface whose implementations provide data and control the display of that data.
        ListViews own adapters that completely control the ListView’s display.
        So adapters control the content displayed in the list as well as how to display it.
        */
        ArrayAdapter<String> Adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Country);
        myListView.setAdapter(Adapter);
    }
}
