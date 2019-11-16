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

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;



    PDFView pdfView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // ATTENTION: This was auto-generated to handle app links.
            button5 = (Button) findViewById(R.id.button5);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity5();

                }

            });

            button6 = (Button) findViewById(R.id.button6);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity6();
                }
            });

            button7 = (Button) findViewById(R.id.button7);
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity7();

                }
            });
            button8 = (Button) findViewById(R.id.button8);
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity8();
                }
            });
            button9 = (Button) findViewById(R.id.button9);
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity9();
                }
            });
            button10 = (Button) findViewById(R.id.button10);
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity10();
                }
            });
            button11 = (Button) findViewById(R.id.button11);
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity11();
                }
            });
            button13 = (Button) findViewById(R.id.button13);
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity13();
                }
            });
            button14 = (Button) findViewById(R.id.button14);
            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity14();
                }
            });
            button15 = (Button) findViewById(R.id.button15);
            button15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity15();
                }
            });
            button16 = (Button) findViewById(R.id.button16);
            button16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity16();
                }
            });
            button17 = (Button) findViewById(R.id.button17);
            button17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity17();
                }
            });
            button18 = (Button) findViewById(R.id.button18);
            button18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity18();
                }
            });
            button19 = (Button) findViewById(R.id.button19);
            button19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity19();
                }
            });
            button20 = (Button) findViewById(R.id.button20);
            button20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity20();
                }
            });


    }



    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);


    }
    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);

        startActivity(intent);

    }
    public void openActivity7() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);

    }
    public void openActivity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }
    public void openActivity9() {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }
    public void openActivity10() {
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
    }
    public void openActivity11() {
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);

    }public void openActivity13() {
        Intent intent = new Intent(this, Activity13.class);
        startActivity(intent);
    }public void openActivity14() {
        Intent intent = new Intent(this, Activity14.class);
        startActivity(intent);
    }public void openActivity15() {
        Intent intent = new Intent(this, Activity15.class);
        startActivity(intent);
    }public void openActivity16() {
        Intent intent = new Intent(this, Activity16.class);
        startActivity(intent);
    }public void openActivity17() {
        Intent intent = new Intent(this, Activity17.class);
        startActivity(intent);
    }
    public void openActivity18() {
        Intent intent = new Intent(this, Activity18.class);
        startActivity(intent);
    }
    public void openActivity19() {
        Intent intent = new Intent(this, Activity19.class);
        startActivity(intent);
    }
    public void openActivity20() {
        Intent intent = new Intent(this, Activity20.class);
        startActivity(intent);
    }
    //public void openActivity51() {

        //Intent intent = new Intent(this, Activity51.class);
        //startActivity(intent);
        //pdfView = findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();
        //pdfView = findViewById(R.id.pdfView5);
        //pdfView.fromAsset("Programming Languages Principles and Practice 3rd Edition.pdf").load();
    //}
    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uhd.edu/myuhd/Pages/Student-Login.aspx"));
        startActivity(browserIntent);
    }

        public void feedback(View view){
                Intent Open6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uhdowntown-my.sharepoint.com/:b:/g/personal/patinoc6_gator_uhd_edu/EREEHN0wiVNPvAxxQFEkRGQBHQFz2iqP-NkkXhVh9L06ww?e=TPOtFL"));
                startActivity(Open6Intent);

    }

    public void home(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uhd.edu"));
        startActivity(browserIntent);

    }


}