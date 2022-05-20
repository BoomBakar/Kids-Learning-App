package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Test extends AppCompatActivity {

    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getImg();
    }
    public void getImg()
    {

        Random random = new Random();
        char randChar = (char) (random.nextInt(26) + 'a');
        im=findViewById(R.id.img);
        String ran = String.valueOf(randChar);
        im.setImageResource(getResources().getIdentifier(ran,"drawable",getPackageName()));
    }

}