
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bjcra
 */
public class MainTester {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
     Scanner in = new Scanner(System.in);
     
   
     while (true){
         System.out.print("Please enter your Name: ");
          String cName = in.next();
         
          System.out.print("Please enter your Customer ID: ");
          int cID = in.nextInt();
          
          System.out.print("Please enter your Loyalty Points: ");
          int cLoyalty = in.nextInt();
          
          System.out.println("Please type 'finished' to finish entering your information, or press type 'new' to add another customer.");
          
          Customer customer = new Customer(cName, cID, cLoyalty);
         customers.add(customer);
         
         String exitOption = in.next();
         if (exitOption.equalsIgnoreCase("finished")) {
             break;
                     }
         
         
         
     }
         System.out.println("Customer Information: ");
         customers.forEach((customer) -> {
             System.out.println(customer);
        });
    
    }
}