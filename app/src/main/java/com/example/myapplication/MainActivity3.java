package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    Button btnPage2;
    Button btnPage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnPage2 =  (Button) findViewById(R.id.btnPage2);
        btnPage2.setOnClickListener(this);
        btnPage4 =  (Button) findViewById(R.id.btnNextPage4);
        btnPage4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNextPage4:
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                break;
            case R.id.btnPage2:
                Intent intent2 = new Intent(this, MainActivity2.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}