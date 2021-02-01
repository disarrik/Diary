package com.example.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddTeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_teacher);

        EditText fullName = (EditText) findViewById(R.id.fullNameTeacher);
        EditText phone = (EditText) findViewById(R.id.phoneTeacher);
        EditText cardID = (EditText) findViewById(R.id.cardIDTeacher);
        EditText position = (EditText) findViewById(R.id.positionTeacher);
        EditText qualification = (EditText) findViewById(R.id.qualificationTeacher);


        Button addTeacher = (Button) findViewById(R.id.addTeacher);
        addTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                School.addTeacher(fullName.getText().toString(), Integer.parseInt(phone.getText().toString()), Integer.parseInt(cardID.getText().toString()), position.getText().toString(), qualification.getText().toString());

                Intent intent = new Intent(AddTeacherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
