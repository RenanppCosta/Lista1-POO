package Exercicios.Exercicio2;

public class Circulo {
    private double raio;
    private final double PI = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return PI * (raio * raio);
    }

    public double calcularPerimetro(){
        return 2 * PI * raio;
    }
}
