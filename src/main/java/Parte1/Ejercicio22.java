
package Parte1;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        String nombre;
        double salarioBasico;
        int horasTrabajadas;
        double salarioTotal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su salario basico por hora: ");
        salarioBasico = entrada.nextDouble();
        System.out.println("Ingrese las horas trabajadas en este mes: ");
        horasTrabajadas = entrada.nextInt();
        salarioTotal = salarioBasico * horasTrabajadas;
        if (salarioTotal > 450000) {
            System.out.println("La persona " + nombre + "tuvo ingresos de $ " + salarioTotal + "este mes");
        } else if (salarioTotal <= 450000) {
            System.out.println("Eres el trabajador" + nombre);
        }

    }

}