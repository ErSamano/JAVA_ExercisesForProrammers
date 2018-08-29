package Exercise10;
/*
    Working with multiple inputs and currency can introduce
    some tricky precision issues.
    Create a simple self-checkout system. Prompt for the prices
    and quantities of three items. Calculate the subtotal of the
    items. Then calculate the tax using a tax rate of 5.5%. Print
    out the line items with the quantity and total, and then print
    out the subtotal, tax amount, and total.

    Example Output
    Enter the price of item 1: 25
    Enter the quantity of item 1: 2
    Enter the price of item 2: 10
    Enter the quantity of item 2: 1
    Enter the price of item 3: 4
    Enter the quantity of item 3: 1
    Subtotal: $64.00
    Tax: $3.52
    Total: $67.52

    Constraints
    • Keep the input, processing, and output parts of your
    program separate. Collect the input, then do the math
    operations and string building, and then print out the
    output.
    • Be sure you explicitly convert input to numerical data
    before doing any calculations.
 */


import javax.swing.*;

public class E_SelfCheckout {
    public static void main(String[] a){

        String SItem;
        String SPrice;
        double acum;
        double price, quantity;
        double cont = 0;
        double tax = 0.055;
        double total;

        //Ask for how many product do you will insert
        String Stimes = JOptionPane.showInputDialog("How many products do you will enter?");
        int times = Integer.parseInt(Stimes);

        for(int count = 1; count<=times; count++){
            SPrice = JOptionPane.showInputDialog("Enter the price of item"+count);
            price = Double.parseDouble(SPrice);
            SItem = JOptionPane.showInputDialog("Enter the quantity of item"+count);
            quantity = Double.parseDouble(SItem);

            acum = price * quantity;
            cont = cont + acum;

        }
        System.out.println("Sub total is: "+cont);
        //Double d2=Double.valueOf(i);
        System.out.println("Tax fee: "+tax*100+"%");
        total = cont + (tax * cont);
        System.out.println("Total is: "+(double)Math.round(total * 100d)/100d);



    }
}
