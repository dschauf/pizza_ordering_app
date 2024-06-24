// Chapter 4 extra project 

import java.util.Scanner;

public class PizzaShop {
     public static void main(String[] args) {
          // variables and constants
          String customer;
          int toppings;
          Scanner input = new Scanner(System.in);
          Pizza order1 = new Pizza();

          // Input phase
          Pizza.intro();
          System.out.print("What name will the order be under? >>");
          customer = input.nextLine();
          System.out.print("Now, please enter the number of toppings >>");
          toppings = input.nextInt();

          // Processing phase
          order1.enterName(customer);
          order1.addToppings(toppings);
          order1.calcPrice();

          // Output phase
          order1.summary();
     } // end of main()
} // end of class block