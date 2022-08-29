package Parte1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        String Color; 
        double compra_total;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el valor total de la compra: ");
        compra_total= entrada.nextInt();
        System.out.println("Colores de las bolitas: Blanco:B, Verde:V, Amarillo:A, Azul:Az, Rojo:R");
        System.out.println("Ingrese la letra del color sacado para saber el descuento obtenido: ");
        Color= entrada.next();
        System.out.println(bolitas(compra_total,Color));
        
    }
    public static double bolitas(double x, String C){
        String B="B",V="V",A="A",Az="Az",R="R";
        if(C.equals(B)){
            System.out.println("No tiene descuento, el valor de su compra en total es: ");
            return x;
        }
        else if(C.equals(V)){
            x=x-x*0.1;
            System.out.println("Su descuento es de 10%, el valor de su compra en total es: ");    
            return x;
        }
        else if(C.equals(A)){
            x=x-x*0.25;
            System.out.println("Su descuento es de 25%, el valor de su compra en total es: ");
            return x;
        }
        else if(C.equals(Az)){
            x=x-x*0.5;
            System.out.println("Su descuento es de 50%, el valor de su compra en total es: ");
            return x;
        }
        else if(C.equals(R)){
            System.out.println("Su descuento es de 100%, no debe pagar el valor de su compra que era de:"); 
            return x;
        }
        return 0;
    }
}
