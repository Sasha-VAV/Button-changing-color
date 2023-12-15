package com.example.buttonclick4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        TextView tx = findViewById(R.id.TV);
        A a = new A();

        if (b1.performClick()){
            tx.setText("1");
        }
        if (b2.performClick()){
            tx.setText("2");
        }
    }


    public void set1(View view) {
        if (view.getId()==R.id.b1){
            TextView tx = findViewById(R.id.TV);
            tx.setText("1");
        }
    }
    public void set2(View view) {
        if (view.getId()==R.id.b2){
            TextView tx = findViewById(R.id.TV);
            tx.setText("2");
        }
    }
}