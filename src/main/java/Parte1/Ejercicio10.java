/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ejercicio #10: Pago de la Matricula");
        String nom_estudiante;
        int n_inscripcion, patrimonio, estrato;
        double val_matricula=50000;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        nom_estudiante= entrada.next();
        System.out.println("Ingrese número de Incripción");
        n_inscripcion= entrada.nextInt();
        System.out.println("Ingrese Patrimonio");
        patrimonio= entrada.nextInt();
        System.out.println("Ingrese estrato social");
        estrato= entrada.nextInt();
        
        if((patrimonio>2000000)&&(estrato>3)){
            val_matricula= val_matricula + 0.03 * patrimonio;
        }
        
        System.out.println("El estudiante " + nom_estudiante + " con número de inscripción " + n_inscripcion + " tiene un valor de matricula a pagar de: " + val_matricula );
    }
    
}
