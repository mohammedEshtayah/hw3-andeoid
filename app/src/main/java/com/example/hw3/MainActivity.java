package com.example.hw3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private CircleImageView viewcircles;
    private Uri pahtImage;
    private FloatingActionButton selectImage;
    private  static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView nav=(NavigationView)findViewById(R.id.nav) ;
         nav.setNavigationItemSelectedListener(this);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav);

        View view = navigationView.inflateHeaderView(R.layout.navigation);
        selectImage = (FloatingActionButton) view.findViewById(R.id.selectimage);
        viewcircles=(CircleImageView)view.findViewById(R.id.viewcircles) ;
         selectImage.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
           Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);


    }
});
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

switch (menuItem.getItemId()){
        case R.id.sms :
            startActivity ( new Intent ( this,sms.class));

           break;
        case  R.id.email:
            startActivity (new Intent ( this, mail.class ));
            break;
        case  R.id.Locate:
             startActivity ( new Intent ( this,location.class));

            break;





}


        return false;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            viewcircles.setImageBitmap(imageBitmap);
        }
    }
}
