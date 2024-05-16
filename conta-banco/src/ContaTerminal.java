import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Olá, Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, Digite o numero de sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, Digite o Numero de Sua Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o valor que deseja depositar:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome);
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua Agência é:" + agencia + "  Numero da Conta:" +numeroConta);
        System.out.println("Seu saldo: R$" + saldo  + "  Já está disponivel para saque.");
    



    }
}
