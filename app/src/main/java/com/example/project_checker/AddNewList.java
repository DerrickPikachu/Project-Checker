package com.example.project_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.project_checker.module.MemoListCollection;

public class AddNewList extends AppCompatActivity implements View.OnClickListener {

    private MemoListCollection memoListCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_list);

        memoListCollection = new MemoListCollection();

        findViewById(R.id.writeBtn).setOnClickListener(this);
        findViewById(R.id.readBtn).setOnClickListener(this);
//        findViewById(R.id.saveBtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        finish();
        if (view.getId() == R.id.writeBtn) {
            memoListCollection.writeList();
        }
        else if (view.getId() == R.id.readBtn) {
            memoListCollection.readList();

            String s = memoListCollection.getContent(0);
            ((TextView)findViewById(R.id.output)).setText(s);
        }
    }
}
