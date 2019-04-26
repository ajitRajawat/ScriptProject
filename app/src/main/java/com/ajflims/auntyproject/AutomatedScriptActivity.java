package com.ajflims.auntyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AutomatedScriptActivity extends AppCompatActivity {

    TextView mTitle,mScript;
    Button mOk;

    String title,script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automated_script);

        mTitle = findViewById(R.id.script_title);
        mScript = findViewById(R.id.script_script_text);
        mOk = findViewById(R.id.script_ok_btn);

        title = getIntent().getStringExtra("title");
        script = getIntent().getStringExtra("script");

        mTitle.setText(title);
        mScript.setText(script);

        mOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
