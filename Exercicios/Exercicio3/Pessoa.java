package Exercicios.Exercicio3;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }
}
