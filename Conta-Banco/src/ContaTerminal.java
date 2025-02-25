import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Usando try-with-resources para fechar automaticamente o Scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"))) {
            
            // Solicita o número da Conta (Inteiro)
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            
            // Solicita o número da Agência (Texto)
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            // Solicita o nome do Cliente (Texto)
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            
            // Solicita o saldo da Conta (Decimal)
            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();
            
            // Concatena a mensagem final usando o método concat da classe String
            String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");
            
            // Exibe a mensagem final no terminal
            System.out.println(mensagem);
        }
    }
}
