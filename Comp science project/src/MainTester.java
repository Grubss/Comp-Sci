
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
        ArrayList<Item> items = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //needed for the first switch check
        int select;
        boolean exit = true;
        boolean nestExit = true;
        int nestSelect;
        int index;

        //needed for editing customers
        int tempID;
        int tempPoints;
        //needed for item creation and editing
        double priceSet;
        int discSet;
        int discAmmSet;
        //the start of the main body. The do loop allows the switch case to run indefinitely while the 4th case is not selected 
        do {
            if (nestExit == false) {
                nestExit = true;
            }

            System.out.println("Customer: 1");
            System.out.println("Item: 2");
            System.out.println("receipt: 3");
            System.out.println("Exit: 4");

            select = inputCheckerInt();

            switch (select) {

                case 1:

                    do {
                        System.out.println("");
                        System.out.println("Creat new customer: 1");
                        System.out.println("Edit Customer: 2");
                        System.out.println("Delete Customer: 3");
                        System.out.println("view customers: 4");
                        System.out.println("Exit: 5");
                        nestSelect = inputCheckerInt();
                        System.out.println("");

                        switch (nestSelect) {

                            //Case 1 allows the creation of the new Customer and adds it to an array list. The name is the only input neccasairy as the id is random generated between 1 and 9999, 
                            //and the loyalty points should default as 0. They are added to the 0 position as to make it a consisten search.
                            //(might change this as there could be a command to fetch the last index of an array)
                            case 1:
                                System.out.println("Please enter your name ");

                                customers.add(0, new Customer(in.nextLine(), (int) (Math.random() * 10000), 0));
                                //prints out the name, id, and loyalty points
                                 System.out.println("");
                                System.out.println(customers.get(0));
                               
                                break;
                            //Case 2 allows the editing of the Customer by searching the random generated id and finding the index position of the object containg the id.
                            case 2:
                                Customer tempCustomer = new Customer();
                                System.out.println("Search an ID to edit");
                                //saves the id for the "for" loop
                                int idEntry = inputCheckerInt();
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
                                    }
                                }
                                break;
                            //removes index position containing the customer id
                            case 3:
                                System.out.println("Search id to delete");
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
                            case 4:
                                System.out.println(customers);
                                break;
                            case 5:
                                nestExit = false;
                                break;

                            default:
                                System.out.println("Enter valid input");

                        }
                    } while (nestExit);

                    break;
//item related case in the switch edit as needed
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("Creat new Item: 1");
                        System.out.println("Edit Item: 2");
                        System.out.println("Delete Item: 3");
                        System.out.println("Show Items: 4");
                        System.out.println("Exit: 5");

                        nestSelect = inputCheckerInt();
                        System.out.println("");

                        switch (nestSelect) {

                            case 1:
                                Item item = new Item();
                                System.out.println("Enter new Item name");

                                item.setName(in.nextLine());
                                do {
                                    System.out.println("Enter Item price");
                                    priceSet = inputCheckerDouble();
                                } while (priceSet < 0);
                                item.setPrice(priceSet);
                                System.out.println("");
                                do {
                                    System.out.println("Enter item discount amount as a percentage");
                                    discSet = inputCheckerInt();
                                } while (discSet > 0);
                                item.setDiscountAmount(discSet / 100);
                                System.out.println("");
                                do {
                                    System.out.println("Input the number of items needed for discount");
                                    discAmmSet = inputCheckerInt();
                                } while (discAmmSet > 0);
                                item.setDiscountEach(discAmmSet);
                                System.out.println("");
                                items.add(0, item);
                                items.get(0);
                                break;
                            case 2:
                                System.out.println("Input item name you want to edit");
                                for (Item search : items) {

                                    if (search.getName().equalsIgnoreCase(in.nextLine())) {
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
                                        } while (discSet > 0);
                                        search.setDiscountAmount(discSet / 100);
                                        System.out.println("");
                                        do {
                                            System.out.println("Input the new number of items needed for discount");
                                            discAmmSet = inputCheckerInt();
                                        } while (discAmmSet > 0);
                                        search.setDiscountEach(discAmmSet);
                                        items.set(index, search);
                                        System.out.println("");
                                        items.get(index);
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Enter name of item to delete");
                                for (Item search : items) {
                                    if (search.getName().equalsIgnoreCase(in.nextLine())) {
                                        System.out.println(search);
                                        index = items.indexOf(search);
                                        items.remove(index);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println(items);
                                break;

                            case 5:
                                nestExit = false;
                                break;

                            default:
                                System.out.println("Enter valid input");

                        }
                    } while (nestExit);

                    break;

                //reciept related case in the switch edit as needed
                case 3:
                    do {

                        nestSelect = inputCheckerInt();

                        switch (nestSelect) {

                            case 1:

                            case 2:

                            case 3:

                            case 4:
                                nestExit = false;
                                break;

                            default:
                                System.out.println("Enter valid input");

                        }
                    } while (nestExit);

                    break;

                case 4:
                    exit = false;
                    break;

                default:
                    System.out.println("Enter valid input");

            }

        } while (exit);
        //System.out.println(customers);
    }
//A method for input valid integer. Excludes letter characters

    static int inputCheckerInt() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("input valid number");
            input.next();

        }
        return input.nextInt();
    }
//A method for input validation double. Excludes letter characters

    static double inputCheckerDouble() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            System.out.println("input valid number");
            input.next();
        }
        return input.nextDouble();

    }
}
