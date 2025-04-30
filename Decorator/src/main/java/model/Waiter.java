/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.DishBinder;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Waiter {
    private ArrayList<Order> orders = new ArrayList<>();
    public Waiter (){
        
    }
    
    public void addDish(DishBinder binder){
        Dish dish = new SimpleDish();
        
        while (binder.hasNext()){
           dish = DecoratorCreator.createDecorator(binder.next(), dish);
        }

        Order order = new Order(dish.getDescribtion(), dish.getCost());
        orders.add(order);
        
    }
    
    public ArrayList<Order> getOrders(){
        return orders;
    }
}
