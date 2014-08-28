/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rob
 */
import java.util.*;

import java.util.Scanner;

public class MutualFund {
  public static void main (String [] args) {
    Scanner reader = new Scanner(System.in);
    double intRate = 0, startPrincipal = 0, years = 0, intEarned = 0, endPrincipal = 0;
    int index;
    while (true){
    try {
      System.out.print("Enter the interest rate(i.e. 5 = 5%): ");
      intRate = reader.nextDouble();
      break;
    }catch (Exception e) {
      System.out.println("Invalid format, Please enter a whole number:");
      reader.nextLine();
    }
    }
    while (true){
    try {
      System.out.print("Enter the initial principal(i.e. 1000): ");
      startPrincipal = reader.nextDouble();
      break;
    }catch (Exception e) {
      System.out.println("Invalid format, Please enter a whole number");
      reader.nextLine();
    }
    }
    while (true){
    try {
      System.out.print("Enter the duration of the mutual fund, in years(i.e. 5 = 5 years): ");
      years = reader.nextDouble();
      break;
    }catch (Exception e) {
      System.out.println("Invalid format, Please Enter a whole number");
      reader.nextLine();
    }
    }
    intEarned = startPrincipal * (intRate/100);
    endPrincipal = startPrincipal * (1 + (intRate/100));
    
    System.out.println("Year \t Starting Principal \t Interest Earned \t Principal Ending");
    System.out.printf("1 \t  $%.2f \t  $%.2f \t\t\t$%.2f%n", startPrincipal, intEarned, endPrincipal);
    
    
    for (index = 2; index <= years; index++) {
      startPrincipal = endPrincipal;
      intEarned = startPrincipal * (intRate/100);
      endPrincipal = startPrincipal * (1 + (intRate/100));
      System.out.printf("%d \t  $%.2f \t  $%.2f \t\t\t$%.2f%n", index, startPrincipal, intEarned, endPrincipal);
    }
  }
}
    