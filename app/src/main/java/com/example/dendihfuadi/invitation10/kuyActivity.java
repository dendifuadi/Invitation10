package com.example.dendihfuadi.invitation10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuy);

        Button btnback1 = (Button) findViewById(R.id.backbutton1);
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(kuyActivity.this,Main2Activity.class);
                startActivity(kembali);
            }
        });
    }
}
