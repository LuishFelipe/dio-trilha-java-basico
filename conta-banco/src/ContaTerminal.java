import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        String agency;
        String clientName;
        Integer numberCount;
        Float balance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, bem vindo ao nosso banco!\n------------------------------\n");
        System.out.println("Digite o seu nome!");
        clientName = scanner.next();

        scanner.close();
    }
}
