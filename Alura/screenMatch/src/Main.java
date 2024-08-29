import br.com.alura.screenmatch.calculations.Recomendations;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        //criando (instanciando) um objeto usando a classe
        Movie myMovie = new Movie();
        Series mySerie = new Series();

        //passando os atributos para o objeto
        myMovie.setName("Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setMovieLength(180);
        System.out.println("Duração do filme: " + myMovie.getMovieLenght());

        mySerie.setName("Lost");
        mySerie.setReleaseYear(2000);
        mySerie.printMovieInfo();
        mySerie.setSeasons(10);
        mySerie.setEpisodesPerSeason(8);
        mySerie.setMinutesPerEpisode(60);
        System.out.println("Duração para maratonar a série: " + mySerie.getMovieLenght());

        Movie otherMovie = new Movie();
        otherMovie.setName("Conan - The Barbarian");
        otherMovie.setReleaseYear(1982);
        otherMovie.setMovieLength(160);
        System.out.println("Duração do filme: " + myMovie.getMovieLenght());

        TimeCalculator calculator = new TimeCalculator();
        calculator.addTime(myMovie);
        calculator.addTime(otherMovie);
        calculator.addTime(mySerie);
        System.out.println("Tempo total em tela: " + calculator.getTotalTime());

        Recomendations recomendationsFilter = new Recomendations();
        recomendationsFilter.recomendationsFilter(myMovie);

        //invocando método da classe e passando atributos
        myMovie.printMovieInfo();
        myMovie.rank(8.5);
        myMovie.rank(9.0);
        myMovie.rank(7.5);
        
        //invocando os métodos da classe e retorno com GET
        System.out.println("Total de avaliações: " + myMovie.getrankingTotal());

        //invocando método e obtendo retorno
        System.out.println(myMovie.rankingMedia());
    }
}
