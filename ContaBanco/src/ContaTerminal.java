/**
* <h1>Simulador de Banco</h1>
* Resolução proposta para o desafio "Simulando Uma Conta Bancária Através Do Terminal/Console" 
* da Digital Innovation One
* @author  Rhaylson Ribeiro
* @version 1.0
* @since   14/05/2024
* */
import java.util.Locale;
import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        //Recebendo os dados via terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = scanner.next();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();
        //Resultado
        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+ numeroConta+"e seu saldo "+saldo+" já está disponível para saque");
    }
}
