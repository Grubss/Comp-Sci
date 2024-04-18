/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *The class creates a receipt for the customer, including name, ID and 
 * total price for items purchased.
 * @author Nathan Gily
 */
public class Receipt {
    private String rName;
    
    private int receiptID;
    
    private double total; 
    
    /**
     * Default constructor for the Receipt.
     */
    public Receipt(){
        
    }
    /**
     * Overloaded constructor for the receipt.
     * @param rName 
     * @param recieptID
     * @param total 
     */
    public Receipt(String rName, int recieptID, double total){
        this.rName = rName;
        this.receiptID = receiptID;
        this.total = total;
    }
    
    /**
     * Sets the name for the users receipt.
     * @param rName 
     */
    public void setrName(String rName){
        this.rName = rName;
    }
    
    /**
     * Sets the receipts ID, preferably created via RNG.
     * @param receiptID 
     */
    public void setID(int receiptID){
        this.receiptID = receiptID;
    }
    
    /**
     * Sets the total price of purchased items for the Receipt. 
     * @param total 
     */
    public void setTotal(double total){
        this.total = total;
    }
    
    /**
     * Retrieves the receipt name.
     * @return rName
     */
    public String getrName(){
    return rName;
    }
    
    /**
     * Retrieves the receipt ID.
     * @return receiptID
     */
    public int getID(){
        return receiptID;
    }
    
    /**
     * Retrieves the Total Price.
     * @return total
     */
    public double getTotal(){
        return total;
    }
    
    
}
