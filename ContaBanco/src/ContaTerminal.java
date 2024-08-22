import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next(); 

        System.out.println("Digite o nome da agência: ");
        String nomeAgencia = scanner.next(); 

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldoCliente = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldoCliente + " já está disponível para saque.");

        scanner.close();

    }
    }

