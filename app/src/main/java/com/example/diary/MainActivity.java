package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddLearner = (Button) findViewById(R.id.btnAddLearner);
        Button btnAddTeacher = (Button) findViewById(R.id.btnAddTeacher);
        Button btnAddEmployee = (Button) findViewById(R.id.btnAddEmployee);
        Button btnAddClass = (Button) findViewById(R.id.btnAddClass);
        Button btnAddElective = (Button) findViewById(R.id.btnAddElective);
        Button btnAddSection = (Button) findViewById(R.id.btnAddSection);
        Button btnShowTeachers = (Button) findViewById(R.id.btnShowTeachers);
        Button btnShowLearners = (Button) findViewById(R.id.btnShowLearners);
        Button btnShowParticipants = (Button) findViewById(R.id.btnShowParticipants);
        Button btnShowClassWithParents = (Button) findViewById(R.id.btnShowClassWithParents);
        Button btnShowJournal = (Button) findViewById(R.id.btnShowJournal);

        btnAddLearner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddLearnerActivity.class);
                startActivity(intent);
            }
        });

        btnShowLearners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowLearnersActivity.class);
                startActivity(intent);
            }
        });

        btnAddTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddTeacherActivity.class);
                startActivity(intent);
            }
        });

        btnShowTeachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowTeachersActivity.class);
                startActivity(intent);
            }
        });

        btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddEmployeeActivity.class);
                startActivity(intent);
            }
        });

        btnShowParticipants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowParticipantsActivity.class);
                startActivity(intent);
            }
        });
    }
}