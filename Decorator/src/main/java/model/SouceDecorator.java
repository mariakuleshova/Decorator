/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Владислав
 */
public class SouceDecorator extends DishDecorator{
    public SouceDecorator(Dish dish) {
        super(dish);
    }
    public String getDescribtion(){
        return dish.getDescribtion()+" "+"Огненный соус";
    }
    
    public double getCost(){
        return dish.getCost() +10;
    }
}
