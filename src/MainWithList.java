import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args){
        Movie myMovie = new Movie("La la land", 2016);
        myMovie.setTempoDeDuracaoMinutos(128);
        myMovie.setIncluidoNoPlano(true);
        myMovie.avaliaTitle(10);

        Movie movieBee = new Movie("Bee Movie", 2007);
        movieBee.setTempoDeDuracaoMinutos(91);
        movieBee.setIncluidoNoPlano(true);
        movieBee.avaliaTitle(8);

        Serie BreakingBad = new Serie("Breaking Bad",2008);
        BreakingBad.setTemporadas(5);
        BreakingBad.setEpisodiosPorTemporada(13);
        BreakingBad.setMinutosPorEpisodio(47);
        BreakingBad.avaliaTitle(10);

        ArrayList<Title> WatchedList = new ArrayList<>();
        WatchedList.add(myMovie);
        WatchedList.add(movieBee);
        WatchedList.add(BreakingBad);
        WatchedList.forEach(Title -> System.out.println("FILMAÇO"));

        for (Title title: WatchedList) {

            System.out.println(title.getNome());
            switch (title) { // verifica se o titulo na lista É filme, serie ou episodio e ate o que n é
                case Movie movie -> System.out.println("Classificação: " + movie.getClassificacao());
                case Episode episode -> System.out.println("Classificação: " + episode.getClassificacao());
                case Serie serie -> System.out.println("Classificação: " + serie.getClassificacao());
                default -> System.out.println("não é possivel obter a classificação de: " + title.getNome());
            } //IDE recomendou usar switch case, eu não sabia que a sintaxe com expressão lambda era assim, mas aprendi agrKKK.

        }
    }
}
