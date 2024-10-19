

package com.mycompany.arrays2;
import java.util.Arrays;
public class Arrays2 {

    public static void main(String[] args) {
        int numero[]={1,2,3,4,5,6,7,8,9};//buscar
        int buscar= 5;
        boolean centinela = true;
        for(int indice=0;indice<numero.length;indice++){
            if(numero[indice]==buscar){
                System.out.println("El numero "+ buscar+" se encuentra en el indice: "+indice);
                centinela = false;
                break;
            }
            
        }
        int numeros[]={2,7,4,9,0,3,1,5};//ordenar
        Arrays.sort(numeros);
        System.out.println("El arrays ordenado es: "+ Arrays.toString(numeros));
        
        int invertir[]={1,2,3,4,5,6,7,8,9};//invertir
        for(int i =0;i<invertir.length/2;i++){
            int invertida = invertir[i];
            invertir[i] = invertir[invertir.length-1-i];
            invertir[invertir.length-1-i]= invertida;
        }
        System.out.println("El arrays invertida es: "+ Arrays.toString(invertir));
        
        int pares[] = {1,2,3,4,5,67,8,9,89};
        for(int i =0;i<pares.length;i++){
            if(pares[i]%2==0){
                System.out.println("Los numeros pares son: "+pares[i]);
            }
        }
    } 
}
