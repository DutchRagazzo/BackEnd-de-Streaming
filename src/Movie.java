public class Movie {
    double mediaNotas;
    double somaNotas;
    int totalNotas;
    String nomeFilme;
    int tempoDeDuracaoMinutos;
    int anoDeLancamento;
    boolean incluidoNoPlano;

    void avaliaFilme(double nota){
        somaNotas += nota;
        totalNotas++;
    }

    double obtermediaNotas(){
        mediaNotas = somaNotas/totalNotas;
        return mediaNotas;
    }

    void exibeInfoFilme(){
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração (em minutos): " + tempoDeDuracaoMinutos);
        System.out.println("Filme incluído no plano: " + incluidoNoPlano);
        System.out.println("Nota do Filme: " + obtermediaNotas());
        System.out.println("Total de avaliações: " + totalNotas);
    }
}
