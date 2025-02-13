package Exercicios.Exercicio10;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String verificarTipo(){
        if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            if(lado1 == lado2 && lado2 == lado3){
                return "Triângulo Equilátero";
            }else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                return "Triângulo Escaleno";
            }else{
                return "Triângulo Isósceles";
            }
        }else{
            return "Isso não é um triângulo.";
        }
    }
}
