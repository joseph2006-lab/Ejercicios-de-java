

package com.mycompany.ejercicio_matrices;
import java.util.Scanner;

public class Ejercicio_matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double matriz[][] = new double[4][4] ;
        double suma= 0.0;
        final int NUMERO_NOTAS=3;
        for(int f=0;f<4;f++){
            for(int c=0;c<3;c++){
                System.out.println("Ingrese la nota del alumno n°"+f+" : ");
                System.out.println("Nota n:"+c);
                matriz[f][c]=scanner.nextDouble();              
                suma = suma+matriz[f][c];
            }
            matriz[f][3]=suma/NUMERO_NOTAS;
            suma = 0.0;
        }
        for(int f=0;f<4;f++){
            System.out.println("Las notas del alumno n "+f);
            for(int c=0;c<3;c++){
                System.out.println("La nota es: "+" "+matriz[f][c]);
                System.out.println("-----------------");
            }
            System.out.println("El promedio es: "+matriz[f][3]);
        }
        
    }

}
   