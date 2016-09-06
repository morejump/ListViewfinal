package com.example.hp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> list;
    private CustomAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        listView = (ListView) findViewById(R.id.listview);
        list = new ArrayList<>();
        for (int i=0;i<10;i++){
            String id= i+"";
            list.add(new Student("thao dep trai",id));
        }
        adapter= new CustomAdapter(list,this);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
