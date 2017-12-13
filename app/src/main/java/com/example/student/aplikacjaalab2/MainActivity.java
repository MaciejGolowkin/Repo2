package com.example.student.aplikacjaalab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Miejsce= findViewById(R.id.plain_text_input);
        TextView Miejsce2= findViewById(R.id.textView3);
        
    }


}
