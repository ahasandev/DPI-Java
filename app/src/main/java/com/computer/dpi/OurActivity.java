package com.computer.dpi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class OurActivity extends AppCompatActivity {

    WebView webView;
    RecyclerView recyclerView;
    HashMap<String,String>hashMap;
    ArrayList< HashMap<String,String> > arrayList = new ArrayList<>();

    VideoView videoView;
    LinearLayout Layoutcm,history,postlay,layut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ouractivity);

        webView = findViewById(R.id.webview);
        recyclerView = findViewById(R.id.recycleview);
        Layoutcm = findViewById(R.id.campus);
        history = findViewById(R.id.history);
        postlay = findViewById(R.id.posayut);
        layut = findViewById(R.id.layut);

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.youtube.com/embed/kLg1BDV32O8?controls=0");

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setVisibility(View.GONE);
                layut.setVisibility(View.VISIBLE);
                layoutInflater.inflate(R.layout.history,postlay);

            }
        });
        layut.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);

        if (Layoutcm!=null){
            Layoutcm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    arrayList = new ArrayList<>();
                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/347437200_780597033801471_4791489264756437280_n.jpg?_nc_cat=111&cb=99be929b-59f725be&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=9AQdd0IZqeUAX8p8OVc&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfCsAjJFMQ059-mqjHNNwOUnmQXIblhI2z9gLHB9O3IJeA&oe=648DDFAD");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://dinajpurpolytechnicinstituteweb.files.wordpress.com/2016/05/photo0186.jpg?w=584");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fjsr14-1.fna.fbcdn.net/v/t39.30808-6/347248745_717951263349069_3351527343202057548_n.jpg?_nc_cat=101&cb=99be929b-59f725be&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=-a_Hp5PLeT0AX8ur401&_nc_oc=AQlYHTCoEAnCc4ypGPeTs_CD94-E0ubrn_vCMTVZuBz6IJle_AmDTgubw2ed7o_qYI4&_nc_ht=scontent.fjsr14-1.fna&oh=00_AfAe2wqXhFE0d4fSouOaZUJykOD4U1UyTjLTqaSCQfo7uA&oe=648E5087");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fdac7-1.fna.fbcdn.net/v/t39.30808-6/347564121_268805075539357_2250809988337221012_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=t5NzJDSBixYAX-Qitrz&_nc_ht=scontent.fdac7-1.fna&oh=00_AfDQKg0R9CDz0_Pm5qWUrBC0oYL_XPctd-oZVfLUL3NsDQ&oe=647121AB");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fdac7-1.fna.fbcdn.net/v/t39.30808-6/347582136_974408473584957_3177044950002552388_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=ySYoHin2ILEAX_bfSYp&_nc_ht=scontent.fdac7-1.fna&oh=00_AfBmMF2HSTgbRGXADVXfsPOarnx7yVD3H6IiRUbNRmjwNw&oe=6470256D");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fdac7-1.fna.fbcdn.net/v/t39.30808-6/346893027_172582522167407_69565266945346159_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=p3Wa7nsLRpMAX-V0nXj&_nc_ht=scontent.fdac7-1.fna&oh=00_AfATHrEGLijHO9Yiy4nVyc-Ro5uyadQyJV3GgYMBgBMHrA&oe=647DE975");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fdac7-1.fna.fbcdn.net/v/t39.30808-6/347417268_254256013883765_5789985036394658446_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=yzq09QzQIWcAX8S6LP3&_nc_oc=AQkb-uRoLNUPT0BpTleT84gcobQ8pzlLnpnzhSA0mb9x7PY3HGQayv7iV7_vHqT0alM&_nc_ht=scontent.fdac7-1.fna&oh=00_AfBR_4EsTKUmFP9k0_HVetjL6kbu1CNnQkrgxBkHcLYo_Q&oe=647EF086");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("img_url","https://scontent.fdac7-1.fna.fbcdn.net/v/t39.30808-6/347582136_974408473584957_3177044950002552388_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5cd70e&_nc_ohc=ySYoHin2ILEAX_bfSYp&_nc_ht=scontent.fdac7-1.fna&oh=00_AfBmMF2HSTgbRGXADVXfsPOarnx7yVD3H6IiRUbNRmjwNw&oe=6470256D");
                    arrayList.add(hashMap);

                    recycleview();
                }
            });
        }












    }//=======================end================================

    private void recycleview(){
        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(OurActivity.this));
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>{
        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View myview = layoutInflater.inflate(R.layout.griditem,parent,false);

            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_to_right);
            myview.setAnimation(anim);
            anim.start();




            return new myviewholder(myview);
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, int position) {
            holder.cardView1.setVisibility(View.GONE);
            holder.cardView2.setVisibility(View.VISIBLE);
            hashMap = arrayList.get(position);
            String imge = hashMap.get("img_url");

            Picasso.get().load(imge)
                    .placeholder(R.drawable.e)
                    .into(holder.imageView);

            holder.likebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_lft);
                    v.setAnimation(anim);
                    anim.start();
                    holder.likebtn.setImageResource(R.drawable.loved);
                }
            });

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(OurActivity.this, Details.class));
                }
            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class myviewholder extends RecyclerView.ViewHolder{
            ImageView imageView,likebtn,dnldbtn,sharebtn;
            NeumorphCardView cardView1,cardView2;
            public myviewholder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view1);
                likebtn = itemView.findViewById(R.id.likebtn);
                dnldbtn = itemView.findViewById(R.id.likebtn);
                sharebtn = itemView.findViewById(R.id.likebtn);
                cardView1 = itemView.findViewById(R.id.cardview);
                cardView2 = itemView.findViewById(R.id.cardview2);
            }
        }
    }


}//==============================end=============================