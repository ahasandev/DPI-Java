package com.computer.dpi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    HashMap<String,String>hashMap;
    ArrayList< HashMap<String,String> >arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageSlider imageSlider = findViewById(R.id.image_slider);
        TextView textView = findViewById(R.id.slidetext);
        gridView = findViewById(R.id.gridview);




        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.imge_a,null));
        imageList.add(new SlideModel(R.drawable.img_b,null));
        imageList.add(new SlideModel(R.drawable.img_c,null));
        imageList.add(new SlideModel(R.drawable.d,null));
        imageList.add(new SlideModel(R.drawable.e,null));
        imageList.add(new SlideModel(R.drawable.f,null));

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

        textView.setSelected(true);


        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=XKedzxVhRNPR&format=png");
        hashMap.put("title","আমাদের সম্পর্কে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=RbZ6gvRlezDb&format=png");
        hashMap.put("title","নোটিস বোর্ড");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=zSG1XVzrBHr2&format=png");
        hashMap.put("title","Student");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=zSG1XVzrBHr2&format=png");
        hashMap.put("title","বিভাগ সমূহ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=XhfX3aiqxB7P&format=png");
        hashMap.put("title","শিক্ষকবৃন্দ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=FTU2vwqfG62T&format=png");
        hashMap.put("title","একাডেমিক কার্যক্রম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=26036&format=png");
        hashMap.put("title","ফলাফল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=9918&format=png");
        hashMap.put("title","ওয়েবসাইট");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=77&format=png");
        hashMap.put("title","Developer Info");
        arrayList.add(hashMap);

        MyAdapter myAdapter = new MyAdapter();
        gridView.setAdapter(myAdapter);








    }//=====================Oncreate End=====================================


    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
       // super.onBackPressed();

        new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.dpilogos)
                .setTitle("Exit")
                .setMessage("Are you sure to exit ?")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                       finishAffinity();
                    }
                })
                .show();


    }

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview = inflater.inflate(R.layout.griditem,parent,false);

            ImageView imageView = myview.findViewById(R.id.image);
            TextView textView = myview.findViewById(R.id.text);
            LinearLayout glayout = myview.findViewById(R.id.griditem);
            NeumorphCardView gridlayout = myview.findViewById(R.id.cardview);


            HashMap<String,String> hashMap1 = arrayList.get(position);

            String img = hashMap1.get("img_url");
            String tilte = hashMap1.get("title");

            textView.setText(tilte);

            Picasso.get().load(img)
                    .placeholder(R.drawable.computer)
                    //.resize(150,150)
                    .into(imageView);

            // Move this initialization to constructor so that its not initalized again and again.
            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_lft);
            gridlayout.setAnimation(anim);
            anim.start();

            glayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if (tilte.contains("আমাদের সম্পর্কে")){
                        startActivity(new Intent(MainActivity.this,OurActivity.class));
                        Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                    } else if (tilte.contains("নোটিস বোর্ড")) {
                       Website.url ="https://www.facebook.com/groups/178292382990080";
                       startActivity(new Intent(MainActivity.this,Website.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("বিভাগ সমূহ")) {
                       startActivity(new Intent(MainActivity.this,Department.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("শিক্ষকবৃন্দ")) {
                       startActivity(new Intent(MainActivity.this,Teachers.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("একাডেমিক কার্যক্রম")) {
                       Website.url ="https://www.dpi.edu.bd/saf_forms/form";
                       startActivity(new Intent(MainActivity.this,Acadamic.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("ফলাফল")) {
                       Website.url="https://btebresultszone.com";
                       startActivity(new Intent(MainActivity.this,Website.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("ওয়েবসাইট")) {
                       Website.url="http://www.bteb.gov.bd/";
                       startActivity(new Intent(MainActivity.this,Website.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else if (tilte.contains("Developer Info")) {
                       Website.url ="https://m.facebook.com/ajaira.masti.501?eav=AfapYmjcOoIj7FGRXAb5bLtpUcU0lqtSwU0IkyNWRRE8qz5EYhldt-QhdlveUrHNf-8&paipv=0";
                       startActivity(new Intent(MainActivity.this,Devloperinfo.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }else{
                       startActivity(new Intent(MainActivity.this,OurActivity.class));
                       Toast.makeText(MainActivity.this,"Go to",Toast.LENGTH_SHORT).show();
                   }
                }
            });//==============








            return myview;
        }
    }//======================myview=======================





}//==========================================================================