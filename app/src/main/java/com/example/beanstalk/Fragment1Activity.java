package com.example.beanstalk;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Fragment1Activity extends AppCompatActivity {
    MyDBHelper2 myDBHelper;
    ArrayList<CertificateData> CerDateList;

    //자격증 정보
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1);

        // 검색창 제외 메뉴바 (모든 FragmentActivity 상단에 복붙하세요.

        Button btn_1 = (Button) findViewById(R.id.btn_menu1);
        Button btn_2 = (Button) findViewById(R.id.btn_menu2);
        Button btn_3 = (Button) findViewById(R.id.btn_menu3);
        Button btn_4 = (Button) findViewById(R.id.btn_menu4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Fragment1Activity.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Fragment2Activity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Fragment3Activity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Fragment4Activity.class);
                startActivity(intent);
            }
        });

//        myDBHelper = new MyDBHelper2(this);
//        SQLiteDatabase DB = myDBHelper.getReadableDatabase();
//        Cursor cursor = DB.rawQuery("select * from certificate", null);
//
//        while (cursor.moveToNext()){
//            CerDateList.add(new CertificateData(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(4), cursor.getInt(5)));
//        }
//
//        cursor.close();
//        DB.close();

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn13 = (Button) findViewById(R.id.btn13);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button btn16 = (Button) findViewById(R.id.btn16);
        Button btn17 = (Button) findViewById(R.id.btn17);
        Button btn18 = (Button) findViewById(R.id.btn18);
        Button btn19 = (Button) findViewById(R.id.btn19);
        Button btn20 = (Button) findViewById(R.id.btn20);
        Button btn21 = (Button) findViewById(R.id.btn21);
        Button btn22 = (Button) findViewById(R.id.btn22);
        Button btn23 = (Button) findViewById(R.id.btn23);
        Button btn24 = (Button) findViewById(R.id.btn24);
        Button btn25 = (Button) findViewById(R.id.btn25);
        Button btn26 = (Button) findViewById(R.id.btn26);
        Button btn27 = (Button) findViewById(R.id.btn27);
        Button btn28 = (Button) findViewById(R.id.btn28);
        Button btn29 = (Button) findViewById(R.id.btn29);
        Button btn30 = (Button) findViewById(R.id.btn30);
        Button btn31 = (Button) findViewById(R.id.btn31);
        Button btn32 = (Button) findViewById(R.id.btn32);
        Button btn33 = (Button) findViewById(R.id.btn33);
        Button btn34 = (Button) findViewById(R.id.btn34);
        Button btn35 = (Button) findViewById(R.id.btn35);
        Button btn36 = (Button) findViewById(R.id.btn36);
        Button btn37 = (Button) findViewById(R.id.btn37);
        Button btn38 = (Button) findViewById(R.id.btn38);
        Button btn39 = (Button) findViewById(R.id.btn39);
        Button btn40 = (Button) findViewById(R.id.btn40);
        Button btn41 = (Button) findViewById(R.id.btn41);
        Button btn42 = (Button) findViewById(R.id.btn42);
        Button btn43 = (Button) findViewById(R.id.btn43);
        Button btn44 = (Button) findViewById(R.id.btn44);
        Button btn45 = (Button) findViewById(R.id.btn45);
        Button btn46 = (Button) findViewById(R.id.btn46);
        Button btn47 = (Button) findViewById(R.id.btn47);
        Button btn48 = (Button) findViewById(R.id.btn48);
        Button btn49 = (Button) findViewById(R.id.btn49);
        Button btn50 = (Button) findViewById(R.id.btn50);
        Button btn51 = (Button) findViewById(R.id.btn51);
        Button btn52 = (Button) findViewById(R.id.btn52);

        /**
        ListView listView = (ListView) findViewById(R.id.com_ListView);

        final ListViewAdapter listViewAdapter = new ListViewAdapter(this, CerDateList);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "선택 " + CerDateList.get(i).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Fragment1Activity.this, Fragment2Activity.class);
                intent.putExtra("event", CerDateList.get(i).getEvent());
                intent.putExtra("name", CerDateList.get(i).getName());
                intent.putExtra("part", CerDateList.get(i).getPart());
                intent.putExtra("agency", CerDateList.get(i).getAgency());
                intent.putExtra("write_fees", CerDateList.get(i).getWrite_price());
                intent.putExtra("practical_fees", CerDateList.get(i).getPractical_price());
                startActivity(intent);
            }
        });
         **/
    }

}
