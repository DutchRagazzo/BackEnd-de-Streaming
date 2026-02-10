package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;
public class Movie extends Title implements Classificavel {


    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int)obtermediaNotas();
    }

    @Override
    public String toString() {
        return "Filme - "+this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
