package com.example.beanstalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Certificate46 extends AppCompatActivity {
    ArrayList<CertificateData> CerDateList = new ArrayList<CertificateData>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate46);

        Button btn_1 = (Button) findViewById(R.id.btn_menu1);
        Button btn_2 = (Button) findViewById(R.id.btn_menu2);
        Button btn_3 = (Button) findViewById(R.id.btn_menu3);
        Button btn_4 = (Button) findViewById(R.id.btn_menu4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Certificate46.this, Fragment1Activity.class);
                startActivity(intent);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Certificate46.this, Fragment2Activity.class);
                startActivity(intent);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Certificate46.this, Fragment3Activity.class);
                startActivity(intent);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Certificate46.this, Fragment4Activity.class);
                startActivity(intent);
            }
        });

        //리스트뷰 + SQLite
        MyHelper46 myDBHelper = new MyHelper46(this);
        SQLiteDatabase DB = myDBHelper.getReadableDatabase();
        Cursor cursor = DB.rawQuery("select * from certificate46", null);

        while (cursor.moveToNext()){
            CerDateList.add(new CertificateData(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getInt(4), cursor.getInt(5)));
        }

        ListView listView = (ListView) findViewById(R.id.ListView);

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, CerDateList);
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), CerDateList.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

class MyHelper46 extends SQLiteOpenHelper {
    public MyHelper46(Context context){
        super(context, "certificate46", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table = "create table certificate46 ( event varchar(20), name varchar(30) primary key, part varchar(30), agency varchar(30), written_fees integer, practical_fees integer );";
        sqLiteDatabase.execSQL(table);
        sqLiteDatabase.execSQL("INSERT INTO certificate46 VALUES ('축산', '축산기능사', '농림축산식품부', '한국산업인력공단', 14500, 40700)");
        sqLiteDatabase.execSQL("INSERT INTO certificate46 VALUES ('축산', '축산기사', '농림축산식품부', '한국산업인력공단', 19400, 22600)");
        sqLiteDatabase.execSQL("INSERT INTO certificate46 VALUES ('축산', '축산기술사', '농림축산식품부', '한국산업인력공단', 67800, 87100)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists certificate46");
        onCreate(sqLiteDatabase);
    }
}