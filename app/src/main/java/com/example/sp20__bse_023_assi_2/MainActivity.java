package com.example.sp20__bse_023_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String code = "1234";
    private TextView txt_code;
    private Button num_1;
    private Button num_2;
    private Button num_3;
    private Button num_4;
    private Button num_5;
    private Button num_6;
    private Button num_7;
    private Button num_8;
    private Button num_9;
    private Button num_0;
    private Button btn_back;
    private Button btn_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        txt_code = findViewById(R.id.txt_code);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        num_3 = findViewById(R.id.num_3);
        num_4 = findViewById(R.id.num_4);
        num_5 = findViewById(R.id.num_5);
        num_6 = findViewById(R.id.num_6);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);
        num_0 = findViewById(R.id.num_0);
        btn_back = findViewById(R.id.btn_back);
        btn_open = findViewById(R.id.btn_open);
    }

    private void setText(int n){
        String oldText = txt_code.getText().toString();
        if(oldText.length() >= 4){
            return;
        }
        txt_code.setText(oldText + n);
    }

    @Override
    protected void onResume() {
        super.onResume();
        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(1);
            }
        });
        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(2);
            }
        });
        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(3);
            }
        });
        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(4);
            }
        });
        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(5);
            }
        });
        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(6);
            }
        });
        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(7);
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(8);
            }
        });
        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(9);
            }
        });
        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText(0);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.length() > 0){
                    txt_code.setText(oldText.substring(0, oldText.length() - 1));
                }
            }
        });
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oldText = txt_code.getText().toString();
                if(oldText.equals(code)){
                    Intent intent = new Intent(getApplicationContext(), ShowMessage.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}