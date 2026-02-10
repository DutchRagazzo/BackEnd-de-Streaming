package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Title implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa = false;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getTempoDeDuracaoMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return (int)obtermediaNotas();//futuramente eu implemento algo legal
    }

    @Override
    public String toString() {
        return "Série - "+this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
