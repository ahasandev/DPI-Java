package com.computer.dpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class Devloperinfo extends AppCompatActivity {


    RecyclerView recyclerView;

    HashMap<String,String> hashMap;

    ArrayList< HashMap<String,String> > arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devloperinfo);

        recyclerView = findViewById(R.id.recycleview2);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/340089407_617451386896330_2175531403189702445_n.jpg?_nc_cat=103&cb=99be929b-59f725be&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=lCn2y2fs2AAAX8DvyvA&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfAXbq1zXCuInQfyDz3aiMAptXFXi3oLKpjlbSeQfMlziQ&oe=648CA320");
        hashMap.put("name","Md Ahasan");
        hashMap.put("last_nm","Apps Devloper & Desinger");
        hashMap.put("phone","01311893538");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/344241986_643872604220121_7361810619027628246_n.jpg?_nc_cat=108&cb=99be929b-59f725be&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=oAmv7o4ggIkAX9BcOVw&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfBZRi1mZjIq1MW4xyjYgIFA8Ulm6-UWpUyebUbZ9NniVQ&oe=648CC88C");
        hashMap.put("name","Md Sowrov Islam");
        hashMap.put("last_nm","Apps Desinger");
        hashMap.put("phone","01311893538");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/280233290_1156224025230294_7746646062801013535_n.jpg?_nc_cat=100&cb=99be929b-59f725be&ccb=1-7&_nc_sid=174925&_nc_ohc=xjGdN_MiaMIAX8LYQdx&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfA0nkrbWsLkXANWoRYUq-MmZrqWwwvkeHsqOhN1H2fW0A&oe=648D0366");
        hashMap.put("name","Md Sohag Hosen");
        hashMap.put("last_nm","Content Provider");
        hashMap.put("phone","01568292695");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/312465596_1166950700867767_2256311815192139643_n.jpg?_nc_cat=108&cb=99be929b-59f725be&ccb=1-7&_nc_sid=174925&_nc_ohc=bR7owtYHVJ8AX_wy79f&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfCnApTX_MurJeFh6YzwLntS4Qsz07OS8k1cfHa2L1n52g&oe=648D0FE9");
        hashMap.put("name","Md Shakil Hossain");
        hashMap.put("last_nm","App Desinger");
        hashMap.put("phone","01311893538");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/343423457_253042707240398_7899732038969465640_n.jpg?_nc_cat=109&cb=99be929b-59f725be&ccb=1-7&_nc_sid=174925&_nc_ohc=92MoEG9EIs4AX_pV8Wu&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfC7Q1Xq3Lht87v-q9e80HH2SoNqlYTdoUMHeh7fAL_iGw&oe=648CEF99");
        hashMap.put("name","Mansur Nadim");
        hashMap.put("last_nm","Flutter Apps Devloper");
        hashMap.put("phone","01311893538");
        arrayList.add(hashMap);

        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager( new  LinearLayoutManager(Devloperinfo.this));





    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>{
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
            holder.textlstnm.setText(lastnm);
            holder.textphn.setText("Phone: "+phone);
            Picasso.get().load(imge)
                    .placeholder(R.drawable.computer)
                    .into(holder.imageView);
            holder.viceprnciple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Devloperinfo.this, Details.class));
                }
            });
            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class myviewholder extends RecyclerView.ViewHolder{
            LinearLayout viceprnciple;
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
    }

}