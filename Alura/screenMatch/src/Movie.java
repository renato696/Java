public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    double rankingSum;
    int rankingTotal;
    int movieLength;

    void printMovieInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    void rank(double score){
        rankingSum += score;
        rankingTotal ++;
    }

    double rankingMedia(){
        return rankingSum / rankingTotal;
    }
}
