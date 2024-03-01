import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cliente c = new Cliente();

        c.saldo = 5000;

        int operacao;
        double valor;

        do {
            System.out.println("1 - Consultar\n2 - Sacar\n3 - Depositar\n4 - Encerrar operação\nDigite a operação desejada: ");
            operacao = teclado.nextInt();

            switch (operacao) {

                case 1:
                    System.out.println("Seu saldo é: " + c.consultarSaldo());
                    break;

                case 2:
                    System.out.println("Quanto deseja sacar: ");
                    valor = teclado.nextDouble();
                    if (valor > 0 && valor <= c.consultarSaldo()) {
                        c.sacar(valor);
                        System.out.println("Saque realizado com sucesso.");
                        System.out.println("Seu novo saldo é: " + c.consultarSaldo());
                    } 
                    else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    
                    
                    break;

                case 3:
                    System.out.println("Quanto deseja depositar: ");
                    valor = teclado.nextDouble();
                    if (valor > 0) {
                        c.depositar(valor);
                        System.out.println("Depósito realizado com sucesso.");
                        System.out.println("Seu novo saldo é: " + c.consultarSaldo());
                    } 
                    
                    else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando operação...");
                    break;

                default:
                    System.out.println("Operação inválida!");
            }

        } while (operacao != 4);

        teclado.close();

    }

}
