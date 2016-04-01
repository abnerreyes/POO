package pooact4composicion;
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abner Reyes
 */
public class Telefono {
  // atributos
    
   botonApagar EA= new botonApagar();
    // arreglo tecla
    Tecla[][] Teclado=new Tecla[5][3];
    public static Contacto[] lc=new Contacto[100];
    
    // m e t o d o s
    private static int buscEspacio(){
        int t=1000;
        for (int i=0; i<100; i++){
            if(lc[i]==null){
                t=i;
                i=101;
            }
        }
        return t;
    }
    public static  String newContacto(String nombre,String correo, String telefono){ 
        Contacto temp= new Contacto(nombre, correo, telefono);
        if (buscEspacio()==1000){
            return "Memoria llena";
        } else { 
        lc[buscEspacio()]=temp;
        return "Contacto guardado";
        }
    }
   
    protected static Contacto buscar(int r){
        if (lc[r]!=null){
            //s e - i n s t a n c i a - a p u n t a d o r 
            Contacto temp; 
            temp= lc[r];
            return temp;
        } else { 
            return null;
        }
    }
    protected static String muestraLista(){
        String l="";
        for (int i=0; i<100; i++){
            if (lc[i]!=null){
            Contacto temp;
            temp= lc[i];
            l= l + "\n " + temp.correo + " " + temp.nombre + " " + temp.telefono;
            }
        }
        return l;
    }
    
    public void setTeclado(){
        
        int digito=0;
        String z;
        for (int i = 0; i < (Teclado.length -1); i++) {
            for (int j = 0; j < Teclado[0].length; j++) {
                // ciclo for para el temporal
                Tecla t=new Tecla(); 
                digito++;
                z=Integer.toString(digito);
                t.setDigito(z.charAt(0));
                Teclado[i][j]=t;
            }
        }
        // Declarando temp para obtener una var independiente
        Tecla t1=new Tecla(); 
            Tecla t2=new Tecla();
            Tecla t3=new Tecla();
            Tecla t4=new Tecla();
            Tecla t5=new Tecla();
            Tecla t6=new Tecla();
        
        
        t1.setDigito('*');
         Teclado[3][0]=t1;
        t2.setDigito('0');
          Teclado[3][1]=t2;
        t3.setDigito('#');
         Teclado[3][2]=t3;
         t4.setDigito('A');
            Teclado[4][0]=t4;
        t5.setDigito('B');
            Teclado[4][1]=t5;
        t6.setDigito('C');
            Teclado[4][2]=t6;
        
        
        }

}