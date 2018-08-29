package Exercise3;
/*
    Quotation marks are often used to denote the start and end
    of a string. But sometimes we need to print out the quotation
    marks themselves by using escape characters.
    Create a program that prompts for a quote and an author.
    Display the quotation and author as shown in the example output.

    Example Output
    >> What is the quote?
    << These aren't the droids you're looking for.
    >> Who said it?
    << Obi-Wan Kenobi
    >> Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */

import javax.swing.*;

public class E_PrintingQuotes {

    public static void main(String[] a){

    String quote = JOptionPane.showInputDialog("What is the quote");
    String author = JOptionPane.showInputDialog("Who said it?");

    System.out.println(author+" says; "+'"'+quote+'"');

    }
}