package Exercicios.Exercicio4;

public class Livro {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInformacoes(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Nome do autor: "  + autor);
    }
}
