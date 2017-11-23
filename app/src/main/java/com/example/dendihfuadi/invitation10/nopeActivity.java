package com.example.dendihfuadi.invitation10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nopeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nope);

        Button btnback2 = (Button) findViewById(R.id.backcutton2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali2 = new Intent(nopeActivity.this,Main2Activity.class);
                startActivity(kembali2);
            }
        });
    }
}
