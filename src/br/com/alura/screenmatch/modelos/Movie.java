package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;
public class Movie extends Title implements Classificavel {
private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)obtermediaNotas();
    }
}
