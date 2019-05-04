package com.example.mrinalkantiray.nilphamri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button about, namkoron,geographic, eastPakistan, administration, persons, place,language,education,religious, tevagaAndolon, gomvira,
            economic,mango;
    DatePicker datePicker;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=findViewById(R.id.date_pick);
        textView=findViewById(R.id.today_txt);


        about=findViewById(R.id.btn_about);
        geographic=findViewById(R.id.btn_geographic_area);
        namkoron=findViewById(R.id.btn_namkoron);
        eastPakistan=findViewById(R.id.btn_eastPakistan);
        administration=findViewById(R.id.btn_administration);
        persons=findViewById(R.id.btn_persons);
        place=findViewById(R.id.btn_place);
        language=findViewById(R.id.btn_language);
        education=findViewById(R.id.btn_education);
        religious=findViewById(R.id.btn_religious);
        tevagaAndolon=findViewById(R.id.btn_tevagaAndolon);
        gomvira=findViewById(R.id.btn_gomvira);
        economic=findViewById(R.id.btn_economic);
        mango=findViewById(R.id.btn_mango);



        String value="Today: " +datePicker.getDayOfMonth() +":"+ (datePicker.getMonth()+1)+":"
                +datePicker.getYear();
        textView.setText(value);



        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), About.class);
                startActivity(intent);

            }
        });



        geographic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), geography.class);
                startActivity(intent);

            }
        });
        namkoron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), namkoron.class);
                startActivity(intent);

            }
        });


        eastPakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), eastPakistan.class);
                startActivity(intent);

            }
        });



        administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Administration.class);
                startActivity(intent);

            }
        });



        persons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Persons.class);
                startActivity(intent);

            }
        });


        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), All_place.class);
                startActivity(intent);

            }
        });

        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), language.class);
                startActivity(intent);

            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), education.class);
                startActivity(intent);

            }
        });

        religious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), religious.class);
                startActivity(intent);

            }
        });




        tevagaAndolon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), tevagaAndolon.class);
                startActivity(intent);

            }
        });
        gomvira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), gomvira.class);
                startActivity(intent);

            }
        });
     economic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), economic.class);
                startActivity(intent);

            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), mango.class);
                startActivity(intent);

            }
        });













    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_dev :
                Intent intent=new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(intent);
                break;
            default:
                Intent intet=new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(intet);
                break;

        }
        return super.onOptionsItemSelected(item);
    }


}
