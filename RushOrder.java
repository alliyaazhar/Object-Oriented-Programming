/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdriverprogram;

public class RushOrder extends Order {

    private int deliveryDay;
    
    public RushOrder(int deliveryDay){
        
        this.deliveryDay = deliveryDay;

    }
    
    public int getTotal(){
    
        int total=super.getTotal();
        
        if(total!=0){
        
            if(deliveryDay==1){
            
                total+=25;
                return total;
            }
            else if(deliveryDay==2){
            
                total+=15;
                return total;
            }
            else if (deliveryDay==3){
            
                total+=10;
                return total;
            }
            else if(deliveryDay>3){
            
                return total;
            }
        else{
            
            return 0;
            }
         
        }
        
    
