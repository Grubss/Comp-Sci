/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *The class creates a receipt for the customer, includeing name, ID and 
 * total price for items purchased
 * @author natbe
 */
public class Receipt {
    private String rName;
    
    private int receiptID;
    
    private double total; 
    
    public Receipt(){
        
    }
    
    public Receipt(String rName, int recieptID, double total){
        this.rName = rName;
        this.receiptID = receiptID;
        this.total = total;
    }
    
    public void setrName(String rName){
        this.rName = rName;
    }
    
    public void setID(int receiptID){
        this.receiptID = receiptID;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public String getrName(){
    return rName;
    }
    
    public int getID(){
        return receiptID;
    }
    
    public double getTotal(){
        return total;
    }
    
    
}
