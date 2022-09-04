
package Parte2;

public class Trapecio {

    int lado;
    int baseMayor;
    int baseMenor;
    int altura;

    public Trapecio(int lado, int baseMayor, int baseMenor, int altura) {
        this.lado = lado;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    
    

    double calcularArea() {
        return ((baseMayor+baseMenor) / 2)*altura;
    }

    double calcularPerimetro() {
        return (baseMayor + baseMenor + (2 * lado));
    }
}