/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Abner Reyes
 */
public class datosPersona {
//atributos
    private double altura;
    private double peso;
    private String nombre;

/*Obtiene los datos de la persona que son su nombre,peso y altura
    
    */

   
     public datosPersona(double altura, double peso, String nombre) {
 
        if (altura > 0 && peso > 0) {
            this.altura = altura;
            this.peso = peso;
            this.nombre = nombre;
        } else {
            this.altura = 0;
            this.peso = 0;
            this.nombre = " ";
        }
    }
    //metodos 
     public String getNombre() {
   return nombre;
}

public double getAltura() {
   return altura;
}

public double getPeso() {
   return peso;
}
    /*Calcula el indice de masa corporal

*/
public float calcularIMC() {
   if (getAltura() > 0) {
      return (float) (peso / (Math.pow(altura, 2)));
   } else {
      return 0;
   }
}
/*En este metodo se muestra el estado de salud de la persona

*/
public String salud(){
   double valor = calcularIMC();
   if (valor < 18.5 ){ 
      return "Flaco/a";
   } else if (valor >= 18.5 && valor <25) { 
      return "Persona con IMC promedio";
   } else if (valor >=25 && valor <30) {
      return "Sobrepeso";
   } else {
      return "Obeso/a";
   }
}
/* Despliega Informacion la informacion requerida para calcular el IMC del usuario

*/
public void datosPersona() {

   String imc = String.format(
      "Persona : %s\nPeso : %.2f Kg\nAltura : %.2f m\n\n"
          + "IMC : %.2f\nSalud : %s\n\n", getNombre(),
             getAltura(), getPeso(), calcularIMC(), salud());

   if (calcularIMC() > 0) {
      JOptionPane.showMessageDialog(null, imc, "IMC", JOptionPane.INFORMATION_MESSAGE);
   }
}
}
