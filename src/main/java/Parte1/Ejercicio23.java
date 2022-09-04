package Parte1;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        double a, b, c, potencia, r1, r2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero que acompaña la varible x a el cuadrado: ");
        a = entrada.nextDouble();

        System.out.println("Ingrese el numero que acompaña la variable x: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el numero que acompaña la constante: ");
        c = entrada.nextDouble();

        potencia = Math.pow(b, 2) - (4 * a * c);
        r1 = (-b - Math.sqrt(potencia) / 2 * a);
        r2 = (-b + Math.sqrt(potencia) / 2 * a);

        System.out.println("Las soluciones de la ecuacion son: " + r1 + " y " + r2);

    }
}
