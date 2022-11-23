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
public class Ejemplo06 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double suma_total = 0;
        double calificacion;
        boolean bandera = true;

        System.out.println("Ingrese las notas de los estudiantes de su materia");
        // true 
        // while (bandera) 
        while (bandera == true){
            System.out.println("Ingrese calificación");
            calificacion = entrada.nextDouble();

            if (calificacion > 20) { // control de valores
                calificacion = 20;
            }
            suma_total = suma_total + calificacion;

            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor -1 para salir del ciclo");
            int temporal = entrada.nextInt();

            if (temporal == -1) {
                bandera = false;
            }
        }

        System.out.printf("Suma de calificaciones es %.2f\n", suma_total);

    }
}
// estamos haciedo un control, en el que si el usuario ingresa un numero 
// mayor a 20 entonces el if dice que 20 sera igual a 20 
// lo deja en 20 y el resultado es igual al valor sumado 20 + 20 = 40 GG.