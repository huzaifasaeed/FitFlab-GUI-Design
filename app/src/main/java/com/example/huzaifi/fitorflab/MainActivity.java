package com.example.huzaifi.fitorflab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public  static final String ITEM_TITLE="Item.Title";
    public  static final String Excercise_Weight="Weight Lifting";
    public  static final String Excercise_Yoga="Yoga";
    public  static final String Excercise_Cardio="Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn=(RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn=(RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn=(RelativeLayout)findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.Excercise_Weight);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.Excercise_Yoga);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(MainActivity.Excercise_Cardio);
            }
        });
    }

    private void loadDetailActivity(String excercise)
    {
        Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra(MainActivity.ITEM_TITLE,excercise);
        startActivity(intent);
    }
}
