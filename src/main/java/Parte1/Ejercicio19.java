
import java.util.Scanner;
class EJercicio19 {
    public static void main(String[] args) {
        System.out.println("Ingrese la medida del lado del triangulo equilatero: ");
        Scanner mt= new Scanner(System.in);
        double Lado= mt.nextDouble();
        double Alt =((Math.sqrt(3))*Lado)/2;
        double Ar= Lado*Alt/2;
        System.out.println("El perimetro del triangulo es de "+ 3*Lado+" cm, su altura es de: "+ Alt+ " cm y su area de "+ Ar);
        
        
        }
    }