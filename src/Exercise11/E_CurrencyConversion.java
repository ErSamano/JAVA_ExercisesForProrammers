package Exercise11;

import javax.swing.*;

/*
    At some point, you might have to deal with currency
    exchange rates, and you’ll need to ensure your calculations
    are as precise as possible.
    Write a program that converts currency. Specifically, convert
    euros to U.S. dollars. Prompt for the amount of money in
    euros you have, and prompt for the current exchange rate
    of the euro. Print out the new amount in U.S. dollars. The
    formula for currency conversion is

    amount to = (amount_from * rate_from )/rate_to

    Where
    • Amount to is the amount in U.S. dollars.
    • Amount from is the amount in euros.
    • rate from is the current exchange rate in euros.
    • rate to is the current exchange rate of the U.S. dollar.

    Example Output
    >>How many euros are you exchanging?
    << 81
    >> What is the exchange rate?
    << 137.51
    >> 81 euros at an exchange rate of 137.51 is 111.38 U.S. dollars.

    Constraints
    • Ensure that fractions of a cent are rounded up to the
      next penny.
    • Use a single output statement.
 */
public class E_CurrencyConversion {
    public static void main(String[] args){
        double euros, dollars, exrate;
        String Seuros, Srate;

        Seuros = JOptionPane.showInputDialog("How many Euros are you exchanging?");
        euros = Double.parseDouble(Seuros);
        Srate = JOptionPane.showInputDialog("what is the exchange rate?");
        exrate = Double.parseDouble(Srate);

        dollars = (euros*exrate)/100;

        System.out.println(euros+" euros at exchange rate of "+exrate+" is "+((double)Math.round(dollars * 100d)/100d)+" U.S. dollars");
    }

}
