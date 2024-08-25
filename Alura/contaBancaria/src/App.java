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
                \n**Digite a opção desejada:
                
                1- Consultar saldo
                2- Transferir valor
                3- Depositar valor
                4- Sair
                
                Opção:
                """;

        Scanner reading = new Scanner (System.in);


        int operation = 0;
        while (operation != 4) {
            System.out.println(menu);
            operation = reading.nextInt();
        

            if(operation == 1) {
                System.out.println("O saldo atualizado é: R$ " + accountBalance);
            } else if (operation == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double amount = reading.nextDouble();
                    if (amount > accountBalance){
                        System.out.println("Não há saldo suficiente para transferência");
                    } else {
                        accountBalance -= amount;
                        System.out.println("Seu saldo atual é: R$ " + accountBalance);
                        }
            } else if(operation == 3){
                System.out.println("Valor recebido: R$ ");
                double amount = reading.nextDouble();
                accountBalance += amount;
                System.out.println("Seu saldo atual é: R$ " + accountBalance);
            } else if(operation != 4){
                System.out.println("Opção inválida!");
            }
        }
    }
}          


