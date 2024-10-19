

package com.mycompany.ejercicio_vector;
import java.util.Scanner;
public class Ejercicio_vector {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int cont=0;
        int vector []= new int [15];
        for(int i=0;i<vector.length;i++){
            System.out.println("Ingrese su numero: ");
            vector[i] = scanner.nextInt();           
            if(vector[i]==3){
                cont +=1;              
            }            
        }
       for (int i=0;i<vector.length;i++){
           System.out.println("El valor que se encuenta en el incide: "+i+" es:"+vector[i]);
           System.out.println("---------------------------------------------------");
       } 
        System.out.println("En su conjunto de numeros hay : "+cont+" numeros 3");      
    }
}
