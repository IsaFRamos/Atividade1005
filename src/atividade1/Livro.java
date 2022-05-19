package atividade1;

public class Livro {
    private int anoLancamento;
    private String autor;
    private String tituloLivro;
    
    public Livro(int anoLancamento, String autor, String tituloLivro) {
        this.anoLancamento = anoLancamento;
        this.autor = autor;
        this.tituloLivro = tituloLivro;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    
}
