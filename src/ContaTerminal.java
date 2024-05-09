import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola vamos criar a sua conta!");
        System.out.println("Digite o numero da conta:");
        int numero = scanner.nextInt();

        // Limpar o buffer após a leitura do número da conta
        scanner.nextLine();

        System.out.println("Digite a sua agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Estamos quase la, por favor nos informe qual o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Agora pra terminar nos fale qual seu primeiro deposito:");
        double saldo = scanner.nextDouble();

        scanner.close();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}