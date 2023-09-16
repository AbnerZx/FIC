import java.util.Scanner;

public class MamaoComAçucar {
    public static void main(String[] args) {
        double compra;
        double prestação;

        Scanner prest = new Scanner(System.in);

        System.out.print("Digite o valor da compra que você deseja parcelar em 5x: ");
        compra = prest.nextDouble();

        prestação = (compra) / 5;

        System.out.println("O valor parcelado em 5x fica R$ " + prestação);

        prest.close();
    }
}
