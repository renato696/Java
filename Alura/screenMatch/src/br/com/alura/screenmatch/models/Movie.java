package br.com.alura.screenmatch.models;

public class Movie {
//atributos da classe
    public String name;
    public int releaseYear;
    boolean planIncluded;
    private double rankingSum;
    private int rankingTotal;
    public int movieLength;

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
}
