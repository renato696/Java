package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Movie;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void addTime(Movie m){
        this.totalTime += m.getMovieLenght();
    }

}
//nesse caso eu não usei o setter porque eu não precisei resgatar o valor de outra parte do código. O totalTime partiu do zero, que eu mesmo atribui a ele. O setter traz valor de fora para dentro da classe; o getter retornar o valor de dentro da classe para fora.
