//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // imports go at the top of the file BEFORE the class!
public class ShipCostCalculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //create a Scanner in to read from the console

        final int FREE_SHIPPING = 100; //amount you need for free shipping
        final double SHIPPING_COST = 1.02; //amount ot multiply cartCost to get cost plus shipping
        double itemCost = 0; //cost of each individual items

        System.out.println("What is the cost of your item?"); //Prompts user for item cost

        if (in.hasNextDouble()) //Get user input for item cost
        {
            itemCost = in.nextDouble();
            in.nextLine();
        }
        if (itemCost >= FREE_SHIPPING) //See if they can get free shipping
        {
            System.out.println("Your order is over $100, so you qualify for free shipping! Your total cost is $" + itemCost);
        } else
        {
            System.out.println("Your total including shipping is $"+ itemCost * SHIPPING_COST);//calculate cost with shipping
        }

    }
}