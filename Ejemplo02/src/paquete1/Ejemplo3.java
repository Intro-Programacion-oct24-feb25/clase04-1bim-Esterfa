/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        String nombreEstudiante;
        
        System.out.println("introduccion");
        nombreAsignatura1 = entrada.nextLine();
        System.out.println("introduccion 2");
        nombreAsignatura2 = entrada.nextLine();
        
        System.out.println("introduccion");
        notaAsignatura1 = entrada.nextDouble();
        System.out.println("Introduccion 2");
        notaAsignatura2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("ester");
        nombreEstudiante = entrada.nextLine();
        
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2:%s\n "
                + "Nota 2: %.2f\nNombre de estudiante: %s\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante);
   
    }
    
}
