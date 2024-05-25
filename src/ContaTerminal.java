import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da Conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Informe o nome da Agência: ");
        String agenciaConta = sc.nextLine();

        System.out.print("Informe o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        //sc.nextLine();

        System.out.print("Informe o saldo da Conta: ");
        double saldoConta = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu " +
                "saldo %.2f já está disponível para saque.", nomeCliente, agenciaConta, numeroConta, saldoConta);

        sc.close();

    }
}
