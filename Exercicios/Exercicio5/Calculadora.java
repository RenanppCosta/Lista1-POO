package Exercicios.Exercicio5;

public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double adicao(){
        return numero1 + numero2;
    }

    public double subtracao(){
        return numero1 - numero2;
    }

    public double multiplicacao(){
        return numero1 * numero2;
    }

    public double divisao(){
        if(numero2 == 0){
            System.out.println("Erro ao dividir por 0.");
            return 0;
        }else{
            return numero1 / numero2;
        }
       
    }
}
