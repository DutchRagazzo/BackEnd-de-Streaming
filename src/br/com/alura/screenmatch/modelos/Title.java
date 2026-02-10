package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Title {
    private double mediaNotas;
    private double somaNotas; //encapsulando a soma de notas e o total de notas para que ninguem altere a avaliação dos filmes e a média.
    private int totalNotas;
    private String nome;
    private int tempoDeDuracaoMinutos;
    private int anoDeLancamento;
    private boolean incluidoNoPlano; // encapsulando o verificador de pl
    private String diretor;

    public Title( String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getTotalNotas() {
        return totalNotas;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoDeDuracaoMinutos() {
        return tempoDeDuracaoMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setTempoDeDuracaoMinutos(int tempoDeDuracaoMinutos) {
        this.tempoDeDuracaoMinutos = tempoDeDuracaoMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void avaliaTitle(double nota){
        somaNotas += nota;
        totalNotas++;
    }

    public double obtermediaNotas(){
        mediaNotas = somaNotas/totalNotas;
        return mediaNotas;
    }
    public void temporiza(){
        int minutos = this.getTempoDeDuracaoMinutos();
        double horas = Math.round(minutos / 60.0);
        System.out.println("Tempo para maratonar (em horas): " + horas);
        System.out.println("Tempo para maratonar (em minutos): " + minutos);
    }
    public void exibeInfoTitle(){
        System.out.println("Nome do Título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        this.temporiza();
        System.out.println("Título incluído no plano: " + incluidoNoPlano);
        System.out.println("Nota do Título: " + obtermediaNotas());
        System.out.println("Total de avaliações: " + totalNotas);
    }
}
