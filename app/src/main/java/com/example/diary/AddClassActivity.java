package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Arrays;

public class AddClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_class);

        EditText className = (EditText) findViewById(R.id.className);
        RadioGroup classTeacher = (RadioGroup) findViewById(R.id.classTeacher);
        RadioButton teachers[] = new RadioButton[School.getListTeachers().length];
        for (int i = 0; i < School.getListTeachers().length; i++) {
            teachers[i] = new RadioButton(this);
            teachers[i].setText(School.getListTeachers()[i].getFullName());
            classTeacher.addView(teachers[i]);
        }

        LinearLayout classLearners = (LinearLayout) findViewById(R.id.classLearners);
        CheckBox learners[] = new CheckBox[School.getListLearners().length];
        for (int i = 0; i < School.getListLearners().length; i++) {
            learners[i] = new CheckBox(this);
            learners[i].setText(School.getListLearners()[i].getFullName());
            classLearners.addView(learners[i]);
        }

        Button addClass = (Button) findViewById(R.id.addClass);
        addClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Teacher teacherToAdd = new Teacher("1", 1, 1, "1", "1");
                for (int i = 0; i < School.getListTeachers().length; i++) {
                    if (teachers[i].isChecked()) {
                        teacherToAdd = School.getListTeachers()[i];
                        break;
                    }
                }

                Learner learnersToAdd[] = new Learner[0];
                for (int i = 0; i < School.getListLearners().length; i++) {
                    if (learners[i].isChecked()) {
                        learnersToAdd = Arrays.copyOf(learnersToAdd, learnersToAdd.length + 1);
                        learnersToAdd[learnersToAdd.length-1] = School.getListLearners()[i];
                    }
                }

                School.addClass(className.getText().toString(), teacherToAdd, learnersToAdd);

                Intent intent = new Intent(AddClassActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}