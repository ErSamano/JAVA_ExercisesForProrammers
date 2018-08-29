package Exercise4;

import javax.swing.*;

/*
    Mad libs are a simple game where you create a story template
    with blanks for words. You, or another player, then
    construct a list of words and place them into the story, creating
    an often silly or funny story as a result.
    Create a simple mad-lib program that prompts for a noun,
    a verb, an adverb, and an adjective and injects those into a
    story that you create.

    Example Output
       >> Enter a noun:
       << dog
       >> Enter a verb:
       << walk
       >> Enter an adjective:
       << blue
       >> Enter an adverb:
       << quickly
       >> Do you walk your blue dog quickly? That's hilarious!

    Constraints
    • Use a single output statement for this program.
    • If your language supports string interpolation or string
      substitution, use it to build up the output.
 */
public class E_MadLib {
    public static void main(String[] a) {

        //We define the variables and inputs for the case
        String noun = JOptionPane.showInputDialog("Enter a noun");
        String verb = JOptionPane.showInputDialog("Enter a verb");
        String adjective = JOptionPane.showInputDialog("Enter an adjective");
        String adverb = JOptionPane.showInputDialog("Enter an adverb");

        //the order for this sentence should be verb, noun, adjective and adverb
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?, that's hilarious!");

    }
}
