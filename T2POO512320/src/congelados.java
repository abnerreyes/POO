/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Abner Reyes
 */
public class congelados extends Producto{

// atributos
private double tempCon;
//metodo
// constructor
    public congelados(String fechaCad, String lote, Double tempCon) {
        super(fechaCad, lote);
        this.tempCon=tempCon;
    }
//
    public double getTemp () 
        { 
        return this.tempCon;  
        }
}
   