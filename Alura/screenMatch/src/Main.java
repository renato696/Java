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
        myMovie.setMovieLenght(180);

        mySerie.setName("Lost");
        mySerie.setReleaseYear(2000);
        mySerie.printMovieInfo();


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
