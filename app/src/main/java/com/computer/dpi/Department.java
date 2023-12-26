package com.computer.dpi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import soup.neumorphism.NeumorphCardView;

public class Department extends AppCompatActivity {

    ListView listView;
    HashMap<String,String> hashMap;
    ArrayList < HashMap<String,String> > arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        listView = findViewById(R.id.listviewdp);

        createtable();
        Myadapter myadapter = new Myadapter();
        listView.setAdapter(myadapter);

    }//====================

    public class Myadapter extends BaseAdapter{

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
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder") View myview = layoutInflater.inflate(R.layout.griditem,parent,false);

            LinearLayout griditem = myview.findViewById(R.id.griditem);
            ImageView imageView = myview.findViewById(R.id.image);
            TextView textView = myview.findViewById(R.id.text);
            NeumorphCardView gridlayout = myview.findViewById(R.id.cardview);
            LinearLayout gridlay = myview.findViewById(R.id.gridlay);

            HashMap<String,String> hashMap1 = arrayList.get(position);

            String img = hashMap1.get("img_url");
            String tilte = hashMap1.get("title");
            String info = hashMap1.get("info");

            textView.setText(tilte);

            Picasso.get().load(img)
                    .placeholder(R.drawable.loading_pic)
                    //.resize(150,150)
                    .into(imageView);

            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_lft);
            gridlay.setAnimation(anim);
            anim.start();

            griditem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                DpTeachers.info = info;
                DpTeachers.title = tilte;
                    startActivity(new Intent(Department.this, DpTeachers.class));
                }
            });
            return myview;
        }
    }

    private void createtable(){
        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=aC26cLjb3oCq&format=png");
        hashMap.put("title","Computer");
        hashMap.put("info","The contribution of computer science and technology in building digital Bangladesh is undeniable. By acquiring knowledge about computer hardware, software and network, students of this technology employ themselves in various government and private jobs including banks, insurance and financial institutions and play an important role in earning foreign exchange through freelancing. Also, Computer Science and Technology plays a leading role in the development of the country and nation through self-employment.\n" +
                "\n" +
                "Computer Science and Technology Labs are: \n" +
                "\n" +
                "1. Software Lab\n" +
                "\n" +
                "2. Digital Lab\n" +
                "\n" +
                "3. Hardware Lab\n" +
                "\n" +
                "4. Network Lab");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=48852&format=png");
        hashMap.put("title","Civil");
        hashMap.put("info","A coveted little house, people have been trying their best to decorate it as beautifully as possible since time immemorial. Global skyscrapers are being built, millions and millions of dollars are being spent on construction, but it does not seem to satisfy the people. The Taj Mahal in Agra still lingers in people's minds as one of the world's most stunning architectural masterpieces. Communication infrastructure, housing infrastructure, the strategies that people have invented to build a planned city, these strategists are today considered as civil engineers. Civil Engineers do all the work including planning, estimating, designing, building, road, bridge, culvert, dam, water works, sewerage works, plumbing, material testing, soil testing, hydrological works, surveying etc. In addition, the field level works are supervised for implementation, quality control of work, cost calculation, consultation and control of construction workers, etc. He was initially appointed as Sub-Assistant Engineer (in some cases Assistant Engineer) in government-semi-government and non-government organizations including Public Works Department, Roads and Highways Department, Water Development Board, Power Development Board, LGED, Facilities, Railways. There are a wide range of jobs for civil engineering diploma graduates in the construction business. Diploma in Civil Engineering has a huge field of work in many countries of the world, including the Middle East and the Middle East. Main subjects: Civil Engineering, Drawing, Estimating, Civil Engineering Materials and Material Testing, Soil Mechanics, Structural Mechanics, Theory and Design of Structures, Hydraulics, Highways and Railways. Civil engineering education can be taken as a challenge to build a prosperous life.\n" +
                "\n" +
                "\n" +
                "Civil Technology Labs:\n" +
                "\n" +
                "1. Construction shop\n" +
                "\n" +
                "2. Plumbing shop\n" +
                "\n" +
                "3. Material testing lab\n" +
                "\n" +
                "4. Soil Mechanics Lab\n" +
                "\n" +
                "5. Survey Lab\n" +
                "\n" +
                "6. Woodshop");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=gHaGldrJQ6Uq&format=png");
        hashMap.put("title","Power");
        hashMap.put("info","Power technology\n" +
                "\n" +
                "Power Technology is one of the four technologies currently being taught at Dinajpur Polytechnic Institute. While studying this technology, a student will be provided with (a) Automobile Engine and Power Transmission System and Body Building (b) Steam Generation (Boiler), Steam Engine and Steam Turbine, (c) Pumps, Hydronics Machinery, Fluid Mechanics, Fluid Mechanics ( , Transmission and Distribution, (e) Lifting Tackles, Hysteres and Mechanical Machine Tools. After passing Diploma in Engineering from Power Technology, there are ample opportunities for self-employment in government, semi-government, autonomous organizations, private organizations, NGOs in addition to being employed as Deputy Assistant Engineers, especially Assistant Engineers. Notable among the organizations which have employment opportunities are: Junior Instructor in Polytechnic Institute and Deputy Assistant Engineer in the second category with the post of Public Works Department, Roads and Highways Department, Housing and Settlement, Power Development Board, Water Development Board, Food and Sugar Industries Corp. Chemical Industries Corporation, Steel and Engineering Corporation, BADC, Rural Electrification Board, Palli Bidyut Samiti, T&T Department etc.\n" +
                "\n" +
                "Due to the preparation of Power Technology syllabus combining different subjects of Electrical Technology and Mechanical Technology, the students of this department become proficient in both Electrical and Mechanical Technology. Graduates from this technology are contributing to building a strong national economic base by earning a lot of foreign exchange by working abroad with great skill and reputation.\n" +
                "\n" +
                "\n" +
                "Power Division\n" +
                "\n" +
                "1. Autodiesel shop\n" +
                "\n" +
                "2. Power Generation Shop\n" +
                "\n" +
                "3. Refrigeration & Air Conditioning Shop\n" +
                "\n" +
                "4. Hydraulics Lab\n" +
                "\n" +
                "5. Steam Engine Lab");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=zJbipKeOOp5A&format=png");
        hashMap.put("title","Mechanical");
        hashMap.put("info","Mechanical technology has a spiritual connection with the evolution of civilization. With the discovery of the wheel came the speed of evolution of civilization. The invention of the steam engine revolutionized the production process. Until the advent of the electronic age, mechanical technology perfected world civilization and its importance has not diminished to this day. That is why mechanical technology is called the mother of all technologies. All types of metals, rubber, plastics, glass making are covered by mechanical technology. Mechanical engineers carry out the planning, design and process of making all kinds of mills, including machine machines and car engines. Diploma in Mechanical Engineering has a wide range of jobs in government, private and semi-government and NGOs. Mechanical Diplomas in Institutions like Public Works Department, Roads and Highways Department, Railways, Water Development Board, Telecommunication, Steel Mills, Jute Mills, Cotton Mills, Small and Cottage Industries Companies etc. There are also a wide range of job opportunities for Mechanical Engineering Diploma graduates abroad. Main Textbooks on Mechanical Technology: Manufacturing Process, Production Planning and Control, Vending, Foundry and Pattern Making, Metallurgy and Heat Treatment, Machine Shop Practice, Machine Design, Strength of Materials. This technology can be considered as a good way of self-employment.\n" +
                "\n" +
                "\n" +
                "Mechanical Technology Labs:\n" +
                "\n" +
                "1. Machine shop\n" +
                "\n" +
                "2. Welding shop\n" +
                "\n" +
                "3. Sheet Metal Shop\n" +
                "\n" +
                "4. Foundry and pattern making shop\n" +
                "\n" +
                "5. Metallurgy and testing lab");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=EvmKTdQmsDL5&format=png");
        hashMap.put("title","Electrical");
        hashMap.put("info","Electricity is considered as the main source of energy in modern civilization. Electrical energy is controlling today's development and civilization all over the world in the evolution of the present civilization. The current civilization is obsolete without electronics equipment. Diploma in Electrical Engineering graduates work in the production, repair and maintenance of electrical equipment, including power generation, transmission and distribution, and in the electrical fields. Electrical Engineering Diploma in Government, Semi-Government and Non-Governmental Institutions including Sub-Assistant Engineer, Primary Engineer in Primary, Government and Private Institutions Are employed. There are a wide range of jobs for electrical engineers in Bangladesh at the private level. In addition, there is a high demand for electrical engineering diploma graduates in other countries of the world including the Middle East, Japan, Korea, Singapore. The main subjects in this technology are: Basic Electricity, Electrical Planning and Acquisition, Electrical Circuits, Electrical Machines, Switch Gears and Protective Devices, Encryption and Distribution. Electrical engineering can be taken as a good medium for building challenging lives.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Electrical category:\n" +
                "\n" +
                "1. Electrical Machine Shop\n" +
                "\n" +
                "2. Electrical Wiring Lab\n" +
                "\n" +
                "3. Electronics Lab\n" +
                "\n" +
                "4. Computer lab");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img_url","https://img.icons8.com/?size=512&id=9496&format=png");
        hashMap.put("title","Architecture");
        hashMap.put("info","Land is running out, population is increasing. Architecture technology is not equipped to deal scientifically with this adverse situation. The housing system of a developing country like ours is expanding and architecture technology is the need of the hour for this task. The students of this technology come out of the institution as sub-assistant engineers and draftsmen in RAJUK, Public Works, Directorate of Architecture, Directorate of Archeology, Technical Education Board, educational institutions under Directorate of Technical Education, various banks, architectural and structural firms/organizations. Also, the opportunity to serve the country and nation through self-employment is immense.\n" +
                "\n" +
                "Architecture Technology Labs:\n" +
                "\n" +
                "1. CAD Lab\n" +
                "\n" +
                "2. Drafting Lab\n" +
                "\n" +
                "3. Model Making Lab\n" +
                "\n" +
                "4. Rendering and Animation Lab");
        arrayList.add(hashMap);


    }


}//===================