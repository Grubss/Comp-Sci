package rop;

import java.util.ArrayList;
import java.util.Scanner;

public class ROP {

    public static void main(String[] args) {
//        All Declared Varaiables
            ArrayList<Customer> customers = new ArrayList<>();
            ArrayList<Item> items = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            Receipt R1 = new Receipt();
            Item I1 = new Item();
            Customer C1 = new Customer();
            int choice;
            String yesNo;
            boolean exit = true;
            boolean nestExit = true;
            int index;
            int idEntry;
            int tempPoints;
            int tempID;
            double priceSet;
            double discSet;
            int discAmmSet;
            String itemSearch;
            double i;
            int amount;
            double subTotal = 0;
            do {
            //resets the nestExit so that the nested loops arent immediatly exited
            if (nestExit == false) {
                nestExit = true;
            }
            System.out.println("");
            System.out.println("Welcome to the Retail Managment System.");
            System.out.println("Please choose an option.");
            System.out.println("Customer: 1");
            System.out.println("Item: 2");
            System.out.println("receipt: 3");
            System.out.println("Exit: 4");

            choice = inputCheckerInt();

            switch (choice) {
                case 1:
//                    Customer configuration
                    do {
                        System.out.println("");
                        System.out.println("Create new customer: 1");
                        System.out.println("Delete Customer: 2");
                        System.out.println("Edit Customer: 3");
                        System.out.println("view customers: 4");
                        System.out.println("Exit: 5");
                        choice = inputCheckerInt();
                        System.out.println("");
                
                switch (choice) {
                    case 1:
//                      Creating a new Customer
                        System.out.print("Please enter the new customer's name : ");
                        customers.add(0, new Customer(in.nextLine(), (int) (Math.random() * 10000), 0));
                        System.out.println(customers.get(0));
                        break;
                    case 2:
//                        Delete a Customer
                        System.out.print("Please enter the ID of the customer you want to delete : ");
                        //saves the id for the "for" loop
                        idEntry = inputCheckerInt();
                        for (Customer search : customers) {
                            if (search.getId() == idEntry) {                    
                                index = customers.indexOf(search);
                                customers.remove(index);
                                break;
                                    }                                
                               }
                        break;
                    case 3:
//                        Edit a existing customer
                    Customer tempCustomer = new Customer();
                    System.out.println("Search an ID to edit");
                    //saves the id for the "for" loop
                    idEntry = inputCheckerInt();
                    //finds the iteration of the arraylist that matches id
                    for (Customer search : customers) {
                        if (search.getId() == idEntry) {
                            System.out.println(search);
                            //saves the index position
                            index = customers.indexOf(search);
                            //begin editing the customer data by saving to the tempCustomer
                            System.out.println("Input new customer name:");              
                            tempCustomer.setName(in.nextLine());
                            //System.out.println("");
                            //repeats so that the id is a valid input between 1 and 9999
                            do {
                                System.out.println("Input new Id between 1 and 9999: ");
                                tempID = inputCheckerInt();
                            } while (tempID >= 10000 || tempID <= 0);
                            tempCustomer.setId(tempID);
                            //repeats so that the loyalty points is a valid input that is greater than or equal to 0
                            do {
                               System.out.println("Input loyalty points: ");
                                tempPoints = inputCheckerInt();
                            } while (tempPoints < 0);
                            tempCustomer.setLoyalty(tempPoints);
                            //Sets the tempCustomer as the a replacement for the object at the index position 
                            customers.set(index, tempCustomer);
                            }else if(customers.indexOf(search)==customers.size()-1){
                                System.out.println("Customer not found");
                                    }
                                    
                                }
                                break;
//                  View a customer info
                    case 4:
                        System.out.println("Please enter the Customer ID you wish to view");
                        idEntry = inputCheckerInt();
                        for (Customer search : customers) {
                            if (search.getId() == idEntry) {
                                System.out.println((search));
                                System.out.println("");
                                //this break exits the for loop
                                break;
                            }else if(customers.indexOf(search)==customers.size()-1){
                                System.out.println("Customer not found");
                                    }                                
                               }
                    case 5:
                        //this case exits the nested loop
                        nestExit = false;
                        break;
                }    
                    } while (nestExit);
                    break;
    
                case 2:
//                    Item Configuration
                    do {
                        //options to choose from
                        System.out.println("");
                        System.out.println("Create new Item: 1");
                        System.out.println("Edit Item: 2");
                        System.out.println("Delete Item: 3");
                        System.out.println("Show Items: 4");
                        System.out.println("Exit: 5");
                        //switch selector
                        choice = inputCheckerInt();
                        System.out.println("");
                switch (choice) {
                    case 1:
                        //creates an object item so that it can be stored in an arraylist. This uses a default constructor 
                        //and prompts user input for each setter method coresponding to item info. This is then loaded into the 
                        //and displayed
                        Item item = new Item();
                        System.out.println("Enter new Item name");
                        item.setName(in.nextLine());
                        //input validation for price
                        do {
                            System.out.println("Enter Item price");
                            priceSet = inputCheckerDouble();
                        } while (priceSet < 0);
                        item.setPrice(priceSet);
                        System.out.println("");
                        //input validation for discount amount
                        do {
                            System.out.println("Enter item discount amount as a percentage");
                            discSet = inputCheckerInt();
                        } while (discSet < 0);
                        item.setDiscountAmount(discSet / 100);
                        System.out.println("");
                        //input validation for discount eaches
                        do {
                            System.out.println("Input the number of items needed for discount");
                            discAmmSet = inputCheckerInt();
                        } while (discAmmSet < 0);
                        item.setDiscountEach(discAmmSet);
                        System.out.println("");
                        //assigns the arraylist and displays
                        items.add(0, item);
                        System.out.println(items.get(0));
                        break;
                        
                    case 2:
                        //This case allows the user to edit an item by searching the name, saving the index of the item seacrhed
                        //and prompting user input to assign new values. Then replaces the item at the position
                        System.out.println("Input item name you want to edit");
                        itemSearch=in.nextLine();
                        for (Item search : items) {
                            //searches for name reguardless of caps
                            if (search.getName().equalsIgnoreCase(itemSearch)) {
                                index = items.indexOf(search);
                                System.out.println(search);
                                System.out.println("Enter new name of item");
                                search.setName(in.nextLine());
                                System.out.println("");
                                do {
                                    System.out.println("Enter new Item price");
                                    priceSet = inputCheckerDouble();
                                } while (priceSet < 0);
                                search.setPrice(priceSet);
                                System.out.println("");
                                do {
                                    System.out.println("Enter new item discount amount as a percentage");
                                    discSet = inputCheckerInt();
                                } while (discSet < 0);
                                    search.setDiscountAmount(discSet / 100);
                                    System.out.println("");
                                do {
                                    System.out.println("Input the new number of items needed for discount");
                                    discAmmSet = inputCheckerInt();
                                } while (discAmmSet < 0);
                                    search.setDiscountEach(discAmmSet);
                                    items.set(index, search);
                                    System.out.println("");
                                    items.get(index);
                            }else if (items.indexOf(search)==items.size()-1){
                                System.out.println("Item not found");
                                    }
                                }
                        break;
                        
                    case 3:
                        System.out.println("Enter name of item to delete");
                        itemSearch=in.nextLine();
                        for (Item search : items) {
                        //searches for name reguardless of caps
                            if (search.getName().equalsIgnoreCase(itemSearch)){
                                System.out.println(search);
                                index = items.indexOf(search);
                                items.remove(index);
                                break;
                            }else if (items.indexOf(search)==items.size()-1){
                                System.out.println("Item not found");
                                    }
                                }
                        break;
                        
                    case 4:
//                        View Items
                        System.out.println("Please enter the name of the item you want to view");
                        itemSearch = in.nextLine();
                        for (Item search : items) {
                            //searches for name reguardless of caps
                            if (search.getName().equalsIgnoreCase(itemSearch)) {
                                System.out.println(search);
                                    }                                
                               }
                        
                    case 5:
                        //this case exits the nested loop
                        nestExit = false;
                        break;
                        
                    default:
                        System.out.print("Please enter a valid option.");
                        break;
                }
                } while (nestExit);
                    break;
                    
                case 3:               
//                  Reciept Configuration                                
                    Receipt receipt = new Receipt();
                    do {
                        System.out.printf("%nEnter name of item you want to purchase or type 'Done' to checkout: ");
                        itemSearch = in.nextLine();
                        if (itemSearch.equalsIgnoreCase("Done")) {
                            nestExit=false;
                            break;
                                }
                            for (Item search : items) {
                                //searches for name reguardless of caps
                                if (search.getName().equalsIgnoreCase(itemSearch)) {
                                    System.out.println(search);

                                        do {
                                            System.out.println("How many would you like to buy?");
                                            amount = inputCheckerInt();
                                        } while (amount < 0);
                                        receipt.setTotal(receipt.getTotal()+(amount*search.getPrice()));
                                        subTotal += (amount * search.getPrice());
                                        System.out.printf("%nItem price is: $%.2f", search.getPrice());
                                        if (search.getDiscountAmount() > 0) {
                                        i = (amount/search.getDiscountEach())*search.getDiscountAmount()*search.getPrice();
                                        System.out.printf("%nItem discounts: $%.2f", i);
                                        receipt.setTotal(receipt.getTotal()-i);
                                        }
                                        System.out.printf("%nItem total: %.2f", receipt.getTotal());
                                            
                                        } else if (items.indexOf(search) == items.size() - 1) {
                                            System.out.println("Item not found");
                                        }
                                    }
                        } while (nestExit); 
//                    Asks if User wants to use Loyalty points than calculates
                                System.out.println("Would you like to use your Loyalty Points? (Y/N)");
                                yesNo = in.nextLine();
                                if (yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("Yes")) {
                                    System.out.printf("%nSubtotal is: $%.2f", subTotal);
                                    System.out.printf("%nItem total: $%.2f", receipt.getTotal()); 
                                        System.out.printf("%nPlease enter your customer ID: ");
                                        idEntry = inputCheckerInt();  
//                                        Ensures Customer ID is valid
                                        for (Customer search : customers) {
                                            if (search.getId() == idEntry) {
                                                System.out.printf("%nYou have " + search.getLoyalty() + " Loyalty Points");
                                                nestExit = false;
                                                break;
                                            } else {
                                                System.out.printf("%nPlease enter a valid ID");
                                            } 
                                        }
                                    
                                    System.out.printf("%nHow many points would you like to use? (100 points = 1 dollar.)");
                                    amount = inputCheckerInt();
                                    for (Customer search : customers) {
                                        if (search.getId() == idEntry) {
                                            if (amount > search.getLoyalty()) {
                                                System.out.printf("%nInnsufficunt Loyalty Points");
                                            } 
                                            }
//                                    Displays Loyalty points and total    
                                    search.setLoyalty(search.getLoyalty() - amount);
                                    receipt.setTotal(receipt.getTotal() - (amount * .01));
                                    System.out.printf("%nSubtotal is: $%.2f", subTotal);
                                    System.out.printf("%nItem total: $%.2f", receipt.getTotal());
                                    int tempTotal = (int)receipt.getTotal(); 
                                    search.setLoyalty(search.getLoyalty() + tempTotal / 10);
                                    System.out.printf("%nTotal Loyalty Points: " , search.getLoyalty());
                                    receipt.setTotal(0);
                                    break;
                                    }
                                } else {
                                for (Customer search : customers) {
                                    System.out.printf("%nSubtotal is: $%.2f", subTotal);
                                    System.out.printf("%nItem total: $%.2f", receipt.getTotal()); 
                                    int tempTotal = (int)receipt.getTotal();
                                    search.setLoyalty(search.getLoyalty() + tempTotal / 10);
                                    System.out.printf("%nTotal Loyalty Points: " , search.getLoyalty());
                                    receipt.setTotal(0);
                                    break;
                                }
                                }
                      break;
                case 4:
//                  This case exits the program
                    exit = false;
                    break;
            }
                } while (exit);
            }

    //A method for input validation integer. Excludes letter characters

    static int inputCheckerInt() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("Please input valid number");
            input.next();

        }
        return input.nextInt();
    }
//A method for input validation double. Excludes letter characters

    static double inputCheckerDouble() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            System.out.println("Please input valid number");
            input.next();
        }
        return input.nextDouble();

    }
}
