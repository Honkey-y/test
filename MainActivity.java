package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    Logger logger = Logger.getLogger("MainActivity");//获取日志管理器

    Button btnn;//定义变量
    EditText editText1;
    Button btnl;
    RadioGroup rdg;
    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    Button btnl2;
    Button btnl3;
    Button btnl4;
    Switch sw1;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);
        logger.log(Level.WARNING,"杨....MainActivity ....oncreate");
        btnn = findViewById(R.id.btnn);//找到按钮赋值变量
        btnl = findViewById(R.id.btnl);
        editText1 = findViewById(R.id.edit1);
        rdg = findViewById(R.id.rdg);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        btnl2 = findViewById(R.id.btnl2);
        btnl3 = findViewById(R.id.btnl3);
        btnl4 = findViewById(R.id.btnl4);
        sw1 = findViewById(R.id.sw1);
        sp = findViewById(R.id.sp);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //写响应，当点击按钮的时候，要执行的代码
                //弹出提示 吐司提示
                String e = editText1.getText().toString();
                Toast.makeText(MainActivity.this,e,Toast.LENGTH_LONG).show();
            }
        });
        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rdg.getCheckedRadioButtonId();
                String sex = "";
                if (id == R.id.men){
                    sex = "女";
                }else if(id == R.id.man) {
                    sex = "男";
                }else {
                    sex = "秀吉";
                }
                Toast.makeText(MainActivity.this,id+"",Toast.LENGTH_LONG).show();
            }
        });
        btnl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                boolean k1 = check1.isChecked();
                boolean k2 = check2.isChecked();
                boolean k3 = check3.isChecked();
                if (k1 == true){
                    s += "我会唱";
                }
                if (k2 == true){
                    s += "我会跳";
                }
                if (k3 == true){
                    s += "我会rap";
                }
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }
        });
        btnl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                boolean w = sw1.isChecked();
                if (w == true){
                    s = "已开启";
                }else {
                    s = "已关闭";
                }
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }
        });
        btnl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object s =sp.getSelectedItem();
                Toast.makeText(MainActivity.this,s.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
