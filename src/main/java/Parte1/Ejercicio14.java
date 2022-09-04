/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
    int ventasDepartamento1,ventasDepartamento2,ventasDepartamento3, totalVentas;
    double salarioVendedores, porcentajeVentas, salario1, salario2, salario3;
    Scanner entrada = new Scanner(System.in); 
    System.out.println("Ingrese las ventas del departamento 1: ");
        ventasDepartamento1 = entrada.nextInt();
    System.out.println("Ingrese las ventas del departamento 2: ");
        ventasDepartamento2 = entrada.nextInt();
    System.out.println("Ingrese las ventas del departamento 3: ");
        ventasDepartamento3 = entrada.nextInt();
    System.out.println("Ingrese el salario de los vendedores: ");
        salarioVendedores = entrada.nextDouble();
        
    totalVentas = ventasDepartamento1+ventasDepartamento2+ventasDepartamento3;
    porcentajeVentas = totalVentas* 0.33;

    if (ventasDepartamento1>porcentajeVentas){
        salario1 = salarioVendedores+salarioVendedores*0.2;
        System.out.println("El salario de los vendedores del departamento 1 es: " + salario1);
    }
    else{
       System.out.println("El salario de los vendedores del departamento 1 es: " + salarioVendedores); 
    }
    if (ventasDepartamento2>porcentajeVentas){
        salario2 = salarioVendedores+salarioVendedores*0.2;
        System.out.println("El salario de los vendedores del departamento 2 es: " + salario2);
    }
    else{
       System.out.println("El salario de los vendedores del departamento 2 es: " + salarioVendedores); 
    }
    if (ventasDepartamento3>porcentajeVentas){
        salario3 = salarioVendedores+salarioVendedores*0.2;
        System.out.println("El salario de los vendedores del departamento 3 es: " + salario3);
    }
    else{
       System.out.println("El salario de los vendedores del departamento 3 es: " + salarioVendedores); 
    }
    }
    
}