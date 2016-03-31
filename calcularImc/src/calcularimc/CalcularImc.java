/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

/**
 *
 * @author Abner Retes
 */

import javax.swing.JOptionPane;
class CalcularImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String a, p;
   String nombre = null;
   double altura = 0;
   double peso = 0;

   try {
   nombre = JOptionPane.showInputDialog(null, "Teclea tu Nombre",
  "IMC", JOptionPane.PLAIN_MESSAGE);
   a = JOptionPane.showInputDialog(null,
   "Teclea tu altura", "IMC",
   JOptionPane.PLAIN_MESSAGE);
   p = JOptionPane.showInputDialog(null,
  "Teclea tu peso", "IMC",
  JOptionPane.PLAIN_MESSAGE);

  altura = Double.parseDouble(a);
  peso = Double.parseDouble(p);

  } catch (Exception e) {
  JOptionPane.showMessageDialog(null, "Intente otra vez", "Datos incorrectos",
  JOptionPane.ERROR_MESSAGE);
 }
datosPersona imc = new datosPersona(altura, peso, nombre);
 imc.datosPersona();
      }
}