package com.example.mrinalkantiray.nilphamri;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity implements View.OnClickListener {

    Button ek, potvumi, upzila, union, mancitro ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ek=findViewById(R.id.btn_ek_nojor);
        potvumi=findViewById(R.id.btn_potvumi);
        upzila=findViewById(R.id.btn_upzila);
        union=findViewById(R.id.btn_union);
        mancitro=findViewById(R.id.btn_mancitro);

        ek.setOnClickListener(this);
        potvumi.setOnClickListener(this);
        union.setOnClickListener(this);
        upzila.setOnClickListener(this);

        mancitro.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v== ek){
            Fragment fragment;
            fragment=new Fragment();

            fragment=new BlankFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();


        }
        else if (v==potvumi){
            Fragment fragment;

            fragment=new PotvumiFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();


        }
        else if (v==upzila){
            Fragment fragment;

            fragment=new UpzilaFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();

        }
        else if (v==union){
            Fragment fragment=new Fragment();

            fragment=new UnionFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.frg, fragment).commit();

        }

    }
}
