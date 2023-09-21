import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        double v[] = new double[20];

        Scanner notas = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite a nota: ");
            v[i] = notas.nextDouble();

        }

        System.out.println("Notas maiores que 7,5:");

        for (int i = 0; i < v.length; i++) {
            if (v[i] > 7.5) {
                System.out.println(v[i]);
            }
        }
        notas.close();
    }
}