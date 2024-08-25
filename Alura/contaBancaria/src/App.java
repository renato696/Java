
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        String name ="Renato Pires";
        String accountType = "Corrente";
        double accountBalance = 1599.99;

        System.out.println("********************************");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo de conta: " + accountType);
        System.out.println("Saldo: R$" + accountBalance);
        System.out.println("\n********************************");

        String menu = """
                **Digite a opção desejada:
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                Opção:
                """;

        Scanner reading = new Scanner (System.in);


        int operation = 0;
        while (operation != 4) {
            System.out.println(menu);
            operation = reading.nextInt();
        }

    }
}
