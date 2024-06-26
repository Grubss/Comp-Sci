/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * This is the class @Groceries contains the variables related to the stores items, 
 * including setters and getters for item names, price and amount.
 * @author Nathan Gily
 */
public class Groceries {

    private String item;
    private int amount;
    private double price;

    public Groceries() {

    }

    /** Realized i could just use the variables "price" and "item"
     * 
     * @param item A variable that allows you to create your own item.
     * @param amount A variable that determines the items purchased amount
     * @param price A variable for determining the price for the item.
     */
    public Groceries(String item, int amount, double price) {
        this.item = item;
        this.amount = amount;
        this.price = price;
    }


    /**
     * sets the name for the groceries.
     * @param item the groceries name.
     */
    public void setItem(String item) {
        this.item = item;
    }
    /**
     * The groceries amount.
     * @param amount for groceries purchased.
     */
    public void setAmount(int amount){
        this.amount = amount;
    }
    /**
     * set the price for individual items
     * @param price for item
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the groceries item name.
     * @return 
     */
    public String getItem() {
        return item;
    }
    
    /**
     * Gets the groceries item amount.
     * @return 
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * Gets the groceries item price.
     * @return 
     */
    public double getPrice() {
        return price;
    }
    /**
     * A "For" loop test for may class, hopefully i can get it working.
     *
     * @return Shampoo price and deals.
     */

}
