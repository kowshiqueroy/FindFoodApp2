package com.example.findfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.annotation.Target;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClickFindFood(View view) {

        TextView result = (TextView) findViewById(R.id.t);

        Spinner time = (Spinner) findViewById(R.id.s);

        String foodType = String.valueOf(time.getSelectedItem());



        List<String> foods = options.getFoods(foodType);
        StringBuilder foodsFormatted = new StringBuilder();
        for (String food : foods) {
            foodsFormatted.append(food).append('\n');
        }




        result.setText(foodsFormatted);



        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("message", foodsFormatted.toString());


        startActivity(intent);


    }
}