package Exercise2;

/*
    Create a program that prompts for an input string and displays
    output that shows the input string and the number of
    characters the string contains.

    Example Output
    >> What is the input string?
    << Homer
    >> Homer has 5 characters.
 */

import javax.swing.*;

public class E_CountingTheNumberOfCharacters {

    public static void main(String[] args){

        String input;

        do{

            input = JOptionPane.showInputDialog("Enter your name:");

        }while(input == "");

        System.out.println(input + " has " + input.length() + " characters.");
    }

}
