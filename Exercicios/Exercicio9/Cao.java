package Exercicios.Exercicio9;

public class Cao {
    private String nome;
    private String raca;

    public Cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au au au au au au!!");
    }

    public void comer(){
        System.out.println(nome + " esta comendo.");
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }
}
