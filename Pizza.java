/* Chapter 4 extra project (not in text)
Starting price for a pizza is $15.99
Toppings cost 50 cents each */

public class Pizza {

     // Instance variables for the Pizza class
     private String custName;
     private double price;
     private int numToppings;

     // New custom constructor for this class
     public Pizza() {
          custName = "Customer";
          price = 15.99;
          numToppings = 0;
     } // end of constructor method

     // Basic static method for this class
     public static void intro() {
          System.out.println("*********************************");
          System.out.println("Welcome to the Digital Pizza Shop");
          System.out.println("*********************************");
     } // end of intro() method

     // Mutator (settler) methods for the Pizza class
     public void enterName(String name) {
          custName = name;
     }

     public void addToppings(int num) {
          numToppings = num;
     }

     public void calcPrice() {
          price = price + (numToppings * 0.50);
     }

     // Accessor (getter) methods for the Pizza class
     public void summary() {
          System.out.println();
          System.out.println("Thank you " + custName);
          System.out.println("A pizza with " + numToppings + " topping(s) will cost $" + price);
     }
} // end of class block

// This code is not able to run as its own app b/c we DO NOT have MAIN().
// When you run it, it will tell you you need "public static void main...". 
// But the code can be compiled to identify any major syntax errors.