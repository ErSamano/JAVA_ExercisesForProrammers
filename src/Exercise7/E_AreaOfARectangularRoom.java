package Exercise7;

/*
    When working in a global environment, you’ll have to
    present information in both metric and Imperial units. And
    you’ll need to know when to do the conversion to ensure
    the most accurate results.
    Create a program that calculates the area of a room. Prompt
    the user for the length and width of the room in feet. Then
    display the area in both square feet and square meters.

    Example Output
    What is the length of the room in feet? 15
    What is the width of the room in feet? 20
    You entered dimensions of 15 feet by 20 feet.
    The area is
    300 square feet
    27.871 square meters

    The formula for this conversion is
    m^2 = f^2 * 0.09290304

    Constraints
    • Keep the calculations separate from the output.
    • Use a constant to hold the conversion factor.
 */

import javax.swing.*;

public class E_AreaOfARectangularRoom {
    public static void main(String[] a){
        double factor = 0.09390304;
        int length;
        int width;
        int rArea;
        int dArea;
        String roomLength;
        String roomWidth;

        roomLength = JOptionPane.showInputDialog("What is the length of the room in feet?");
        length = Integer.parseInt(roomLength);
        roomWidth = JOptionPane.showInputDialog("Whats is the width of the room in feet?");
        width = Integer.parseInt(roomWidth);

        rArea = length * width;
        //dArea = (int) (rArea * factor);
        dArea = (int) Math.round(rArea * factor);
        System.out.println("You entered dimension of "+length+" feet by "+width+" feet");
        System.out.println("The area is: \n"+rArea+" feet \n"+dArea+" square meters.");
    }
}
