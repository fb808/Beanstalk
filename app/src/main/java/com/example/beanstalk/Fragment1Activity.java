package com.example.beanstalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Fragment1Activity extends AppCompatActivity {
    //자격증 정보
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1);

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

        //메뉴 버튼
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate1.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate2.class);
                startActivity(intent);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate3.class);
                startActivity(intent);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate4.class);
                startActivity(intent);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate5.class);
                startActivity(intent);
            }
        });

        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate6.class);
                startActivity(intent);
            }
        });

        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate7.class);
                startActivity(intent);
            }
        });

        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate8.class);
                startActivity(intent);
            }
        });

        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate9.class);
                startActivity(intent);
            }
        });

        Button btn10 = (Button) findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate10.class);
                startActivity(intent);
            }
        });

        Button btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate11.class);
                startActivity(intent);
            }
        });

        Button btn12 = (Button) findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate12.class);
                startActivity(intent);
            }
        });

        Button btn13 = (Button) findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate13.class);
                startActivity(intent);
            }
        });

        Button btn14 = (Button) findViewById(R.id.btn14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate14.class);
                startActivity(intent);
            }
        });

        Button btn15 = (Button) findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate15.class);
                startActivity(intent);
            }
        });

        Button btn16 = (Button) findViewById(R.id.btn16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate16.class);
                startActivity(intent);
            }
        });

        Button btn17 = (Button) findViewById(R.id.btn17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate17.class);
                startActivity(intent);
            }
        });

        Button btn18 = (Button) findViewById(R.id.btn18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate18.class);
                startActivity(intent);
            }
        });

        Button btn19 = (Button) findViewById(R.id.btn19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate19.class);
                startActivity(intent);
            }
        });

        Button btn20 = (Button) findViewById(R.id.btn20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate20.class);
                startActivity(intent);
            }
        });

        Button btn21 = (Button) findViewById(R.id.btn21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate21.class);
                startActivity(intent);
            }
        });

        Button btn22 = (Button) findViewById(R.id.btn22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate22.class);
                startActivity(intent);
            }
        });

        Button btn23 = (Button) findViewById(R.id.btn23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate23.class);
                startActivity(intent);
            }
        });

        Button btn24 = (Button) findViewById(R.id.btn24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate24.class);
                startActivity(intent);
            }
        });

        Button btn25 = (Button) findViewById(R.id.btn25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate25.class);
                startActivity(intent);
            }
        });

        Button btn26 = (Button) findViewById(R.id.btn26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate26.class);
                startActivity(intent);
            }
        });

        Button btn27 = (Button) findViewById(R.id.btn27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate27.class);
                startActivity(intent);
            }
        });

        Button btn28 = (Button) findViewById(R.id.btn28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate28.class);
                startActivity(intent);
            }
        });

        Button btn29 = (Button) findViewById(R.id.btn29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate29.class);
                startActivity(intent);
            }
        });

        Button btn30 = (Button) findViewById(R.id.btn30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate30.class);
                startActivity(intent);
            }
        });

        Button btn31 = (Button) findViewById(R.id.btn31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate31.class);
                startActivity(intent);
            }
        });

        Button btn32 = (Button) findViewById(R.id.btn32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate32.class);
                startActivity(intent);
            }
        });

        Button btn33 = (Button) findViewById(R.id.btn33);
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate33.class);
                startActivity(intent);
            }
        });

        Button btn34 = (Button) findViewById(R.id.btn34);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate34.class);
                startActivity(intent);
            }
        });

        Button btn35 = (Button) findViewById(R.id.btn35);
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate35.class);
                startActivity(intent);
            }
        });

        Button btn36 = (Button) findViewById(R.id.btn36);
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate36.class);
                startActivity(intent);
            }
        });

        Button btn37 = (Button) findViewById(R.id.btn37);
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate37.class);
                startActivity(intent);
            }
        });

        Button btn38 = (Button) findViewById(R.id.btn38);
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate38.class);
                startActivity(intent);
            }
        });

        Button btn39 = (Button) findViewById(R.id.btn39);
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate39.class);
                startActivity(intent);
            }
        });

        Button btn40 = (Button) findViewById(R.id.btn40);
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fragment1Activity.this, Certificate40.class);
                startActivity(intent);
            }
        });

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
    }

}
