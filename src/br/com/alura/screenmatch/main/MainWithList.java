package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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

        List<Title> WatchedList = new LinkedList<>();
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

        List<String> SearchByArtist = new LinkedList<>();
        SearchByArtist.add("Giancarlo Esposito");
        SearchByArtist.add("Bod Odendirk");
        SearchByArtist.add("Rhea Seehorn");
        SearchByArtist.add("Jonathan Banks");
        SearchByArtist.add("Ryan Gosling");
        SearchByArtist.add("Emma Stone");
        SearchByArtist.add("Jerry Seinfeld");
        SearchByArtist.add("Chris Rock");

        Collections.sort(SearchByArtist);
        System.out.println("Ordenando a lista de artistas alfabeticamente..");
        System.out.println(SearchByArtist);

        Collections.sort(WatchedList);
        System.out.println("Ordenando a lista de titulos assistidos alfabeticamente");
        System.out.println(WatchedList);

        WatchedList.sort(Comparator.comparing(Title::getAnoDeLancamento));//COMPARA E ORDENA POR ANO DE LANÇAMENTO
        System.out.println("Ordenando agora por ano..");
        System.out.println(WatchedList);
    }
}
