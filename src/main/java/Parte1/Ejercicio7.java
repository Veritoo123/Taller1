package Parte1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor de A: ");
        Scanner vA= new Scanner(System.in);
        double A= vA.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        Scanner vB= new Scanner(System.in);
        double B= vB.nextDouble();
        
        if(A>B){
            System.out.println("A es mayor que B");
        }
        else if(A==B){
            System.out.println("A es igual a B");
        }
        else {
            System.out.println("A es menor que B");
        }
        }
    }

