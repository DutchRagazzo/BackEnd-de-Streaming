package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episode extends Serie implements Classificavel {
    private String Nome;
    private int numero;
    private String diretor;
    private int totalVisualizacoes;

    public int getTotalVizualiacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVizualiacoes(int totalVizualiacoes) {
        this.totalVisualizacoes = totalVizualiacoes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
            if (totalVisualizacoes > 100) {
                return 4;
            } else {
                return 2;
            }
        }
    }

