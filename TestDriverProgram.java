/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdriverprogram;
import java.util.Scanner;

public class TestDriverProgram {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        Order[] orders = new Order[4];
        orders[0] = new Order();
        orders[1] = new RushOrder(1);
        orders[2] = new RushOrder(2);
        orders[3] = new RushOrder(3);

        String upc;
        while (true) {
            System.out.print("Enter UPC for an item or 'done' to quit: ");
            upc = input.nextLine();
            if (upc.equals("done")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine();

            int price = (int) (Math.random() * 51) + 50;
            int deliveryDay = (int) (Math.random() * 7) + 1;

            OrderItem orderItem = new OrderItem(upc, quantity, price);

            if (deliveryDay >= 4) {
                orders[0].addOrderItem(orderItem);
            } else {
                orders[deliveryDay].addOrderItem(orderItem);
            }
        }

        double totalCost = 0.0;
        for (Order order : orders) {
            System.out.println("Type of Order: " + order.getClass().getSimpleName());
            order.printOrderItems();
            System.out.println("Subtotal: $" + order.getTotal());
            totalCost += order.getTotal();
            System.out.println();
        }

        System.out.println("Total Cost of all orders: $" + totalCost);
    }
}


   
