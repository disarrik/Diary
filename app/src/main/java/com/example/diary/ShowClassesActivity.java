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

public class ShowClassesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_classes);

        TextView allClasses = (TextView) findViewById(R.id.allClasses);
        for (int i = 0; i < School.getClasses().length; i++) {
            allClasses.setText(allClasses.getText().toString() + "\n" + School.getClasses()[i].getNumber());
            allClasses.setText(allClasses.getText().toString() + "\n" + School.getClasses()[i].getClassTeacher().getFullName());
            allClasses.setText(allClasses.getText().toString() + "\n" +School.getClasses()[i].getListParentsString());
        }
    }
}