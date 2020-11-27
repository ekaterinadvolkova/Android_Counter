package com.example.a2_2__2_4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private CakeCounter cakeCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*RadioButton dec = (RadioButton)findViewById(R.id.dec);
        View.OnClickListener radioButtonClickListener = null;
        dec.setOnClickListener(radioButtonClickListener);

        RadioButton bin = (RadioButton)findViewById(R.id.bin);
        bin.setOnClickListener(radioButtonClickListener);

        RadioButton hex = (RadioButton)findViewById(R.id.hex);
        bin.setOnClickListener(radioButtonClickListener);*/

        cakeCounter = new CakeCounter();



        Button minus=findViewById(R.id.minus);
        minus.setOnClickListener(v -> {
            Log.i("minus", "reduction");
            cakeCounter.minus();
            updateUI();
        });

        ImageButton reset = findViewById(R.id.reset);
        reset.setOnClickListener(this::onClick);

        Button plus=findViewById(R.id.plus);
        plus.setOnClickListener(v -> {
            Log.i("plus", "addition");
            cakeCounter.plus();
            updateUI();
        });

    }


    public void onClick(View v) {
        Log.i("reset", "reset");
        cakeCounter.reset();
        updateUI();
    }


    public  void updateUI(){
        TextView tv = findViewById(R.id.eatenCakes);
        tv.setText(String.valueOf(cakeCounter.getStarter()));

    }

    /*View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton)v;
            switch (rb.getId()) {
                case R.id.bin: MainActivity.updateUI(String.valueOf());
                    break;
                case R.id.dec: mInfoTextView.setBackgroundColor(Color.parseColor("#0000ff"));
                    break;
                case R.id.hex: mInfoTextView.setBackgroundColor(Color.parseColor("#00ff00"));
                    break;

                default:
                    break;
            }*/


    }

