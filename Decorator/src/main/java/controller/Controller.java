/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Order;
import model.Waiter;
import view.View;

/**
 *
 * @author Владислав
 */
public class Controller {
    private Waiter waiter = new Waiter();
    private DishBinder binder;
    
    public Controller() {
        View view = new View(this);
        view.setVisible(true);
        binder = new DishBinder();
        view.setBinder(binder);
        
}
    public void makeOrder(){
        binder.initializeIterator();
        waiter.addDish(binder);
    }
    
    public ArrayList<Order> MakeTableOfOrders(){
        return waiter.getOrders();
    }
}
