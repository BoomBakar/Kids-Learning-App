package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learn extends AppCompatActivity {
    Button[] buttons;
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);


        Button btnA = findViewById(R.id.btnA);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnA.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnB = findViewById(R.id.btnB);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnB.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnC.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnD = findViewById(R.id.btnD);
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnD.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnE = findViewById(R.id.btnE);
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnE.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnF = findViewById(R.id.btnF);
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnF.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnG = findViewById(R.id.btnG);
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnG.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnH = findViewById(R.id.btnH);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnH.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnI = findViewById(R.id.btnI);
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnI.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnJ = findViewById(R.id.btnJ);
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnJ.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnK = findViewById(R.id.btnK);
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnK.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnL= findViewById(R.id.btnL);
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnL.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnM = findViewById(R.id.btnM);
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnM.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnN = findViewById(R.id.btnN);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnN.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnO = findViewById(R.id.btnO);
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnO.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnP = findViewById(R.id.btnP);
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnP.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnQ = findViewById(R.id.btnQ);
        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnQ.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnR = findViewById(R.id.btnR);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnR.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnS = findViewById(R.id.btnS);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnS.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnT = findViewById(R.id.btnT);
        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnT.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnU = findViewById(R.id.btnU);
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnU.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnV = findViewById(R.id.btnV);
        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnV.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnW = findViewById(R.id.btnW);
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnW.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnX = findViewById(R.id.btnX);
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnX.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnY = findViewById(R.id.btnY);
        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnY.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
        Button btnZ = findViewById(R.id.btnZ);
        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btnZ.getText().toString();
                Intent intent=new Intent(Learn.this,LearningImages.class);
                intent.putExtra("Alphabet",text);
                startActivity(intent);
            }
        });
    }
}