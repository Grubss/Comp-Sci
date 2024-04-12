
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
        //needed for the first switch check
        int select;
        //needed for editing customers
        int tempID;
        int tempPoints;
        //the start of the main body. The do loop allows the switch case to run indefinitely while the 4th case is not selected 
        do {
            System.out.println("Creat new customer: 1");
            System.out.println("Edit Customer: 2");
            System.out.println("Delete Customer: 3");
            System.out.println("Exit: 4");
            select = in.nextInt();
//checking for valid input for the switch
            if (select <= 4 || select >= 1) {

                switch (select) {
                    //Case 1 allows the creation of the new Customer and adds it to an array list. The name is the only input neccasairy as the id is random generated between 1 and 9999, 
                    //and the loyalty points should default as 0. They are added to the 0 position as to make it a consisten search.
                    //(might change this as there could be a command to fetch the last index of an array)
                    case 1:
                        System.out.println("Please enter your name");
                        in.nextLine();

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
                        int i = in.nextInt();
                        //finds the iteration of the arraylist that matches id
                        for (Customer search : customers) {

                            if (search.getId() == i) {
                                System.out.println(search);
                                //saves the index position
                                int p = customers.indexOf(search);
                                //begin editing the customer data by saving to the tempCustomer
                                System.out.println("Input new customer name:");
                                in.nextLine();
                                tempCustomer.setName(in.nextLine());
                                System.out.println("");
                                //repeats so that the id is a valid input between 1 and 9999
                                do {
                                    System.out.println("Input new Id between 1 and 9999: ");
                                    tempID = in.nextInt();
                                } while (tempID >= 10000 && tempID <= 0);
                                tempCustomer.setId(tempID);
                                //repeats so that the loyalty points is a valid input that is greater than or equal to 0
                                do {
                                    System.out.println("Input loyalty points: ");
                                    tempPoints = in.nextInt();
                                } while (tempPoints < 0);
                                tempCustomer.setLoyalty(tempPoints);
                                //Sets the tempCustomer as the a replacement for the object at the p position 
                                customers.set(p, tempCustomer);
                            }
                        }
                        break;

                    case 3:
                        for (Customer s : customers) {
                            System.out.println(s);
                            System.out.println("");
                        }

                }

                //Case 3 is how to remove customers
            }

        } while (select != 4);
    }

}
