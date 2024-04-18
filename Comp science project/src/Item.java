
public class Item {
    private String name;
    private double price;
    private double discountAmount;
    private int discountEach;
    
    //Default constructor
    public Item(){
        
    }
    public Item(String name, double price, double discountAmount, int discountEach){
        this.name = name;
        this.price = price;
        this.discountAmount = discountAmount;
        this.discountEach = discountEach;
    }
    
    /*
    Sets name for the item.
    @param name The name for the item.
    */
    public void setName(String name){
        this.name = name;
    }
    /*
    Sets price of the item.
    @param price The price that is set.
    */
    public void setPrice(double price){
        this.price = price;
    }
    
    /*
    Sets the amount of discount for the item.
    @param discountAmount the discount amount is set.
    */
    public void setDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
    }
    
    /*
    Sets the discount per item.
    @param discountEach the discount is set for each item.
    */
    public void setDiscountEach(int discountEach){
        this.discountEach = discountEach;
    }
    //Getters
    /*
    Gets the name of the item
    @return the name
    */
    public String getName(){
        return name;
    }
    /*
    Gets the price of the item.
    @return the price
    */
    public double getPrice(){
        return price;
    }
    
    /*
    Gets the discount amount for the item.
    @return the discount amount.
    */
    public double getDiscountAmount(){
        return discountAmount;
    }
    
    /*
    Gets the discount per item.
    @return the discount.
    */
    public int getDiscountEach(){
        return discountEach;
    }
    @Override
    public String toString(){
        return "\nItem name: "+ name +"\nItem Price: "+ price + "\nDiscount amount: %"+discountAmount*100+"\nAmount of items for discount "+discountEach+"\n";
    }
}
