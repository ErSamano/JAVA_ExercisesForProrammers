package Exersice9;

/*
    Sometimes you have to round up to the next number rather
    than follow standard rounding rules.
    Calculate gallons of paint needed to paint the ceiling of a
    room.
    Prompt for the length and width, and assume one
    gallon covers 350 square feet.
    Display the number of gallons
    needed to paint the ceiling as a whole number.

    Example Output
    You will need to purchase 2 gallons of
    paint to cover 360 square feet.
    Remember, you can’t buy a partial gallon of paint. You must
    round up to the next whole gallon.

    Constraints
    • Use a constant to hold the conversion rate.
    • Ensure that you round up to the next whole number.
 */


import javax.swing.*;

public class E_PaintCalculator {
    public static void main(String[] a){
        String Slength;
        String Swidth;
        int length;
        int width;
        int area;
        double total;
        //One gallon covers 360 square feet
        int gallon = 350;

        Slength = JOptionPane.showInputDialog("What is the length of the ceiling?");
        length = Integer.parseInt(Slength);
        Swidth  = JOptionPane.showInputDialog("What is the width of the ceiling?");
        width = Integer.parseInt(Swidth);
        area = length * width;

        //Double d2=Double.valueOf(i);

        total = Math.round(area/gallon);
        System.out.println("The area you need to cover is "+area+"\n");
        System.out.println("You'll need "+total+" gallons to paint the ceiling");


    }
}
