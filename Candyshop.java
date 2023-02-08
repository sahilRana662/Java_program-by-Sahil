/* 
 * Sahil Rana
 * Student Number = 300340146
 * A program to ask user for the type of candy they would like to purchase and the quantity . Based on their selection and quantity purchased, calculater the total price including any discount that may apply
 */
import java.util.Scanner;
public class Candyshop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double amount;  // to calculate the amount of purchase without discount  
    double discountAmount;   //  to calculate the discount they get on the purcahse 
    double discountCost;   // total cost of purchase after applying the discount
    
    System.out.println("What type of candy would you like to purchase?\n1.Gumballs \n2.Lollipops \n3.Chocolates");
    System.out.print("\nSelection: ");
    int selection = sc.nextInt();  // to take the input from user for type of candy they would like to purchase
    
    if(selection ==1){
        System.out.print("\nHow many Gumballs would you like to purchase? ");
    } else if(selection ==2){
        System.out.print("\nHow many Lollipops would you like to purchase? ");
    } else if(selection==3){
        System.out.print("\nHow many Chocolates would you like to purchase? ");
    } 

    int quantity = sc.nextInt();  // to take input from user about the quantity of candy they want
    
    if(selection ==1){
        if(quantity >=30){
            amount = (0.25 * quantity);
            discountAmount = (amount * 0.35 );
            discountCost = (amount - discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" + discountCost + " (discount applied: $" + discountAmount  + ")");
        } else if(quantity >=20){
             amount = (0.25 * quantity) ;
             discountAmount = (amount * 0.25) ;
             discountCost = (amount - discountAmount);
             System.out.println("\nThe total cost of your purchase is: $" + discountCost + " (discount applied: $" + discountAmount  + ")");
        } else if(quantity >=10){
            amount = (0.25 * quantity) ;
            discountAmount = (amount * 0.20);
            discountCost = (amount -  discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" +  discountCost + " (discount applied: $" + discountAmount + ")");
        } else{
            amount = (0.25 * quantity) ;
            System.out.println("\nThe total cost of your purchase is: $" + amount );
        }
        
    }
    
    if(selection ==2){
        if(quantity >=15){
            amount = (0.50 * quantity);
            discountAmount = (amount  * 0.25);
            discountCost = (amount -  discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" +  discountCost + " (discount applied: $" + discountAmount  + ")");
        } else if(quantity >=10){
             amount = (0.50 * quantity) ;
             discountAmount = (amount * 0.20) ;
             discountCost = (amount -  discountAmount);
             System.out.println("\nThe total cost of your purchase is: $" + discountCost + " (discount applied: $" + discountAmount  + ")");
        } else if(quantity >=5){
            amount = (0.50 * quantity) ;
            discountAmount = (amount * 0.10);
            discountCost = (amount -  discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" +  discountCost + " (discount applied: $" + discountAmount  + ")");
        } else{
            amount = (0.50 * quantity) ;
            System.out.println("\nThe total cost of your purchase is: $" + amount );
        }
        
    } 
    if(selection ==3){
        if(quantity >=8){
            amount = (1.00 * quantity);
            discountAmount= (amount  * 0.30) ;
            discountCost = (amount -  discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" +  discountCost + " (discount applied: $" + discountAmount + ")");
        } else if(quantity >=4){
             amount = (1.00 * quantity)  ;
             discountAmount = (amount * 0.20) ;
             discountCost = (amount -  discountAmount);
             System.out.println("\nThe total cost of your purchase is: $" + discountCost + " (discount applied: $" + discountAmount  + ")");
        } else if(quantity >=2){
            amount = (1.00 * quantity) ;
            discountAmount = (amount * 0.10);
            discountCost = (amount -  discountAmount);
            System.out.println("\nThe total cost of your purchase is: $" +  discountCost + " (discount applied: $" + discountAmount  + ")");
        } else{
            amount = (1.00 * quantity) ;
            System.out.println("\nThe total cost of your purchase is: $" + amount );
        }
        
    } 
    }
}