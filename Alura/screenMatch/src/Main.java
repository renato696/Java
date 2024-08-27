import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        //criando (instanciando) um objeto usando a classe
        Movie myMovie = new Movie();

        //passando os atributos para o objeto
        myMovie.name = "Godfather";
        myMovie.releaseYear = 1970;
        myMovie.movieLength = 180;

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