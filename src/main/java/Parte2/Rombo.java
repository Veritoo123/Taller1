
package Parte2;

public class Rombo {

    int lado;
    int diagonal1;
    int diagonal2;

    public Rombo(int lado, int diagonal1, int diagonal2) {
        this.lado = lado;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    

    double calcularArea() {
        return (diagonal1*diagonal2)/2;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }
}

