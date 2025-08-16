public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.nomeFilme = "La la land";
        myMovie.anoDeLancamento = 2016;
        myMovie.tempoDeDuracaoMinutos = 128;
        myMovie.incluidoNoPlano = true;

        myMovie.avaliaFilme(7);
        myMovie.avaliaFilme(10);
        myMovie.avaliaFilme(9);
        myMovie.avaliaFilme(8);

        myMovie.exibeInfoFilme();
        myMovie.obtermediaNotas();
    }
}



