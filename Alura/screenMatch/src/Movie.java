public class Movie {
//atributos da classe
    String name;
    int releaseYear;
    boolean planIncluded;
    double rankingSum;
    int rankingTotal;
    int movieLength;

//métodos da classe
    void printMovieInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    void rank(double score){
        rankingSum += score;
        rankingTotal ++;
    }

//método com return
    double rankingMedia(){
        return rankingSum / rankingTotal;
    }
}
