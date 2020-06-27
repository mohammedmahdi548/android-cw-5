package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a2 = findViewById(R.id.Activity2);
        Button a3 = findViewById(R.id.Activity3);

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent x = new Intent(MainActivity.this.MainActivity2.class);

                intent x = new intent(MainActivity.this.MainActivity2.class);
                startActivity(x);

            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                intent x = new Intent(MainActivity.this.MainActivity2.class);

                intent y = new intent(MainActivity.this.MainActivity2.class);
                startActivity(y);
    }

}