package Exercise1;
import javax.swing.JOptionPane;


/*
    The “Hello, World” program is the first program you learn
    to write in many languages, but it doesn’t involve any input.
    So create a program that prompts for your name and prints
    a greeting using your name.

    Example Output:
    >> What is your name?
    << Brian
    >> Hello, Brian, nice to meet you!

*/

public class E_SayingHello {

    public static void main(String[] args){

        String input = JOptionPane.showInputDialog("Enter your name:");
        System.out.println("Exercise 1 done!\nWelcome "+input);
    }

}
