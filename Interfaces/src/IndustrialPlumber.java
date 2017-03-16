/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lap Toshiba
 */
public class IndustrialPlumber extends Human implements iPlumber{

    public IndustrialPlumber(String name) {
        
        super(name);
    }

    @Override
    
    public String unplugDrain() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
