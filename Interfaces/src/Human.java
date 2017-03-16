/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class Human {
    
    private String name;

    public Human(String name) {
        
        this.name = name;
    }

    @Override
    
    public String toString() {
        return "human{" + "Name=" + name + '}';
    }
    
}
