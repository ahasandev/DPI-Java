package com.computer.dpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;


public class Teachers extends AppCompatActivity {

    RecyclerView recyclerView;

    LinearLayout linearLayout;

    NeumorphCardView computer;


    HashMap<String,String>hashMap;
    ArrayList<HashMap<String,String>>arrayList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);


        recyclerView = findViewById(R.id.recycleview);
        linearLayout =findViewById(R.id.hzscroll);
        computer = findViewById(R.id.computer);

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList = new ArrayList<>();
                cumpter();
                setdata();
            }

        });
        employs();
        setdata();






    }//=====================oncreate end===============
    private void setdata(){
        Myadapter adapter = new Myadapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Teachers.this));
    }


    private class Myadapter extends RecyclerView.Adapter<Myadapter.myviewholder> {

        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View myview = layoutInflater.inflate(R.layout.empolyees, parent, false);

            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_to_right);
            myview.setAnimation(anim);
            anim.start();

            return new myviewholder(myview);
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, int position) {
            hashMap = arrayList.get(position);
            String imge = hashMap.get("img_url");
            String name = hashMap.get("name");
            String lastnm = hashMap.get("last_nm");
            String phone = hashMap.get("phone");

            holder.textname.setText(name);
            holder.textlstnm.setText("পদবী :"+lastnm);
            holder.textphn.setText("ফোন :"+phone);

            Picasso.get().load(imge)
                    .placeholder(R.drawable.loading_pic)
                    .into(holder.imageView);

            holder.viceprnciple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Teachers.this, Details.class));
                }
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class myviewholder extends RecyclerView.ViewHolder {

            LinearLayout viceprnciple ;
            ImageView imageView;
            TextView textname,textlstnm,textphn;
            public myviewholder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                textname = itemView.findViewById(R.id.text_view);
                textlstnm = itemView.findViewById(R.id.text_view2);
                textphn = itemView.findViewById(R.id.text_view3);
                viceprnciple = itemView.findViewById(R.id.viceprnciple);
            }
        }


    }//=====================end========================

    private void employs(){

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/ff5f2206c4d54fb46434692ac93d5286.jpg");
        hashMap.put("name","Md. Sabuj Islam");
        hashMap.put("last_nm","Craft Instructor (TR) Civil");
        hashMap.put("phone","01723280704");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/9f22a8c773cc35f10975ef1f49b23746.jpg");
        hashMap.put("name","Samrat Hossain");
        hashMap.put("last_nm","Craft Instructor (Shop) Mechanical");
        hashMap.put("phone","01785405052");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/ff5f2206c4d54fb46434692ac93d5286.jpg");
        hashMap.put("name","Md. Firoz Elahi");
        hashMap.put("last_nm","Craft instructor (TR), Electrical");
        hashMap.put("phone","01723070277");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/c4c787d355ffe8a636da38280441fa7e.jpg");
        hashMap.put("name","MD. ARIFUL ISLAM");
        hashMap.put("last_nm","Craft Instructor(Shop), Computer");
        hashMap.put("phone","01737557993");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/c02b50017e7b6499ed605172fa50f8fa.jpg");
        hashMap.put("name","Md. Moholail Hossain");
        hashMap.put("last_nm","Lab Assistant (Non-Tech)");
        hashMap.put("phone","01726898442");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/415b396ce73f1dad1474b8fd5a123440.png");
        hashMap.put("name","Md. Rashed Uzzaman");
        hashMap.put("last_nm","Craft Instructor(TR), AIDT");
        hashMap.put("phone","01767299197");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/ff5f2206c4d54fb46434692ac93d5286.jpg");
        hashMap.put("name","Md. Asha Sarker");
        hashMap.put("last_nm","Book Sorter");
        hashMap.put("phone","01931454018");
        arrayList.add(hashMap);
    }
    private void cumpter(){
        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/c02b50017e7b6499ed605172fa50f8fa.jpg");
        hashMap.put("name","Md. Moholail Hossain");
        hashMap.put("last_nm","Lab Assistant (Non-Tech)");
        hashMap.put("phone","01726898442");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/415b396ce73f1dad1474b8fd5a123440.png");
        hashMap.put("name","Md. Rashed Uzzaman");
        hashMap.put("last_nm","Craft Instructor(TR), AIDT");
        hashMap.put("phone","01767299197");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://www.dpi.edu.bd/img/employee/large/ff5f2206c4d54fb46434692ac93d5286.jpg");
        hashMap.put("name","Md. Asha Sarker");
        hashMap.put("last_nm","Book Sorter");
        hashMap.put("phone","01931454018");
        arrayList.add(hashMap);
    }




}//==================================