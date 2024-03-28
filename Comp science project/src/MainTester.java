
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
        int select;

        do {
            System.out.println("Creat new customer: 1");
            System.out.println("Edit Customer: 2");
            System.out.println("Delete Customer: 3");
            System.out.println("Exit: 4");
            select = in.nextInt();
            if (select <= 4 || select >= 1) {

                switch (select) {
                    case 1:System.out.println("");
Customer customer = new Customer();
 System.out.println("Please enter your Customer ID: ");
                        customer.setcID(in.nextInt());
 
                        System.out.print("Enter new name for player: ");
        customer.setcName(in.nextLine());

                       

                        System.out.print("Please enter your Loyalty Points: ");
                        customer.setcLoyalty(in.nextInt());
                        
                        customers.add(customer);
                        break;
                    case 2:
                        System.out.println("input id number");
                        customers.get(in.nextInt() - 1);
                        System.out.println(customers.get(in.nextInt() - 1));
                }

            }
        } while (select != 4);
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
