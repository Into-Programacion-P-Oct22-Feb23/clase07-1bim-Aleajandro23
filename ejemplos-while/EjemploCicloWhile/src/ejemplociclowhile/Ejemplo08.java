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
public class Ejemplo08 {

   
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 0;
        double suma_total = 0;
        double promedio_final;
        double calificacion;
        boolean bandera = true;

        System.out.println("Ingrese las notas de los estudiantes de su materia");
        // while (bandera) {
           while (bandera == true) { // true = true (verdadero)
            System.out.println("Ingrese calificación:"); // por teclado
            calificacion = entrada.nextDouble();  // el leer
            suma_total = suma_total + calificacion; // = 0 + calificacion
            contador = contador + 1;        // = 0 + 1 = 1

            entrada.nextLine(); // Ojo usamos el limpiador del scanner (buffer)

            // proceso para salir del ciclo.
            System.out.println("Ingrese si para salir"); // escribe
            String temporal = entrada.nextLine();   // lee
            if (temporal.equals("si")) {  // si es igual a si entonces
                bandera = false;            // cambia bander a falso y
            }
        }
        promedio_final = suma_total / contador;
        System.out.printf("El promedio final es %.2f\n", promedio_final);

    }
}
// en el ejemplo 301 el limite es el proceso de la operacion y en la
// 8 el contador divide el promedio