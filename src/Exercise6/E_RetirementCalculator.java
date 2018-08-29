package Exercise6;

import javax.swing.*;
import java.util.Calendar;

/*
    Your computer knows what the current year is, which means
    you can incorporate that into your programs. You just have
    to figure out how your programming language can provide
    you with that information.
    Create a program that determines how many years you have
    left until retirement and the year you can retire. It should
    prompt for your current age and the age you want to retire
    and display the output as shown in the example that follows.

    Example Output
    What is your current age? 25
    At what age would you like to retire? 65
    You have 40 years left until you can retire.
    It's 2015, so you can retire in 2055.

    Constraints
    • Again, be sure to convert the input to numerical data
      before doing any math.
    • Don’t hard-code the current year into your program.
      Get it from the system time via your programming language.
 */
public class E_RetirementCalculator {
    public static void main(String[] a){

        String StringAge = JOptionPane.showInputDialog("Whats is your current age?");
        int age = Integer.parseInt(StringAge);
        String StringRetire = JOptionPane.showInputDialog("At what age you would like to retire?");
        int retire = Integer.parseInt(StringRetire);

        int yearDif = retire - age;

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        int retireYear = year+yearDif;

        System.out.println("You have "+yearDif+" until you can retire.");
        System.out.println("It's "+year+", so you can retire in "+retireYear);

    }
}
