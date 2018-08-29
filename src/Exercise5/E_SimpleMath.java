package Exercise5;

/*
    You’ll often write programs that deal with numbers. And
    depending on the programming language you use, you’ll
    have to convert the inputs you get to numerical data types.
    Write a program that prompts for two numbers. Print the
    sum, difference, product, and quotient of those numbers as
    shown in the example output:

    Example Output
    What is the first number? 10
    What is the second number? 5
    10 + 5 = 15
    10 - 5 = 5
    10 * 5 = 50
    10 / 5 = 2

    Constraints
    • Values coming from users will be strings. Ensure that
      you convert these values to numbers before doing the
      math.
    • Keep the inputs and outputs separate from the numerical
      conversions and other processing.
    • Generate a single output statement with line breaks in
      the appropriate spots.
 */

import javax.swing.*;

public class E_SimpleMath {
    public static void main(String[] a){

        int add, sub, mult, div;

        String number1 = JOptionPane.showInputDialog("Whats is the first number?");
        int num1 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Whats is the second number?");
        int num2 = Integer.parseInt(number2);

        add = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("Addition: "+add);
        System.out.println("Subtraction "+sub);
        System.out.println("Multiplication "+mult);
        System.out.println("Division "+div);

        }
}
