package Parte2;


public class PruebaFiguras {
    public static void main(String args[]){
        //Creación de figuras
        Circulo figura1= new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5 = new Rombo (5,8,6);
        Trapecio figura6 = new Trapecio (5,8,6,4);
        
        
        
        
        //Imprimimos calculos hechos a las figuras
        System.out.println("El área del círculo es= " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es= " + figura1.calcularPerimetro());
        
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        
        
        

        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriángulo();
        
        System.out.println("El área del rombo es= " + figura5.calcularArea());
        System.out.println("El perímetro del rombo es= " + figura5.calcularPerimetro());
        
        System.out.println("El área del trapecio es= " + figura6.calcularArea());
        System.out.println("El perímetro del trapecio es= " + figura6.calcularPerimetro());
    }
    
}
