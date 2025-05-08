import java.util.Scanner;
 
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Agência :");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta :");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial :");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }

    @Override
    public String toString() {
        return "ContaTerminal []";
    }
}


    
