package com.startup.testgitonandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView checkActivityTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        checkActivityTV = (TextView) findViewById(R.id.checkActivityTextView);
        checkActivityTV.setText(R.string.checkActivityTextView);
        checkActivityTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // do nothing
    }
}
