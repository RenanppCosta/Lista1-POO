package Exercicios.Exercicio6;

public class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("O modelo do carro é: " + modelo + " e o ano é: " + ano);
    }
}
