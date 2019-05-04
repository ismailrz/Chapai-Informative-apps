package com.example.mrinalkantiray.nilphamri;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Others extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    TextView language;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        language= findViewById(R.id.language_txt);

        listView=findViewById(R.id.list_others);


        final String[] name = {"ভাষা ও সংস্কৃতি ", "পত্রপত্রিকা", "জনপ্রতিনিধি"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.listothers, R.id.tex1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            language.setVisibility(View.VISIBLE);
        }
        else {
            Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
        }
//        Fragment fragment = new Fragment();
//        if (position==0){
//            fragment = new BlankFragment();
//        getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();}
//
//        else if (position == 1){
//            fragment = new BlankFragment();
//        getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();}
//
//        else if (position == 2){
//            fragment = new BlankFragment();
//        getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();}

    }
}
