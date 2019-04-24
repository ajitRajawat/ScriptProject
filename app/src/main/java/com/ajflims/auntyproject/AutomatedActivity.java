package com.ajflims.auntyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AutomatedActivity extends AppCompatActivity {

    Button mDns,mApache,mMaria,mYum,mSamba,mNfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automated);

        mDns = findViewById(R.id.dns_btn);
        mApache = findViewById(R.id.apache_btn);
        mMaria = findViewById(R.id.maria_btn);
        mYum = findViewById(R.id.yum_btn);
        mSamba = findViewById(R.id.samba_btn);
        mNfs = findViewById(R.id.nfs_btn);

        mDns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","DNS");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);

            }
        });

        mApache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","APACHE");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);
            }
        });

        mMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","MARIA DB");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);
            }
        });

        mYum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","YUM");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);
            }
        });

        mSamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","SAMBA");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);
            }
        });

        mNfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                intent.putExtra("title","NFS");
                intent.putExtra("script","systemctl start dns.service");
                startActivity(intent);
            }
        });

    }
}
