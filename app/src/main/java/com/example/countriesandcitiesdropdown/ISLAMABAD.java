package com.example.countriesandcitiesdropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ISLAMABAD extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamabad);

        back = findViewById(R.id.btnBackIsl);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ISLAMABAD.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}