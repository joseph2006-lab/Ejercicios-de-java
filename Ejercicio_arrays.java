
package com.mycompany.ejercicio_arrays;

import java.util.Scanner;

public class Ejercicio_arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double [5];
        double promedio = 0.0;
        int CANTIDAD_NOTAS = 5;
        for(int indice=0;indice<notas.length;indice++){
            System.out.println("Ingrese las nota numero:"+indice);
            notas[indice] = scanner.nextDouble();
            promedio = promedio+notas[indice]/CANTIDAD_NOTAS;
        
        }
        for(int indice=0;indice<notas.length;indice++){
            System.out.println("La nota que corresponde al indice "+indice+" es: "+notas[indice]);
            System.out.println("------------------------------------------");
        
        }
        System.out.println("El promedio de las notas es: "+promedio);
        
        
    }
}
