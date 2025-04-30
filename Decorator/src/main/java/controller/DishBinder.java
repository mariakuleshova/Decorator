/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;

/**
 *
 * @author test2023
 */
public class DishBinder {
    
    private ArrayList<JCheckBox> boxes;
    private Iterator<JCheckBox> it;
    private String next;

    public DishBinder() {
        boxes = new ArrayList();
    }
    
    public void addBox(JCheckBox box){
        boxes.add(box);
    }
    
    public void initializeIterator(){
        it = boxes.iterator();
    }
    
    public boolean hasNext(){
        while (it.hasNext()){
            JCheckBox n = it.next();
            if (n.isSelected()){
                next = n.getText();
                return true;
            }
        }
        return false;
    }
    
    public String next(){
        return next;
    }
    
    
    
}
