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

public class ShowParticipantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_participants);

        TextView allParticipants = (TextView) findViewById(R.id.allParticipants);
        for (int i = 0; i < School.getParticipant().length; i++) {
            allParticipants.setText(allParticipants.getText().toString() + "\n" + School.getParticipant()[i].getFullName() + "  " + School.getParticipant()[i].getPhone());
        }
    }
}