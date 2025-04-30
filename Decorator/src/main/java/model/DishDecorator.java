/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Владислав
 */
public abstract class DishDecorator implements Dish{
    protected Dish dish;
    
    public DishDecorator(Dish dish){
        this.dish = dish;
    }
    public String getDescribtion(){
        return dish.getDescribtion();
    }
    
    public double getCost(){
        return dish.getCost();
    }
    
}
