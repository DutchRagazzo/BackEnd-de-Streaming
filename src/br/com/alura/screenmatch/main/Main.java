package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("La la land", 2016);
        //myMovie.setNome("La la land"); não precisa já que aprendi a usar construtores
        //myMovie.setAnoDeLancamento(2016); não precisa já que aprendi a usar construtores
        myMovie.setTempoDeDuracaoMinutos(128);
        myMovie.setIncluidoNoPlano(true);
        myMovie.avaliaTitle(7);
        myMovie.avaliaTitle(10);
        myMovie.avaliaTitle(9);
        myMovie.avaliaTitle(8);
        myMovie.exibeInfoTitle();

        Serie BreakingBad = new Serie("Breaking Bad",2008);
        //BreakingBad.setNome("Breaking Bad"); não precisa já que aprendi a usar construtores
        //BreakingBad.setAnoDeLancamento(2008); não precisa já que aprendi a usar construtores
        BreakingBad.setTemporadas(5);
        BreakingBad.setEpisodiosPorTemporada(13);
        BreakingBad.setMinutosPorEpisodio(47);
        BreakingBad.avaliaTitle(10);
        BreakingBad.avaliaTitle(9);
        BreakingBad.obtermediaNotas();
        BreakingBad.exibeInfoTitle();

        Movie movieBee = new Movie("Bee Movie", 2007);
        //movieBee.setNome("Bee Movie"); não precisa já que aprendi a usar construtores
        //movieBee.setAnoDeLancamento(2007); não precisa já que aprendi a usar construtores
        movieBee.setTempoDeDuracaoMinutos(91);
        movieBee.setIncluidoNoPlano(true);
        movieBee.avaliaTitle(10);

        ArrayList<Movie> MovieList = new ArrayList<>();
        MovieList.add(myMovie);
        MovieList.add(movieBee);
        System.out.println("Quantos filmes estão na lista: "+MovieList.size());
        System.out.println(MovieList);
        System.out.println("Nome do primeiro filme: "+MovieList.getFirst().toString());

    }
}



