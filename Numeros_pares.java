

package com.mycompany.numeros_pares;


public class Numeros_pares {

    public static void main(String[] args) {
        int cont = 0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                cont +=1;
            }
        }
        System.out.println("La cantidad de numeros pares es de : " + cont);
    }
}
