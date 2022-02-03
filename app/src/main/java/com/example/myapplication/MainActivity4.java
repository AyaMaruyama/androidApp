package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{

    Button btnPage3;
    Button btnPage5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnPage3 =  (Button) findViewById(R.id.btnPrevPage3);
        btnPage3.setOnClickListener(this);
        btnPage5 =  (Button) findViewById(R.id.btnNextPage5);
        btnPage5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPrevPage3:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.btnNextPage5:
                Intent intent2 = new Intent(this, MainActivity5.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}