

package com.mycompany.operadores_ternarios;


import java.util.Scanner;

public class Operadores_ternarios {

    public static void main(String[] args) {
        double promedio;
        String condicion;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingres su nota final: ");
        promedio = scanner.nextDouble();
        condicion = promedio>=6? "Aprobado":"Desaprobado";
        System.out.println("Al final del curso usted : "+condicion);
    }
}
