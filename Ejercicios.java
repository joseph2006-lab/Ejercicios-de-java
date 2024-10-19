
package com.mycompany.ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        double sueldo_neto = 0;
        double sueldo_total = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingres el tipo de empleado: ");
        
        String tipo_empleado = scanner.nextLine();
     
        switch(tipo_empleado){
            case "repositor":sueldo_neto = 15890.00;
            break;
            case "supervisor" :sueldo_neto = 35560.20;
            break;
        
        }
        switch(tipo_empleado){
            case "repositor":sueldo_total = 15890.00 + (15890.00*0.10);
            break;
            case "cajero" :sueldo_total = 25630.89;
            break;
            case "supervisor" :sueldo_total = 35560.20 - (35560.20*0.11);
            break;
         
        }

        
        System.out.println("Si usted es ," + tipo_empleado + " , su sueldo neto sera de : " + sueldo_neto +" .Luego de bonos y comisiones su sueldo sera de: " + sueldo_total);
        
    }
}
