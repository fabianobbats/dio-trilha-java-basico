import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));

        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldoConta = scanner.nextDouble();

        // Exibe a mensagem final
        String mensagem = "Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + ", conta " + numeroConta + " e seu saldo " + saldoConta
                + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();

    }
}
