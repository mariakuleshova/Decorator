/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Владислав
 */
public class BreadDecorator extends DishDecorator{
    public BreadDecorator(Dish dish) {
        super(dish);
    }
    public String getDescribtion(){
        return dish.getDescribtion()+" "+"Нордская лепёшка";
    }
    
    public double getCost(){
        return dish.getCost() +7;
    }
}
