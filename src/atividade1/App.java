package atividade1;

public class App {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro(2000, "Receita Bolo de Milho", "Isabele Ramos");

        System.out.println("Título: " + livro1.getTituloLivro());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano: " + livro1.getAnoLancamento());
    }
}

