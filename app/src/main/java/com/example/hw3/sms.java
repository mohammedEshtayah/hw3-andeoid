package com.example.hw3;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sms extends AppCompatActivity {
    private EditText sms,body;
    private Button go;

    private  static final int REQUEST_CODE_SMS = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        go=(Button)findViewById(R.id.go);
        sms=(EditText)findViewById(R.id.sms);
        body=(EditText)findViewById(R.id.body);

        go.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                String s=sms.getText().toString();
                if(! s.isEmpty()){

                    if (checkSelfPermission ( Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED)
                    {
                        requestPermissions ( new String[]{Manifest.permission.READ_PHONE_STATE,
                                Manifest.permission.SEND_SMS},REQUEST_CODE_SMS );
                    }
                    else {

                        Intent hh = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + s));
                        hh.putExtra("sms_body", body.getText().toString());
                        startActivity(hh);
                    }
                }
            }
        });

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode==REQUEST_CODE_SMS)
        {

                for (int i =0 ; i < grantResults.length; i++)
                    if (grantResults[i]!= PackageManager.PERMISSION_GRANTED)
                        return;


            String s=sms.getText().toString();
            if(! s.isEmpty()){

                if (checkSelfPermission ( Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED)
                {


                    Intent hh = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + s));
                    hh.putExtra("sms_body",  body.getText().toString());
                    startActivity(hh);
                }
            }

        }
        super.onRequestPermissionsResult ( requestCode, permissions, grantResults );
    }

}
