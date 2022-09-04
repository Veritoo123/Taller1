package Parte1;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        double la;
        double l1,l2,l3;
        double sp,p,ar;
        ArrayList<Double> lados = new ArrayList<>();
        Scanner entrada= new Scanner(System.in);
        for (int x=0; x<3; x++){
            System.out.println("Ingrese el lado "+(x+1)+": ");
            la= entrada.nextDouble();
            lados.add(la);
        }
        l1=lados.get(0);
        l2=lados.get(1);
        l3=lados.get(2);
        p=(l1+l2+l3);
        System.out.println(" El perimetro del triangulo es de "+p);
        sp=p/2;
        System.out.println(" El semiperimetro es de "+sp);
        ar=Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
        System.out.println(" El area es de "+ ar);
        
        
        }
    }