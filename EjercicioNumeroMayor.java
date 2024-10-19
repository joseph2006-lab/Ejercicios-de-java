

package com.mycompany.ejercicionumeromayor;

import java.util.Scanner;


public class EjercicioNumeroMayor {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int primer_numero = scanner1.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int segundo_numero = scanner2.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int tercer_numero = scanner3.nextInt();
        if(primer_numero>segundo_numero && primer_numero>tercer_numero){
            System.out.println("El numero mayor es: " + primer_numero);
        }
        else if(segundo_numero > primer_numero && segundo_numero>tercer_numero){
            System.out.println("El numero mayor es: " + segundo_numero);
        }
        else{
            System.out.println("El numero mayor es: "+tercer_numero);
        }
        
    }
}
