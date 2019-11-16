package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);
    }

    public void eBook(View view) {
        Intent Engineering = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EREEHN0wiVNPvAxxQFEkRGQBHQFz2iqP-NkkXhVh9L06ww?e=TPOtFL"));
        startActivity(Engineering);
    }

    public void Additional(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.guru99.com/software-engineering-tutorial.html"));
        startActivity(C);
    }

    public void Video(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=O753uuutqH8"));
        startActivity(C);

    }

    public void Tutorial(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/software_engineering/index.htm"));
        startActivity(C);
    }
}
