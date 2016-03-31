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
public class Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciamos un producto fresco
    Frescos Carne = new Frescos ("Febrero 17 del 2016", "ABCD");
    Frescos Manzana = new Frescos ("Febrero 18 del 2016", "DAC");
    //Instanciamos un producto Refrigerado
    Refrigerados Yogurt = new Refrigerados ("Abril 30 del 2015", "QWERTY");
    Refrigerados Pescado = new Refrigerados ("Enero 31 del 2016", "WERMS");
    //Instanciamos un producto Congelado por aire
    Aire Cacao = new Aire ("Junio 03 del 2015", "LEE",0.0);
    Aire Croissants = new Aire ("Enero 31 del 2016", "LINO",-5.5);
    //Instanciamos un producto Congelado por agua
    Agua Durazno = new Agua ("Noviembre 20 del 2014", "ZAGS",-15.0);
    Agua Elote = new Agua ("Febrero 25 del 2012", "JARV",-10.25);
    //Instanciamos un producto Congelado por nitrogeno
    nitrogeno Salsa = new nitrogeno ("Noviembre 20 del 2014", "SALCE",-18.78);
    nitrogeno Soya = new nitrogeno ("Agosto 31 del 2015", "HSGG",-40.2);
    
    System.out.println("*Esta es la informacion de los productos frescos* ");
    
        System.out.println("Fecha: " +Carne.getfecha());
        System.out.println("Lote: "  +Carne.getLote());
        System.out.println("Fecha: " +Manzana.getfecha());
        System.out.println("Lote: "  +Manzana.getLote());
        
    System.out.println("*Esta es la informacion de los productos refrigerados* ");
        System.out.println("Fecha: " +Yogurt.getfecha());
        System.out.println("Lote: "  +Yogurt.getLote());
        System.out.println("Fecha: " +Pescado.getfecha());
        System.out.println("Lote: "  +Pescado.getLote());
    
    System.out.println("*Esta es la informacion de los productos congelados por Aire* ");
        System.out.println("Fecha: " +Cacao.getfecha());
        System.out.println("Lote: "  +Cacao.getLote());
        System.out.println("Temperatura en Celcius: "  +Cacao.getTemp());
        System.out.println("Fecha: " +Croissants.getfecha());
        System.out.println("Lote: "  +Croissants.getLote());
        System.out.println("Temperatura en Celcius: "  +Croissants.getTemp());
        
    System.out.println("*Esta es la informacion de los productos congelados por Agua* ");
        System.out.println("Fecha: " +Durazno.getfecha());
        System.out.println("Lote: "  +Durazno.getLote());
        System.out.println("Temperatura en Celcius: "  +Durazno.getTemp());
        System.out.println("Fecha: " +Elote.getfecha());
        System.out.println("Lote: "  +Elote.getLote());
        System.out.println("Temperatura en Celcius: "  +Elote.getTemp());
        
     System.out.println("*Esta es la informacion de los productos congelados por Nitrogeno* ");
        System.out.println("Fecha: " +Salsa.getfecha());
        System.out.println("Lote: "  +Salsa.getLote());
        System.out.println("Temperatura en Celcius: "  +Salsa.getTemp());
        System.out.println("Fecha: " +Soya.getfecha());
        System.out.println("Lote: "  +Soya.getLote());
        System.out.println("Temperatura en Celcius: "  +Soya.getTemp());
        
        
  
    }

  
}
