package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openMaps(View v){
        Uri gmmIntentUri = Uri.parse("geo:-6.982235278994625, 110.40935100899299(numpang");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void openContact(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:08123456789"));
        startActivity(intent);
    }

    public void openEmail(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mail to:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "lailarahma@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Aplikasi Biodata email");
        startActivity(intent);
    }
}