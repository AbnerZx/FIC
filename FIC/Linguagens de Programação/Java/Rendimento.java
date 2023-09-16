import java.util.Scanner;

public class Rendimento {
    public static void main(String[] args) {
        double deposito;
        double juros;

        Scanner rendimento = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: ");
        deposito = rendimento.nextDouble();

        juros = (deposito * 1.70);

        System.out.println("O valor depositado com rendimento de 0.70% ao mês: " + juros);

        rendimento.close();
    }
}
