package com.startup.testgitonandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button goToAnotherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToAnotherActivity = (Button)findViewById(R.id.go_to_another_act_btn);

        goToAnotherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent checkActivityIntent = new Intent(MainActivity.this,CheckActivity.class);
        startActivity(checkActivityIntent);
        Toast.makeText(this,"Start " +CheckActivity.class.getSimpleName(),Toast.LENGTH_SHORT).show();
    }
}
