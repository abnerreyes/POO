/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class ResizableCircle extends Circle implements iResizable{

    public ResizableCircle(double radius) {
        
        super(radius);
    }

    public ResizableCircle() {
        super();
    }

    @Override
    
    public void resize(int percentage) {
        radius += (100 + percentage)/100;
    }
    
}
