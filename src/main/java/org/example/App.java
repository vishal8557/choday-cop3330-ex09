package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*Exercise 9 - Paint Calculator
        Sometimes you have to round up to the next number rather than follow standard rounding rules.

        Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

        Example Output
        You will need to purchase 2 gallons of paint to cover 360 square feet.
        Remember, you can’t buy a partial gallon of paint. You must
        round up to the next whole gallon.

        Constraints
        Use a constant to hold the conversion rate.

      Ensure that you round up to the next whole number.
 */
import java.util.Scanner;

public class App {


    Scanner in = new Scanner(System.in);

    public static  int conveting = 350;

    public static void main(String[] args)

    {
        App myApp = new App();
        int lengthofit;

        int width;
        lengthofit = myApp.readInput("How much feet is the length of this room? ");

        width = myApp.readInput("How much feet is the width of this room? ");

        int ourarea;

        int Number_OF_Gallons;

        ourarea = width * lengthofit;

        Number_OF_Gallons = ourarea / conveting;

        if (ourarea % conveting != 0)
        {
            ++Number_OF_Gallons;
        }

        System.out.println ("You will need to purchase " + Number_OF_Gallons +
                " gallons of paint to cover " + ourarea + " square feet.");

    }
    public int readInput(String input)
    {
        System.out.print(input);
        String num = in.next();

        int the_numberr_conversions;
        the_numberr_conversions = Integer.parseInt(num);

        return the_numberr_conversions;
    }
}
