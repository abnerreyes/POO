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
public class Producto 
{
    private String fechaCad;
    private String lote;
    
    //Constructor
    public Producto (String fechaCad, String lote) 
        {
        this.fechaCad = fechaCad;
        this.lote = lote;
        }

    //Métodos
    public String getfecha () 
        { 
        return this.fechaCad;  
        }
    public String getLote () 
        { 
        return this.lote;  
        }
} 
