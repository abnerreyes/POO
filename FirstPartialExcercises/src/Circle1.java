/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class Circle1 {
    
    private String color;
    
    private double radius;
    
    
    public Circle1(){
        radius = 1.0;
        
        color = "red";
    }
    public Circle1(double radius){
        
       
    this.radius = radius;
        this.color = "red"; 
        
       
    }
    public Circle1(String color){
        
        this.radius = 1.0; 
        
        this.color = color;
       
    }
    public Circle1(double radius, String color){
        
        this.radius = radius;
        
        this.color = color;
    }
    

        public double getRadius(){
            
        return this.radius;
    }

             public String getColor() {
                 
        return this.color;
    }
    
             public void setRadius(double radius) {
                 
        this.radius = radius;
    }

    public void setColor(String color) {
        
        this.color = color;
    }

    @Override
    public String toString() { 
        return  "Circle1{" + "radius=" + this.radius + ", color=" + this.color + '}';
    }
    public double getArea(){ 
        return this.radius * this.radius * Math.PI;
    }   
}

