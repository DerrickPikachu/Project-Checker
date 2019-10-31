package com.example.project_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AddNewList extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_list);

        findViewById(R.id.saveBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
