import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agency;
        String clientName;
        Integer numberCount;
        Double balance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem vindo ao nosso banco!\n------------------------------\n");
        System.out.println("Digite o seu nome!");
        clientName = scanner.nextLine();

        System.out.println("Digite o número da sua agencia!");
        agency = scanner.next();

        System.out.println("Digite o numero da sua conta!");
        numberCount = scanner.nextInt();

        System.out.println("Para finalizar, o valor depositado!");
        balance = scanner.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
            +agency+", conta "+numberCount+" e seu saldo "+balance+" já está disponível para saque");

        scanner.close();
    }
}
