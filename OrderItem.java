/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdriverprogram;

public class OrderItem {
        
    public String ucp;
    private int quantity;
    private int price;
    
    public OrderItem(){
    
        ucp = "XXX";
        quantity = 0;
        price = 0;
    }
    
    public OrderItem(String ucp , int quantity , int price){
        
        this.ucp = ucp ; 
        this.quantity = quantity ;
        this.price = price ; 
        
    }
    
    public int getCost(){
    
        return (quantity*price);
    }
    
}
