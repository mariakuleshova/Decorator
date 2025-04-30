/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author test2023
 */
public enum DishEnum {
    BERRY("Снежные ягоды"), BREAD("Нордская лепешка"), 
    DOUBLE("Двойная порция оленины"), SOUCE("Огненный соус");
    private String name;
    
    DishEnum(String name){
        this.name = name; 
    }
    String getName(){
        return name;
    }
    public static DishEnum getDish(String dishName){
        for (DishEnum Enum : values()) {
            if (Enum.getName().equals(dishName)){
                return Enum;
            }
        }
        throw new IllegalArgumentException("Неизвестное имя");
    }
}
