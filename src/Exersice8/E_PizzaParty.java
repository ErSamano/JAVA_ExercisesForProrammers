package Exersice8;

/*
    Division isn’t always exact, and sometimes you’ll write
    programs that will need to deal with the leftovers as a whole
    number instead of a decimal.
    Write a program to evenly divide pizzas. Prompt for the
    number of people, the number of pizzas, and the number of
    slices per pizza. Ensure that the number of pieces comes out
    even. Display the number of pieces of pizza each person
    should get. If there are leftovers, show the number of leftover
    pieces.

    Example Output
    >> How many people?
    << 8
    >> How many pizzas do you have?
    << 2
    >> 8 people with 2 pizzas
    >> Each person gets 2 pieces of pizza.
    >> There are 0 leftover pieces.
 */

import javax.swing.*;

public class E_PizzaParty {
    public static void main(String[] a){

        String sPeople;
        String sPizzas;
        int people;
        int pizzas;
        int pieces;
        int leftover;
        int slices;
        int newAmount;

        sPeople = JOptionPane.showInputDialog("How many people?");
        people  = Integer.parseInt(sPeople);
        sPizzas = JOptionPane.showInputDialog("How many pizzas do you have?");
        pizzas  = Integer.parseInt(sPizzas);


        //Confirmation
        System.out.println(people+" people with "+pizzas+" pizzas");

        //The slices in a pizza are 8 as a constant
        slices = 8;
        pieces = (slices * pizzas)/people;
        leftover = (slices * pizzas)%people;

        System.out.println("Each person gets "+pieces+" pieces of pizza.");
        System.out.println("There are "+leftover+" leftover pieces.");

        if (!(leftover == 0)) {
            System.out.println("You should get another pizza!");
        }
        else{
            System.out.println("Everything is even");
        }


    }
}
