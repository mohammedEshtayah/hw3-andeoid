package com.example.hw3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mail extends AppCompatActivity {
private EditText text ,SUBJECT,BCC,CC,emails;
private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        text=(EditText)findViewById(R.id.text);
        BCC=(EditText)findViewById(R.id.bcc);
        CC=(EditText)findViewById(R.id.cc);
        SUBJECT=(EditText)findViewById(R.id.subject);
        emails=(EditText)findViewById(R.id.emails);
        send=(Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] bcc = BCC.getText().toString().split(",");
                String[] cc = CC.getText().toString().split(",");

                Intent h=new Intent ( Intent.ACTION_SENDTO , Uri.parse ( "mailto:"+emails.getText().toString() ) );
                h.putExtra ( Intent.EXTRA_CC,cc );
                h.putExtra ( Intent.EXTRA_BCC,bcc );
                h.putExtra ( Intent.EXTRA_SUBJECT,SUBJECT.getText().toString());
                h.putExtra ( Intent.EXTRA_TEXT,text.getText().toString() );
                startActivity ( h );

            }
        });




    }
}
