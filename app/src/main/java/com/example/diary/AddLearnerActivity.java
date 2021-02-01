package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddLearnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_learner);

        EditText fullName = (EditText) findViewById(R.id.fullNameLearner);
        EditText phone = (EditText) findViewById(R.id.phoneLearner);
        EditText cardID = (EditText) findViewById(R.id.cardIDLearner);
        EditText parentFullName1 = (EditText) findViewById(R.id.parentFullName1);
        EditText parentPhone1 = (EditText) findViewById(R.id.parentPhone1);
        EditText parentFullName2 = (EditText) findViewById(R.id.parentFullName2);
        EditText parentPhone2 = (EditText) findViewById(R.id.parentPhone2);

        Button addLearner = (Button) findViewById(R.id.addLearner);
        addLearner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parent parents[] = new Parent[2];
                parents[0] = new Parent(parentFullName1.getText().toString(), Integer.parseInt(parentPhone1.getText().toString()));
                parents[1] = new Parent(parentFullName2.getText().toString(), Integer.parseInt(parentPhone2.getText().toString()));
                School.addLearner(fullName.getText().toString(), Integer.parseInt(phone.getText().toString()), Integer.parseInt(cardID.getText().toString()), parents);

                Intent intent = new Intent(AddLearnerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}