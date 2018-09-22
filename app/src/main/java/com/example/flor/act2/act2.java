package com.example.flor.act2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        Button click = (Button) findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView list1 = (TextView) findViewById(R.id.list1);
                for (int number=1; number<=20; number++){
                    if (number % 2 == 0) {
                        list1.append(number + "\n");
                    }
                }
            };});}}

