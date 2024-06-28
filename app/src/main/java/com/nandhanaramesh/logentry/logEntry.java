package com.nandhanaramesh.logentry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class logEntry extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_entry);
    ed1=(EditText)findViewById(R.id.sname);
    ed2=(EditText)findViewById(R.id.admno);
    ed3=(EditText)findViewById(R.id.sysno);
    ed4=(EditText)findViewById(R.id.dep);
    b1=(AppCompatButton) findViewById(R.id.backloginbtn);
    b2=(AppCompatButton) findViewById(R.id.addbtn);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String admNo=ed2.getText().toString();
                String sysNo=ed3.getText().toString();
                String dep=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getName+admNo+sysNo+dep,Toast.LENGTH_LONG).show();
            }
        });

    }
}