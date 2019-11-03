package com.example.project_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.project_checker.module.MemoListCollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AddNewList extends AppCompatActivity implements View.OnClickListener {

    private MemoListCollection memoListCollection;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_list);

        findViewById(R.id.writeBtn).setOnClickListener(this);
        findViewById(R.id.readBtn).setOnClickListener(this);
//        findViewById(R.id.saveBtn).setOnClickListener(this);

        context = getApplicationContext();

        memoListCollection = new MemoListCollection();
        MemoListCollection.setPath(context.getFilesDir());
    }

    @Override
    public void onClick(View view) {
        finish();
//        if (view.getId() == R.id.writeBtn) {
//            memoListCollection.writeList(context.getFilesDir());
//        }
//        else if (view.getId() == R.id.readBtn) {
//            memoListCollection.readList(context.getFilesDir());
//
//            String s = memoListCollection.getContent(0);
//            ((TextView)findViewById(R.id.output)).setText(s);
//        }
    }
}
