/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bjcra
 */
public class Reciept {
    final static double SHAMPOO = 3.00;
    final static double SOUP = 3.50;
    final static double CEREAL = 4.00;
    private int shampooA;
    private int soupA;
    private int cerealA;
    
    public Reciept(){
        
    }
    public Reciept(int shampooA, int soupA, int cerealA){
        this.shampooA = shampooA;
        this.soupA = soupA;
        this.cerealA = cerealA;
    }
    public void setShampoo(int shampooA){
        this.shampooA = shampooA;
    }
     public void setSoup(int soupA){
        this.soupA = soupA;
    }
     public void setCereal(int cerealA){
        this.cerealA = cerealA;
    }
     public int getShampoo(){
         return shampooA;
     }
      public int getSoup(){
         return soupA;
     }
       public int getCereal(){
         return cerealA;
     }
       public double getShampooT(){
           return SHAMPOO*shampooA;
       }
       public double getSoupT(){
           return SOUP*soupA;
       }
       public double getCerealT(){
           return CEREAL*cerealA;
       }
     
       public double getSubTotal(){
           return getShampooT() + getSoupT()+ getCerealT();
       }
       
       public double getDiscount(){
           double discountT = 0;
           if(shampooA>=2){
               discountT = getShampooT()/2+(shampooA%2*SHAMPOO);
           }/*else if(shampooA>2){
               discountT = getShampooT()/2+SHAMPOO;
           }*/
           
           if (soupA>=3){
               discountT = discountT+10*(soupA/3)+(soupA%3*SOUP);
           }
           
           if (cerealA>=4){
               discountT = discountT+/*(cerealA%4*CEREAL)*/+getCerealT()/8;
           }
           return discountT;
           
               
       }

       public static void main(String[] args) {
           Reciept r1 = new Reciept();
           r1.setCereal(5);
           System.out.println(r1.getDiscount());
        
    }
}
