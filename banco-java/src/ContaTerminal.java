import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo por favor :");

        String nome = scanner.nextLine();

        System.out.println("Digite o numero da sua conta :");

        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da sua Agência :");

        String numeroAgencia = scanner.next();

        System.out.println("Digite o valor a ser depositado :");

        double valorSaldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " ,Obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + " conta " + numeroConta + " e seu saldo " +"R$"+ valorSaldo + " já está disponivel para saque.");


    }
}
