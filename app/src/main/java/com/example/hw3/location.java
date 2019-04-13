package com.example.hw3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class location extends AppCompatActivity {
private EditText location;
private Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        go=(Button)findViewById(R.id.go);
        location=(EditText)findViewById(R.id.location);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=location.getText().toString();
                if(! s.isEmpty()){


                    startActivity ( new Intent( Intent.ACTION_VIEW, Uri.parse ( "geo:0,0?q="+s )));
                }
            }
        });
    }
}
