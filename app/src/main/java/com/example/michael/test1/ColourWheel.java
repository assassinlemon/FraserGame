package com.example.michael.test1;
import android.graphics.Color;

import java.util.Random;

public class ColourWheel {
    public String[] mColours = {
      "#FFF3B2", "#61E4FC", "#C9F2CF", "#FF7578", "#CCCCCB"
    };

    public int getColour() {
        String colour = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColours.length);

        colour = mColours[randomNumber];
        int colourAsInt = Color.parseColor(colour);
        return  colourAsInt;

    }



}
