
package com.mycompany.media_numeros;

import java.util.Scanner;

public class Media_numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aqui podras saber el peso promedio de tres personas en kilogramos");
        
        
        
        System.out.println("Ingrese el peso de la primera persona en kg: ");
        double peso_persona1 = scanner. nextDouble();
        System.out.println("Ingrese el peso de la segunda persona en kg: ");
        double peso_persona2 = scanner. nextDouble();
        System.out.println("Ingrese el peso de la tercera persona en kg: ");
        double peso_persona3 = scanner. nextDouble();
        
        double peso_promedio;
        
        peso_promedio = (peso_persona1+peso_persona2+peso_persona3)/3;
        
        System.out.println("El peso promedio de las tres persoonas es: " + peso_promedio);
    }
}
