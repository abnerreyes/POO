/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      MyRectangle rectangle = new MyRectangle(1,2,3,4); 
      
      // Desplegando pantallas
      System.out.println(rectangle);  
      
      System.out.println("Area of the rectangle is:  " + rectangle.getArea());  
      
      System.out.println("Perimeter of the rectangle is:  " + rectangle.getPerimeter());  
    }
}
