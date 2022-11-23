/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo10 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 12;
        int contador = 1;
        int operacion;
        int tabla;
        String cadena = ""; // cadena acumulador
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        
        
        cadena = String.format("%sTabla de multiplicar\n", cadena);
        
        while (contador <= 12){
            operacion = tabla * contador;
            
            cadena = String.format("%s%d*%d= %d\n\n", // acumuladora
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena);
        
    }
}
