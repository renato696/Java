public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    double ranking;
    int rankingTotal;
    int movieLength;

    void printMovieInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }
}
