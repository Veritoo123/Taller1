package Parte1;


public class Ejercicio15 {
     public static void main(String[] args) {
         double esfera_A= 400.5,esfera_B=20.5,esfera_C=20.5,esfera_D=20.5;
         System.out.println(compare(esfera_A,esfera_B,esfera_C,esfera_D));
     }
     
     public static double compare(double x, double y, double z, double w) {
         if (x!=w && y!=w && z!=w) {
             double mayor=Math.max(w, x);
             if(mayor==w ){
                 System.out.println("La esfera D es mayor con un peso de"); 
             }else {
                 System.out.println("La esfera D es menor con un peso de");
             }
             return w;
        }
        else if(x!=z && y!=z && w!=z) {
            double mayor=Math.max(z, x);
             if(mayor==z ){
                 System.out.println("La esfera C es mayor con un peso de");
             }else {
                 System.out.println("La esfera C es menor con un peso de");
             }
             return z;
        }
        else if(x!=y && z!=y && w!=y) {
            double mayor=Math.max(y, x);
             if(mayor==y ){
                 System.out.println("La esfera B es mayor con un peso de");
             }else {
                 System.out.println("La esfera B es menor con un peso de");
             }
             return y;
        }
        else if(y!=x && z!=x && w!=x) {
            double mayor=Math.max(y, x);
             if(mayor==x ){
                 System.out.println("La esfera A es mayor con un peso de");
             }else {
                 System.out.println("La esfera A es menor con un peso de");
             }
             return x;
        }
         return 0;
     }
}
