package com.computer.dpi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    ImageView imageView,textlogo;
    Animation left,top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = findViewById(R.id.dpilogo);
        textlogo = findViewById(R.id.textlogo);

        left = AnimationUtils.loadAnimation(this,R.anim.right_to_left);
        top = AnimationUtils.loadAnimation(this,R.anim.left_to_right);
        imageView.setAnimation(top);
        textlogo.setAnimation(left);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if (networkInfo!=null && networkInfo.isConnected()){
                    Intent myintent= new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(myintent);
                    finish();
                }else {
                    Intent myintent= new Intent(SplashScreen.this,NetworkCheck.class);
                    startActivity(myintent);
                   // Toast.makeText(SplashScreen.this,"Connect your internet connection",Toast.LENGTH_SHORT).show();
                }

            }
        },3500);


    }
}