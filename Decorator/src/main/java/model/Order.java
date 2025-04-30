/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.time.LocalTime;

/**
 *
 * @author maria
 */
public class Order {
    private String desribtion;
    private Double cost;
    private LocalTime date;
    
    public Order(String describtion, Double cost) {
        this.cost = cost;
        this.desribtion = describtion;
        this.date = LocalTime.now();
    }

    public String getDesribtion() {
        return desribtion;
    }

    public void setDesribtion(String desribtion) {
        this.desribtion = desribtion;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }
    
    
}
