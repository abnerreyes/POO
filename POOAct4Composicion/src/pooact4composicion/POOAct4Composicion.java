package pooact4composicion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Abner Reyes
 */
public class POOAct4Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // TODO code application logic here
Scanner entrada= new Scanner(System.in);
        Telefono starTac=new Telefono(); 
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac esta " + starTac.EA.IO);
        
        System.out.println("Teclado del teléfono: ");
        starTac.setTeclado();
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");

System.out.println(Telefono.newContacto("Abner", "abner.reyes@itesm.mx", "8339855"));
        System.out.println(Telefono.newContacto("Carlos", "carlos.vargas@itesm.mx", "8336581"));
        System.out.println(Telefono.newContacto("Vela", "jesus.vela@itesm.mx", "8334124"));
        System.out.println(Telefono.muestraLista());
       
        
        System.out.println(" \n¿Que numero de contacto desea buscar?");
        int r=entrada.nextInt();
        if (Telefono.buscar(r)==null){
            System.out.println("No se encontro dicho contacto");
        } else { 
           System.out.println(Telefono.buscar(r).nombre + " " + Telefono.buscar(r).correo + " " + Telefono.buscar(r).telefono);
        }
        
        System.out.print("Contacto número 0: ");
        System.out.println(Telefono.buscar(0).nombre + " " + Telefono.buscar(0).correo + " " + Telefono.buscar(0).telefono );
        
        
        
        
    }
    }
}

