package com.lovesapplabs.fitorflab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String WEIGHT_LIFTING = "Weight Lifting";
    public static final String YOGA = "Yoga";
    public static final String CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.RL_Main);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.RL_Main2);
        RelativeLayout heartBtn = (RelativeLayout) findViewById(R.id.RL_Main1);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadDetailsActivity(MainActivity.WEIGHT_LIFTING);

            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailsActivity(MainActivity.YOGA);
            }
        });

        heartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailsActivity(MainActivity.CARDIO);
            }
        });



}

    private void loadDetailsActivity(String exerciseTitle)
    {
        Intent intent = new Intent(this, DetailsActivity.class);
        //intent.
        startActivity(intent);
    }

    }

