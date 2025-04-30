/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author test2023
 */
public class DecoratorCreator {
    
    public static Dish createDecorator(String dishName, Dish dish){
        switch (DishEnum.getDish(dishName)) {
            case BERRY:
                return new BerryDecorator(dish);
            case BREAD:
                return new BreadDecorator(dish);
            case DOUBLE:
                return new DeerDecorator(dish);
            case SOUCE:
                return new SouceDecorator(dish);
            default:
                throw new AssertionError();
        }
 
    }
    
}
