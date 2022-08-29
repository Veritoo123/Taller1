package Parte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Ejercicio #11: El numero mayor de todos");
        int num;
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner entrada= new Scanner(System.in);
        for (int x=0; x<3; x++){
            System.out.println("Ingrese un numero");
            num= entrada.nextInt();
            numeros.add(num);
        }
        Collections.sort(numeros);
        int lastIdx = numeros.size() - 1;
        int maxNum = numeros.get(lastIdx);
        System.out.println("El número mayor de los elementos ingresados es: " + maxNum);
    }  
}
