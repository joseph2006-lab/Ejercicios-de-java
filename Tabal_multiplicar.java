
package com.mycompany.tabal_multiplicar;

import java.util.Scanner;


public class Tabal_multiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la tabal de multiplicar que desea concer:" );
        int numero_usuario = scanner.nextInt();
        for(int i=0;i<=10;i++){
            int resultado = numero_usuario*i;
            System.out.println("El resultado de multiplicar : "+numero_usuario+" X "+i+" = "+ resultado);
        }
    }
}
