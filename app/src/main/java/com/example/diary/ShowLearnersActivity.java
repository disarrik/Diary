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

public class ShowLearnersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_learners);

        TextView allLearners = (TextView) findViewById(R.id.allLearners);
        for (int i = 0; i < School.getListLearners().length; i++) {
            allLearners.setText(allLearners.getText().toString() + "\n" + School.getListLearners()[i].getFullName() + "  " + School.getListLearners()[i].getPhone());
        }
    }
}