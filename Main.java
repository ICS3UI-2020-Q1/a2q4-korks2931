import java.util.Scanner;

/**
 * This program will show the user how much they saved, which category they are
 * in and the new total.
 * 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the amount the costumer spent");
    // prompt the user for the money spent
    int spent = input.nextInt();
    // see how much they will receive
    if (spent <= 40.00 && spent >= 0.01) {
      System.out.println("They will recieve 10% off");
      // declare a variable to store saved
      
      
    } else if (spent <= 80.00 && spent >= 40.01) {
      System.out.println("They will receive 20% off");

    }
    if (spent <= 120.00 && spent >= 80.01) {
      System.out.println("They will receive 30% off");

    } else if (spent > 120.00) {
      System.out.println("They will receive 40% off");
    }
     int saved = spent / 10;
      System.out.println("They will save $" + saved + ".");
      // declare a variable to store total
      
      int total = spent - saved;
      System.out.println("The new total is $" + total + ".");
  }
}
