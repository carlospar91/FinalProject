package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);
    }

    public void eBook(View view) {
        Intent Seminar = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EVSBkpjuTyhNoTkWii6U2VwBuTqc-6_na0PEB49xxaZy9w?e=7y1B5R"));
        startActivity(Seminar);
    }

    public void review(View view) {
        Intent Seminar1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EWNffVfv51hDv3tO7tfrGfgBwr9gATMHakpUckHJU4qmBg?e=XTr5zo"));
        startActivity(Seminar1);
    }
}