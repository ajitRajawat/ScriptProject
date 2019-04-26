package com.ajflims.auntyproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AutomatedActivity extends AppCompatActivity {

    Button mDns,mApache,mMaria,mYum,mSamba,mNfs;

    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automated);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDns = findViewById(R.id.dns_btn);
        mApache = findViewById(R.id.apache_btn);
        mMaria = findViewById(R.id.maria_btn);
        mYum = findViewById(R.id.yum_btn);
        mSamba = findViewById(R.id.samba_btn);
        mNfs = findViewById(R.id.nfs_btn);

        mDns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mDatabase.child("Dns").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","DNS");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });

            }
        });

        mApache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Apache").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","Apache");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });
            }
        });

        mMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Maria").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","Maria DB");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });
            }
        });

        mYum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Yum").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","Yum");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });
            }
        });

        mSamba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Samba").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","Samba");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });
            }
        });

        mNfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabase.child("Nfs").child("input").setValue("done").addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(AutomatedActivity.this,AutomatedScriptActivity.class);
                        intent.putExtra("title","Nfs");
                        intent.putExtra("script","systemctl start dns.service");
                        startActivity(intent);
                    }
                });
            }
        });

    }
}
