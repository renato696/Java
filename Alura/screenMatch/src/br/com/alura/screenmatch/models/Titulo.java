package br.com.alura.screenmatch.models;

public class Titulo {

    //atributos da classe
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double rankingSum;
    private int rankingTotal;
    private int movieLength;

//métodos da classe
    public void printMovieInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    public void rank(double score){
        rankingSum += score;
        rankingTotal ++;
    }

//método com return
    public double rankingMedia(){
        return rankingSum / rankingTotal;
    }

//Método GET - para compensar o PRIVATE no atributo.
    public int getrankingTotal(){
        return rankingTotal;
    }

//Método SET - recebo o parametro e salvo na variavel name
    public void setName(String name){
        this.name = name;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setMovieLenght(int movieLength){
        this.movieLength = movieLength;
    }

    public void setPlanIncluded(boolean planIncluded){
        this.planIncluded = planIncluded;
    }

}
