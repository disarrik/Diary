package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        EditText fullName = (EditText) findViewById(R.id.fullNameEmployee);
        EditText phone = (EditText) findViewById(R.id.phoneEmployee);
        EditText cardID = (EditText) findViewById(R.id.cardIDEmployee);
        EditText position = (EditText) findViewById(R.id.positionEmplyee);

        Button btnAddLEarner = (Button) findViewById(R.id.btnAddEmployee);
        btnAddLEarner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                School.addEmployee(fullName.getText().toString(), Integer.parseInt(phone.getText().toString()), Integer.parseInt(cardID.getText().toString()), position.getText().toString());
                Intent intent = new Intent(AddEmployeeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}