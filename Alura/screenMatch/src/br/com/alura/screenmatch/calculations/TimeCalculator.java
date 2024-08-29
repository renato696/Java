package br.com.alura.screenmatch.calculations;

//import br.com.alura.screenmatch.models.Movie;
//import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    //nesse caso eu não usei o setter porque eu não precisei resgatar o valor de outra parte do código. O totalTime partiu do zero, que eu mesmo atribui a ele. O setter traz valor de fora para dentro da classe; o getter retornar o valor de dentro da classe para fora.
    public int getTotalTime() {
        return this.totalTime;
    }

/* O codigo abaixo gera alto acoplamento, por isso substituido pelo código em seguida
    public void addTime(Movie m){
        this.totalTime += m.getMovieLenght();
    }
    public void addTime(Series s){
        this.totalTime +=s.getMovieLenght();
    }
*/

//pegando os dados da superclasse, eu reduzo o acoplamento.
    public void addTime(Title title){
        System.out.println("Adicionando duração em minutos de: " + title);
        this.totalTime += title.getMovieLenght();
    }

}
