
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
//creates an array list called customer and a scanner detector
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
//creating a do loop that uses switch to create, edit direct details, delete customers in the array by their given array id, and exit the loop
        int select;

        do {
            System.out.println("Creat new customer: 1");
            System.out.println("Edit Customer: 2");
            System.out.println("Delete Customer: 3");
            System.out.println("Exit: 4");
            select = in.nextInt();
//checking for valid input for the switch
            if (select <= 4 || select >= 1) {

                switch (select) {
                    case 1:

//creates the basis for a new customer and fills out their info using setters
                        Customer customer = new Customer();
                        System.out.print("Enter Your Name: ");
                        
                        in.nextLine();
                        customer.setcName(in.nextLine());
                        System.out.print("Please enter your Loyalty Points: ");
                        customer.setcLoyalty(in.nextInt());
//adds the customer to the array list "customers" so that their array posistion can be used to recall customer info
// the plus 1 is to make it so there isnt a customer 0. it isnt neccasairy but does kinda look nice. if removed make sure to update case 2 of this switch 
                        customers.add(customer);
                        customer.setcID(customers.indexOf(customer) + 1);
                        System.out.println("Your id number is " + customer.getcID());
                        System.out.println("");

                        break;

                    case 2:
//finds the customer info by asking for the id. The id is to be the array list position.
                        System.out.println("input id number");
                        int i = in.nextInt() - 1;
//displays the current customer info
                        System.out.println(customers.get(i));
                        
                        System.out.println("");
                        System.out.print("Enter Your Name: ");
                        
                        
                        
                        
                        
                }

            }
        } while (select != 4);
//returns to the top of the do until 4 is selected as a switch
    }
}

/*while (true){
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
    
    }*/
