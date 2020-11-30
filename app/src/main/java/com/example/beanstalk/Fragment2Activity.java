package com.example.beanstalk;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Fragment2Activity extends AppCompatActivity {
    ArrayList<CertificateData> CerDateList;

    // 컴퓨터 자격증 정보
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2);

        // 검색창 제외 메뉴바 (모든 FragmentActivity 상단에 복붙하세요.

        Button btn_1 = (Button) findViewById(R.id.btn_menu1);
        Button btn_2 = (Button) findViewById(R.id.btn_menu2);
        Button btn_3 = (Button) findViewById(R.id.btn_menu3);
        Button btn_4 = (Button) findViewById(R.id.btn_menu4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment1Activity.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment2Activity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment3Activity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment2Activity.this, Fragment4Activity.class);
                startActivity(intent);
            }
        });
        MyDBHelper myDBHelper = new MyDBHelper(this);
        SQLiteDatabase DB = myDBHelper.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from com_certificate", null);

        while (cursor.moveToNext()){
            CerDateList.add(new CertificateData(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(4), cursor.getInt(5)));
        }

        cursor.close();
        DB.close();

        ListView listView = (ListView) findViewById(R.id.ListView);

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, CerDateList);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "선택 " + CerDateList.get(i).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Fragment2Activity.this, Fragment2Activity.class);
                intent.putExtra("event", CerDateList.get(i).getEvent());
                intent.putExtra("name", CerDateList.get(i).getName());
                intent.putExtra("part", CerDateList.get(i).getPart());
                intent.putExtra("agency", CerDateList.get(i).getAgency());
                intent.putExtra("write_fees", CerDateList.get(i).getWrite_price());
                intent.putExtra("practical_fees", CerDateList.get(i).getPractical_price());
                startActivity(intent);
            }
        });
    }

}
