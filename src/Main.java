import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setNome("La la land");
        myMovie.setAnoDeLancamento(2016);
        myMovie.setTempoDeDuracaoMinutos(128);
        myMovie.setIncluidoNoPlano(true);
       myMovie.avaliaTitle(7);
       myMovie.avaliaTitle(10);
       myMovie.avaliaTitle(9);
       myMovie.avaliaTitle(8);
       myMovie.exibeInfoTitle();

        Serie BreakingBad = new Serie();
        BreakingBad.setNome("Breaking Bad");
        BreakingBad.setAnoDeLancamento(2008);
        BreakingBad.setTemporadas(5);
        BreakingBad.setEpisodiosPorTemporada(13);
        BreakingBad.setMinutosPorEpisodio(47);
        BreakingBad.avaliaTitle(10);
        BreakingBad.avaliaTitle(9);
        BreakingBad.obtermediaNotas();
        BreakingBad.exibeInfoTitle();
    }
}



