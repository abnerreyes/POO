/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abner Reyes
 */
class botonApagar {
    //atributos
    boolean IO;
    
    
    public botonApagar(){
        this.IO=false;
    }
    
    public void presionar(){
        this.IO = !this.IO;
    }
   
}
