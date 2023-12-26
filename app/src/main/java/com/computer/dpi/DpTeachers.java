package com.computer.dpi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;
import soup.neumorphism.NeumorphTextView;

public class DpTeachers extends AppCompatActivity {

    public static String info = "";
    public static String title = "";

    TextToSpeech textToSpeech;
    FloatingActionButton fabtn;

    NeumorphTextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dp_teachers);

        TextView textView = findViewById(R.id.textview);
        textview = findViewById(R.id.textviewtc);
        fabtn = findViewById(R.id.fltnbtn);
        textToSpeech = new TextToSpeech(DpTeachers.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });
        textView.setText(info);
        textview.setText(title);
        fabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   textToSpeech.speak(""+info,TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });



    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        finish();
    }
}