import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner n = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = n.nextInt();

        System.out.print("Digite outro número: ");
        n2 = n.nextInt();

        if (n1 > n2) {
            System.out.println(n2 + " é o menor número!");
        } else {
            System.out.println(n1 + " é o menor número!");
        }

        n.close();
    }
}
