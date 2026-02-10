package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episode extends Serie implements Classificavel {
    private int numero;
    private int totalVisualizacoes;
    private int temporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public Episode(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTotalVizualiacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVizualiacoes(int totalVizualiacoes) {
        this.totalVisualizacoes = totalVizualiacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
            if (totalVisualizacoes > 100) {
                return 4;
            } else {
                return 2;
            }
        }
    @Override
    public String toString() {
        return "Episódio - "+this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
    }

