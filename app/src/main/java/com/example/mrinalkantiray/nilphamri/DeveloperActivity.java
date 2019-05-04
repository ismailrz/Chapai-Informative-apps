package com.example.mrinalkantiray.nilphamri;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class DeveloperActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton dial, fb, twit;
    Button fedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        dial = findViewById(R.id.dial);
        fb = findViewById(R.id.fb);
        twit = findViewById(R.id.twit);
        fedback = findViewById(R.id.fedback);
        dial.setOnClickListener(this);
        fb.setOnClickListener(this);
        twit.setOnClickListener(this);
        fedback.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == dial) {
            Intent a = new Intent(Intent.ACTION_CALL);
            a.setData(Uri.parse("tel:+8801743557172"));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(a);
            //Intent intent = new Intent(Intent.ACTION_CALL);
            //intent.setData(Uri.parse("tel:+8801744955241"));
            //if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
               // return;
            //}
            //startActivity(intent);


        }

        else if (v==fb){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mdismailhossainrz")));


        }
        else if (v==twit){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/mdismailrz")));


        }
        else if (v==fedback){
            Toast.makeText(getApplicationContext(), "Thank You ", Toast.LENGTH_SHORT).show();

        }
    }
}
