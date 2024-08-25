import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double avaliacaoMedia = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua avaliação para o filme?");
            nota = reading.nextDouble();
            avaliacaoMedia += nota;
        }

        System.out.println("Média de avaliação: " + avaliacaoMedia/3);

    }
}
