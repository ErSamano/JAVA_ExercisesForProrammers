package Exercise12;
/*
    Computing simple interest is a great way to quickly figure
    out whether an investment has value. It’s also a good way
    to get comfortable with explicitly coding the order of operations
    in your programs.
    Create a program that computes simple interest. Prompt for
    the principal amount, the rate as a percentage, and the time,
    and display the amount accrued (principal + interest).
    The formula for simple interest is

        A = P(1 + rt),

    Where P is the principal amount, r is the annual rate of interest, t is the
    number of years the amount is invested, and A is the amount
    at the end of the investment.

    Example Output
    >> Enter the principal:
    << 1500
    >> Enter the rate of interest:
    << 4.3
    >> Enter the number of years:
    << 4
    >> After 4 years at 4.3%, the investment will be worth $1758.

    Constraints
    • Prompt for the rate as a percentage (like 15, not .15).
      Divide the input by 100 in your program.
    • Ensure that fractions of a cent are rounded up to the
      next penny.
    • Ensure that the output is formatted as money.
*/

import javax.swing.*;

public class E_ComputingSimpleInterest {
    public static void main(String[] a){
        double amount, pamount, interest, years;
        String Spamount, Sinterest, Syears;

        Spamount = JOptionPane.showInputDialog("Enter the principal amount: ");
        pamount = Double.parseDouble(Spamount);
        Sinterest = JOptionPane.showInputDialog("Enter the rate of interest in % ");
        interest = Double.parseDouble(Sinterest);
        Syears = JOptionPane.showInputDialog("Enter the number of years: ");
        years = Double.parseDouble(Syears);

        amount = pamount*(1+(interest/100)*years);
        /*
        public static double amountFunct(double pa, double in, double yea){

            amount = pa*(1+(in/100)*yea);

            return amount;

        }*/


        //(int) Math.round(X);
        System.out.println("After "+(int) Math.round(years)+" tears at "+interest+"%, the investment will be worth $"+amount);

    }
}
