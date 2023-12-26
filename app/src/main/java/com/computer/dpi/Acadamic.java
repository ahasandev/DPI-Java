package com.computer.dpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Acadamic extends AppCompatActivity {

    TextView textview;

    String string = "Dinajpur Polytechnic Institute\n" +
            "Dinajpur-5200.\n" +
            "Tel: 88-0531-65573, \n" +
            "Email:  contact@dpi.edu.bd\n" +
                    "dpi_dinajpur@yahoo.com\n" +
                    "principal_dpibd@yahoo.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acadamic);

        textview = findViewById(R.id.textcnt);
        textview.setText(string);


    }
}