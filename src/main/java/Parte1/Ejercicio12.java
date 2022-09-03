import java.util.Scanner;
class EJercicio12 {
    public static void main(String[] args) {
        String Nom;
        Double Nht,Vhn,Het,Hee8,Sal;
        Het=0.0;
        Hee8=0.0;
        Sal=0.0;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        Nom= entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        Nht= entrada.nextDouble();
        System.out.println("Ingrese el pago por hora de trabajo: ");
        Vhn= entrada.nextDouble();
        
        if (Nht>40){
            Het=Nht-40;
            if (Het>8){
                Hee8=Het-8;
                Sal=40*Vhn+16*Vhn+Hee8*3*Vhn;
            }else {
                Sal=(40*Vhn+Het*2*Vhn);
                }
        }else {
            Sal=Nht*Vhn;
        }
        System.out.println("El trabajador "+Nom+" devengo: $"+Sal);
        
        }
    }