import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        
        Scanner reading = new Scanner(System.in);
        double avaliacaoMedia = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme, ou -1 para encerrar: ");
            nota = reading.nextDouble();
            
            if(nota != -1){
                avaliacaoMedia += nota;
                totalDeNotas ++;
            }
            
        }

        System.out.println("Média de avaliação: " + avaliacaoMedia/totalDeNotas);

    }
}
