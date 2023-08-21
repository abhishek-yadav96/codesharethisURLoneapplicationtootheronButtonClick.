package com.my.mynewapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sharebutton=findViewById(R.id.sharebutton);

        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareURL();
            }
        });

    }

    private void shareURL() {
        String url="http://pandora.yilstaging.com/writable/uploads/20210127/1611811599_2ac19cd41e8387119d7e.mp3";

        Intent shareIntent=new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT,url);

        startActivity(Intent.createChooser(shareIntent,"Share URL using"));
    }
}