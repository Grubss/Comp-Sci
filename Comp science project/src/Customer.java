/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bjcra
 */
public class Customer {
    private String name;
    private int id;
    private int points;
    /**
     * The default constructor for Customer.
     */
    public Customer(){
        
    }
    /**
     * Overloaded constructor for Customer
     * @param name The name of the Customer
     * @param id The assigned id for the Customer. Should be unique per Customer.
     * @param points The Loyalty Points assigned to a Customer
     */
    public Customer(String name, int id, int points){
        this.name = name;
        this.id = id;
        this.points = points;
    }
    /**
     * The setter method for the name.
     * @param name The name being assigned to the Customer. 
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * The setter method for the id.
     * @param id The id being assigned to the Customer. Should be a unique id.
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * The setter method for Loyalty Points.
     * @param points The number of Loyalty Points that is being assigned to the Customer. Should not be a negative number.
     */
    public void setLoyalty(int points){
        this.points = points;
    }
    /**
     * The getter method for Customer name.
     * @return Returns the string assigned as Customer name.
     */
    public String getName(){
        return name;
    }
    /**
     * The getter method for the Customer id.
     * @return Returns the integer id assigned to the Customer.
     */
    public int getId(){
        return id;
    }
    /**
     * The getter method for Loyalty Points
     * @return Returns the integer Loyalty Points assigned to the Customer.
     */
    public int getLoyalty(){
        return points;
    }
    /**
     * An override method for ArrayList so that the return for the method is formatted.
     * @return Returns the formatted string that contains the Customer name, id, and Loyalty Points.
     */
    @Override
    public String toString(){
        return "Customer name: "+ name+ "\nCustomer id: "+ id+ "\nCustomer Loyalty: "+ points+"\n";
    }
    
}
