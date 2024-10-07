import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando objeto par leitura do input do usuario
        Scanner scanner = new Scanner(System.in);

        //lendo o primeiro input : Nome do cliente
        System.out.print("Digite o seu Nome: ");
        String nome = scanner.nextLine();

        //lendo o numero da agencia
        System.out.print("Digite o número da Agencia: ");
        int numeroAgencia = scanner.nextInt();
        //quebra a linha deixada pelo next.int
        scanner.nextLine();

        //lendo o numero da Conta
        System.out.print("Digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();
        //quebra a linha deixada pelo next.int
        scanner.nextLine();

        //lendo o saldo da conta
        System.out.print("Digite o saldo da Conta: ");
        String saldoContaString = scanner.nextLine();

        //convertendo a string para double
        double saldoConta = Double.parseDouble(saldoContaString.replace(',', '.'));

        //imprimindo na tela as concatenações das variaveis
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        //encerrando o objeto scanner
        scanner.close();
    }
}
