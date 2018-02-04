package com.example.saby7.apratcise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText et;
Button bt;
String n;
String nm;
TextView tv;
Saby s;
ArrayList<String> arrayList = new ArrayList<>();
ListView lv;
ArrayAdapter aa ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);

        bt=findViewById(R.id.bt);
        lv=findViewById(R.id.lv);
        aa=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 n = et.getText().toString();
               s = new Saby(n);

//            s.name = "pk";
           // String mm = s.name;
//                   String nm= s.name=n;
//
//                               arrayList.add(nm);







            }
        });

    }
    public void show(String n)
    {
        String nm =n;
        arrayList.add(nm);

            lv.setAdapter(aa);
            aa.notifyDataSetChanged();
    }
}
