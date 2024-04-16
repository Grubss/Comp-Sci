
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

    static int inputCheckerInt() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("input valid number");
            input.next();

        }
        return input.nextInt();
    }

    static double inputCheckerDouble() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextDouble()) {
            System.out.println("input valid number");
            input.next();
        }
        return input.nextDouble();

    }

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //needed for the first switch check
        int select;
        boolean exit = true;
        boolean nestExit = true;
        int nestSelect;

        //needed for editing customers
        int tempID;
        int tempPoints;
        //the start of the main body. The do loop allows the switch case to run indefinitely while the 4th case is not selected 
        do {

            System.out.println("Customer: 1");
            System.out.println("Item: 2");
            System.out.println("receipt: 3");
            System.out.println("Exit: 4");

            select = inputCheckerInt();

            switch (select) {

                case 1:

                    do {

                        System.out.println("Creat new customer: 1");
                        System.out.println("Edit Customer: 2");
                        System.out.println("Delete Customer: 3");
                        System.out.println("Exit: 4");
                        nestSelect = inputCheckerInt();

                        switch (nestSelect) {

                            //Case 1 allows the creation of the new Customer and adds it to an array list. The name is the only input neccasairy as the id is random generated between 1 and 9999, 
                            //and the loyalty points should default as 0. They are added to the 0 position as to make it a consisten search.
                            //(might change this as there could be a command to fetch the last index of an array)
                            case 1:
                                System.out.println("Please enter your name ");

                                customers.add(0, new Customer(in.nextLine(), (int) (Math.random() * 10000), 0));
                                //prints out the name, id, and loyalty points
                                System.out.println(customers.get(0));
                                System.out.println("");
                                break;
                            //Case 2 allows the editing of the Customer by searching the random generated id and finding the index position of the object containg the id.
                            case 2:
                                Customer tempCustomer = new Customer();
                                System.out.println("Search an ID to edit");
                                //saves the id for the "for" loop
                                int idEntry = in.nextInt();
                                //finds the iteration of the arraylist that matches id
                                for (Customer search : customers) {

                                    if (search.getId() == idEntry) {
                                        System.out.println(search);
                                        //saves the index position
                                        int index = customers.indexOf(search);
                                        //begin editing the customer data by saving to the tempCustomer
                                        System.out.println("Input new customer name:");
                                        in.nextLine();
                                        tempCustomer.setName(in.nextLine());
                                        System.out.println("");
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
                                idEntry = in.nextInt();
                                for (Customer search : customers) {

                                    if (search.getId() == idEntry) {
                                        System.out.println(search);
                                        //saves the index position
                                        int index = customers.indexOf(search);
                                        customers.remove(index);

                                        break;
                                    }

                                }
                            case 4:
                                nestExit = false;
                                break;

                            default:
                                System.out.println("Enter valid input");
                                break;

                        }
                    } while (nestExit);
                    nestExit = true;
                    break;
//item related case in the switch edit as needed
                case 2:
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
                                break;

                        }
                    } while (nestExit);
                    nestExit = true;
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
                                break;

                        }
                    } while (nestExit);
                    nestExit = true;
                    break;
                case 4:
                    exit = false;

            }

        } while (exit);
        //System.out.println(customers);
    }

}
