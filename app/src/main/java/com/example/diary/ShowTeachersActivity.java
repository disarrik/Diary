package com.example.diary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowTeachersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_teachers);

        TextView allTeachers = (TextView) findViewById(R.id.allTeachers);
        for (int i = 0; i < School.getListTeachers().length; i++) {
            allTeachers.setText(allTeachers.getText().toString() + "\n" + School.getListTeachers()[i].getFullName() + "  " + School.getListTeachers()[i].getPhone());
        }
    }
}
