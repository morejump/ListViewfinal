package com.example.hp.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static com.example.hp.listview.R.id.txt_id;
import static com.example.hp.listview.R.id.txt_name;

/**
 * Created by HP on 9/6/2016.
 */
public class CustomAdapter extends BaseAdapter {
    ArrayList<Student> list;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(ArrayList<Student> list, Context context) {
        this.list = list;
        this.context = context;
        inflater= inflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= inflater.inflate(R.layout.item_on_list,null);
        if (view!=null){
            TextView txtName= (TextView) view.findViewById(txt_name);
            TextView txtID= (TextView) view.findViewById(txt_id);
            txtName.setText(list.get(i).getName());
            txtID.setText(list.get(i).getID());
        }
        return view;
    }
}
