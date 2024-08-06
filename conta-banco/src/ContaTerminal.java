
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua Conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua agência com dígito no final.");
        System.out.println("Ex.:xxxx-x");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso Banco.");
        System.out.println("Sua Agência é "+ agencia);
        System.out.println("Sua conta é "+ conta);
        System.out.println("Seu saldo é "+ saldo + " e já está disponível para saque.");

    }
}
