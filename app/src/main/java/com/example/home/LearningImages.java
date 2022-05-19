package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LearningImages extends AppCompatActivity {
    ImageView img;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_images);
        img = findViewById(R.id.imageView2);
        Intent intent = getIntent();
        tx = findViewById(R.id.textView);
        String alphabet=intent.getStringExtra("Alphabet");

        switch(alphabet){
            case "A":
                img.setImageResource(R.drawable.a);
                tx.setText("A is for Apple");
                break;
            case "B":
                img.setImageResource(R.drawable.b);
                tx.setText("B is for Ball");
                break;
            case "C":
                img.setImageResource(R.drawable.c);
                tx.setText("C is for Cat");
                break;
            case "D":
                img.setImageResource(R.drawable.d);
                tx.setText("D is for Dog");
                break;
            case "E":
                img.setImageResource(R.drawable.e);
                tx.setText("E is for Egg");
                break;
            case "F":
                img.setImageResource(R.drawable.f);
                tx.setText("F is for Frog");
                break;
            case "G":
                img.setImageResource(R.drawable.g);
                tx.setText("G is for Giraffe");
                break;
            case "H":
                img.setImageResource(R.drawable.h);
                tx.setText("H is for Horse");
                break;
            case "I":
                img.setImageResource(R.drawable.i);
                tx.setText("I is for Ice Cream");
                break;
            case "J":
                img.setImageResource(R.drawable.j);
                tx.setText("J is for Juice");
                break;
            case "K":
                img.setImageResource(R.drawable.k);
                tx.setText("K is for Kite");
                break;
            case "L":
                img.setImageResource(R.drawable.l);
                tx.setText("L is for Lion");
                break;
            case "M":
                img.setImageResource(R.drawable.m);
                tx.setText("M is for Mouse");
                break;
            case "N":
                img.setImageResource(R.drawable.n);
                tx.setText("N is for Nest");
                break;
            case "O":
                img.setImageResource(R.drawable.o);
                tx.setText("O is for Owl");
                break;
            case "P":
                img.setImageResource(R.drawable.p);
                tx.setText("P is for Pineapple");
                break;
            case "Q":
                img.setImageResource(R.drawable.q);
                tx.setText("Q is for Queen");
                break;
            case "R":
                img.setImageResource(R.drawable.r);
                tx.setText("R is for Rat");
                break;
            case "S":
                img.setImageResource(R.drawable.s);
                tx.setText("S is for Sun");
                break;
            case "T":
                img.setImageResource(R.drawable.t);
                tx.setText("T is for Tree");
                break;
            case "U":
                img.setImageResource(R.drawable.u);
                tx.setText("U is for Umbrella");
                break;
            case "V":
                img.setImageResource(R.drawable.v);
                tx.setText("V is for Van");
                break;
            case "W":
                img.setImageResource(R.drawable.w);
                tx.setText("W is for Whale");
                break;
            case "X":
                img.setImageResource(R.drawable.x);
                tx.setText("X is for Xylophone");
                break;
            case "Y":
                img.setImageResource(R.drawable.y);
                tx.setText("Y is for yacht");
                break;
            case "Z":
                img.setImageResource(R.drawable.z);
                tx.setText("Z is for Zebra");
                break;
        }


    }
}