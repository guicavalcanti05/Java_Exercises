import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cliente c = new Cliente();

        c.saldo = 5000;

        int operacao = 0;

        while(operacao != 4) {
            System.out.println("1 - Consultar \n2 - Sacar \n3 - Depositar \n4 - Sair\nDigite a operação Desejada--> ");
            operacao = teclado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é: " + c.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Quanto deseja sacar ->");
                    double sacar = teclado.nextDouble();
                    c.sacar(sacar);
                    System.out.println("Seu novo saldo é: " + c.consultarSaldo());
                    break;
                case 3:
                    System.out.println("Quanto deseja depositar ->");
                    double depositar = teclado.nextDouble();
                    c.depositar(depositar);
                    System.out.println("Seu novo saldo é: " + c.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Operação Inválida!");
            }
        }
        teclado.close();
    }
}
