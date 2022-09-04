
package Parte1;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        double a,b,c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la primer esfera: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el peso de la segunda esfera: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el peso de la tercer esfera: ");
        c = entrada.nextDouble();
        
        if ((a>c)&&(a>b)) {
            System.out.println("La primer esfera es la que tiene mayor peso");
        }
        else if ((b>c)&&(b>a)) {
            System.out.println("La segunda esfera es la que tiene mayor peso");
        }
        else if ((c>a)&&(c>b)) {
            System.out.println("La tercer esfera es la que tiene mayor peso");
        }
        else {
            System.out.println("Hay esferas con el mismo peso, tienes un error");
        }
    }
    
}