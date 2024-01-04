package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private EditText check;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Random myRandom = new Random();

        Button buttonGenerate = (Button)findViewById(R.id.radio_button_1);
        final TextView operators = (TextView) findViewById(R.id.text_view_5);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.text_view_4);
        final TextView textGenerateNumber2 = (TextView)findViewById(R.id.text_view_6);

        Button buttonGenerate2 = (Button)findViewById(R.id.radio_button_2);
        final TextView operators2 = (TextView) findViewById(R.id.text_view_5);
        final TextView textGenerateNumber3 = (TextView)findViewById(R.id.text_view_4);
        final TextView textGenerateNumber4 = (TextView)findViewById(R.id.text_view_6);

        Button buttonGenerate3 = (Button)findViewById(R.id.radio_button_3);
        final TextView operators3 = (TextView) findViewById(R.id.text_view_5);
        final TextView textGenerateNumber5 = (TextView)findViewById(R.id.text_view_4);
        final TextView textGenerateNumber6 = (TextView)findViewById(R.id.text_view_6);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonSubmit = (Button)findViewById(R.id.check_answer);

        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operators.setText("+");
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(9)));
                textGenerateNumber2.setText(String.valueOf(myRandom.nextInt(9)));
            }
        });

        buttonGenerate2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operators2.setText("/");
                textGenerateNumber3.setText(String.valueOf(myRandom.nextInt(99)));
                textGenerateNumber4.setText(String.valueOf(myRandom.nextInt(99)));
            }
        });

        buttonGenerate3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                operators3.setText("*");
                textGenerateNumber5.setText(String.valueOf(myRandom.nextInt(999)));
                textGenerateNumber6.setText(String.valueOf(myRandom.nextInt(999)));
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub




            }
        });

        }

}
