package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }

    public void eBook(View view) {
        Intent Digital = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EREEHN0wiVNPvAxxQFEkRGQBHQFz2iqP-NkkXhVh9L06ww?e=TPOtFL"));
        startActivity(Digital);

    }
    public void Additional(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tutorialspoint.dev/computer-science/digital-electronics-and-logic-design"));
        startActivity(C);
    }

    public void Video(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sPq7JgxL3h0"));
        startActivity(C);

    }

    public void Tutorial(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gradeup.co/computer-science-engineering/digital-logic"));
        startActivity(C);

    }
}
