package com.demo.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class identifier_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifier_page);

        TextView selection_txt = (TextView) findViewById(R.id.selection_txt);

        Button sel_teacher = (Button) findViewById(R.id.btn_teacher);
        Button sel_student = (Button) findViewById(R.id.btn_student);
    }
}