
package com.mycompany.calculadora;

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingrese los numeros a operar: ");
        int numero_1 = scanner1.nextInt();
        int numero_2 = scanner2.nextInt();
        System.out.println("¿Que operacion desea realizar?=");
        String operacion = scanner3.nextLine();
        int resultado = 0;
        double resultado_division = 0.0;
        
        switch(operacion){
            case "suma" : resultado = numero_1 + numero_2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "resta" : resultado = numero_1-numero_2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "multiplicacion" : resultado  = numero_1 * numero_2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            case "division" : if(numero_2 ==0){
                System.out.println("La division por 0 es indeterminada");
            } 
            else{
                resultado = numero_1/numero_2;
                System.out.println("El resultado de la division es "+ resultado_division);
            }
        }
        
    }
}
