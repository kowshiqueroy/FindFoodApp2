package com.example.findfoodapp;

import java.util.ArrayList;
import java.util.List;

public class options {


    public static List<String> getFoods(String ft) {
        List<String> foods = new ArrayList<>();
        if (ft.equals("breakfast")) {
            foods.add("Bread");
            foods.add("Butter");
        }

        else if (ft.equals("lunch")) {
            foods.add("Rice");
            foods.add("Fish");
        }
        else if (ft.equals("dinner")) {
            foods.add("Banana");
            foods.add("Sweet");
        } else {
            foods.add("Please select");

        }
        return foods;
    }


}
