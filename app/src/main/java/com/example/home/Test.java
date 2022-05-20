package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Test extends AppCompatActivity {

    ImageView im;
    Button op1,op2,op3,op4;
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
        String ran = String.valueOf(randChar);
        im=findViewById(R.id.img);
        im.setImageResource(getResources().getIdentifier(ran,"drawable",getPackageName()));
        op1 = findViewById(R.id.op1);
        op1.setText(ran);
        op2 = findViewById(R.id.op2);
        op2.setText(getRandomChar());
        op3 = findViewById(R.id.op3);
        op3.setText(getRandomChar());
        op4 = findViewById(R.id.op4);
        op4.setText(getRandomChar());
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test.this,Result.this);
                intent.putExtra("option","Correct");
                startActivity(intent);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test.this,Result.this);
                intent.putExtra("option","Wrong");
                startActivity(intent);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test.this,Result.this);
                intent.putExtra("option","Wrong");
                startActivity(intent);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test.this,Result.this);
                intent.putExtra("option","Wrong");
                startActivity(intent);
            }
        });


    }
    public String getRandomChar()
    {
        Random random = new Random();
        char randChar = (char) (random.nextInt(26) + 'a');
        String ran = String.valueOf(randChar);
        return ran;
    }

}