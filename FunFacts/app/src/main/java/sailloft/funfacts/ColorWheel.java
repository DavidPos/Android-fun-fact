package sailloft.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by David's Laptop on 10/5/2014.
 */
public class ColorWheel {
    //Member variable
    public String[] mColor ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor() {


        String color = "";
        //Randomly select a
        Random randomGenerator = new Random(); //Construct new random number
        int randomNumber = randomGenerator.nextInt(mColor.length);
        //Convert randomNumber to color
        color = mColor[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
