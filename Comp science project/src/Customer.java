/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.util.ArrayList;
//import java.util.Scanner;


public class Customer {
    private String cName;
    private int cID;
    private int cLoyalty;
    
    
    
    

 public Customer() {

    }
 
 public Customer(String cName, int cID, int cLoyalty ){
     this.cName = cName;
     this.cID = cID;
     this.cLoyalty = cLoyalty; 
     
 }
 
 
 
 public void setcName(String newcName){
     cName = newcName;
 }
 
 public void setcID(int newcID){
     cID = newcID;
 }
 public void setcLoyalty(int newcLoyalty){
     cLoyalty= newcLoyalty;
 }
 
    @Override
 public String toString(){
     return "Name: " + cName + "\n" + "Customer ID: " + cID + "\n" + "Loyalty points: " + cLoyalty + "\n" ;
}

 
 public String getcName(){
     return cName;
 }
 public double getcID(){
     return cID;
 }
 
public double getcLoyalty(){
    return cLoyalty;
}

 public static void displayCustomer(Customer customer) {
        System.out.println("Customer Information:");
        System.out.println("Name: " + customer.getcName());
        System.out.println("Customer ID: " + customer.getcID());
        System.out.println("Loyalty Points: " + customer.getcLoyalty());
    }

 /*public static void main(String[] args) {
          
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
         for (Customer customer : customers) {
             System.out.println(customer);
         }
     }
          

    

 
*/
}
