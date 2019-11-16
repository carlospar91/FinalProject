package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;


import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.source.AssetSource;

import java.net.URI;

public class Activity5 extends AppCompatActivity {
    //public Button Button51;


    //public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }


    public void eBook(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EZ9890vc1ZJNuFHdRdL0fcwB6euMd24nK_14Xjxd3A7S4A?e=cS0jgh"));
        startActivity(C);

    }

    public void Additional(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.microsoft.com/express/product/"));
        startActivity(C);
    }

    public void Video(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vLnPwxZdW4Y"));
        startActivity(C);

    }

    public void Tutorial(View view) {
        Intent C = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/cplusplus/index.htm"));
        startActivity(C);

    }
}

        //Button51 = (Button) findViewById(R.id.Button51);
        //Button51.setVisibility(View.VISIBLE);
        //Button51.setOnClickListener(new View.OnClickListener() {

            //@Override
            //public void onClick(View v) {
                //pdfView = findViewById(R.id.pdfView5);
                //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();
                //Button51.setVisibility(View.GONE);
                //Button51.setVisibility(View.VISIBLE);
                //openActivity51();
                //Intent intent = new Intent(getApplicationContext(), Activity51.class);
                //startActivity(intent);

            //}

        //});
    //}
//}

    //public void openActivity51() {


        //Intent intent = new Intent(this, Activity51.class);
        //Intent intent = new Intent(getApplicationContext(), Activity51.class);
        //startActivity(intent);
    //}
//}



        //pdfView = findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();
        //startActivity(intent);
        //pdfView = findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();



            //@Override
            //public void onClick(View v) {
                //openActivity51();
            //}
        //});






        //PDFView pdfView = (PDFView) findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();

//}
    //public void openActivity51() {
        //Intent intent = new Intent(this, Activity5.class);
        //startActivity(intent);
        //PDFView pdfView = (PDFView) findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();
    //}
//}
