/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Владислав
 */
public class DeerDecorator extends DishDecorator{
    
    public DeerDecorator(Dish dish) {
        super(dish);
    }
    public String getDescribtion(){
        return dish.getDescribtion()+" "+"Двойная порция оленины";
    }
    
    public double getCost(){
        return dish.getCost() +20;
    }
}
