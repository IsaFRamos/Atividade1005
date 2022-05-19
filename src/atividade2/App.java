package atividade2;

public class App {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Isabele Ramos", "******@email.com", 'F');

        Livro livro1 = new Livro("Chernon", autor1, 30);

        System.out.println("Dados do livro 1: ");
        System.out.println("Nome Livro: " + livro1.getNome());
        System.out.println("Nome Autor: " + livro1.getAutor().getNome());
        System.out.println("Preço: " + livro1.getPreco());

        
        Livro livro2 = new Livro("Boy", autor1, 55.90, 100);

        System.out.println("Dados do livro 2: ");
        System.out.println("Nome Livro: " + livro2.getNome());
        System.out.println("Nome Autor: " + livro2.getAutor().getNome());
        System.out.println("Preço: " + livro2.getPreco());
        System.out.println("Quantidade disponível: " + livro2.getQuantidade());
    }
}
