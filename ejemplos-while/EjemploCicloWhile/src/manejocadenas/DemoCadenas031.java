/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas031 {
    public static void main(String[] args) {
        String nombre = "Ruben";
        String apellido = "Condoy";
        int edad = 18;
        String cadenaAcumuladora = "Datos Personales\n";
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, nombre);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, apellido);
        
        cadenaAcumuladora = String.format("%s%d\n", cadenaAcumuladora, edad);
       
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
// opcion propia de java para cadena String.format
// cadena acumuladora
// solo un prontf e imprime lo que tiene cadena acumuladora
// d es para entero = int 
// decimales f o d = double
// s para string y para todo