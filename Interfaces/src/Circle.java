/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class Circle implements iGeometricObject{
    
    protected double radius = 1.0;

    public Circle(double radius) {
        
        this.radius = radius;
    }
    public Circle (){
        
        radius = 1.0;
    }
    @Override
    public double getPerimeter() {
        
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        
        return radius*radius*Math.PI;
    }
    
}