/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdriverprogram;

import java.util.ArrayList;
import java.util.List;

public class Order  {

    private List<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public int getTotal() {
        int total = 0;
        for (OrderItem item : orderItems) {
            total += item.getCost();
        }
        return total;
    }

    public void printOrderItems() {
        for (OrderItem item : orderItems) {
            System.out.println(item.toString());
        }
    }
        
    }
    
