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
    
    public Customer(){
        
    }
    public Customer(String name, int id, int points){
        this.name = name;
        this.id = id;
        this.points = points;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setLoyalty(int points){
        this.points = points;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    /**
     * 
     * @return 
     */
    public int getLoyalty(){
        return points;
    }
    
    @Override
    public String toString(){
        return "Customer name: "+ name+ "\nCustomer id: "+ id+ "\nCustomer Loyalty: "+ points;
    }
    
}
