public class main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Godfather";
        myMovie.releaseYear = 1970;
        myMovie.movieLength = 180;

        myMovie.printMovieInfo();
        myMovie.rank(8.5);
        myMovie.rank(9.0);
        myMovie.rank(7.5);
        System.out.println(myMovie.rankingSum);
        System.out.println(myMovie.rankingTotal);
        System.out.println(myMovie.rankingMedia());
    }
}
