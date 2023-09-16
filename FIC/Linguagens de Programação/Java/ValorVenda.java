import java.util.Scanner;

public class ValorVenda {
    public static void main(String[] args) {
        double custo;
        double percentual;
        double valor;

        Scanner preço = new Scanner(System.in);

        System.out.print("Digite o valor do custo do produto: ");
        custo = preço.nextDouble();

        System.out.print("Informe o percentual que você deseja de lucro: ");
        percentual = preço.nextDouble();

        valor = ((custo * percentual) / 100) + custo;

        System.out.println("O valor do produto ficará por: " + valor);

        preço.close();
    }
}
