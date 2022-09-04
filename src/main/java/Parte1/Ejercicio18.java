package Parte1;

import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        int ht,vht;
        String nombre,codigo;
        double perc,Salbr,Sal,ret;
        Scanner entrada = new Scanner(System.in);
        Scanner nomb = new Scanner(System.in);
        Scanner cod = new Scanner(System.in);
        System.out.println("ingrese su código de empleado: ");
        codigo=cod.next();
        System.out.println("ingrese su nombre: ");
        nombre=  nomb.nextLine();
        System.out.println("ingrese el número de horas trabajadas en el mes: ");
        ht=entrada.nextInt();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        vht= entrada.nextInt();
        System.out.println("ingrese el porcentaje de retención en fuente: ");
        perc=(entrada.nextDouble())/100;
        Salbr=ht*vht;
        ret= Salbr*perc;
        Sal=Salbr-ret;
        System.out.println("El empleado "+nombre+" con código "+codigo+" tiene un salario bruto de "+Salbr);
        System.out.println("y salario neto de "+Sal);
        
     
    }

    
}
