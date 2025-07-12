import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Receber dados digitados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        Integer conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        var agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente!");
        var delimiterAtual = scanner.delimiter();
        scanner.useDelimiter("\n");
        String nomeCliente = scanner.next();
        scanner.useDelimiter(delimiterAtual);


        System.out.println("Por favor, digite o valor do Saldo!");
        var saldo = Double.parseDouble(scanner.next());
        

        scanner.close();
        //TO DO: Processar a mensgagem
        var mensagem =  "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.";
        //TO DO: Exibir a resposta
        System.out.println(mensagem);
    }
}
