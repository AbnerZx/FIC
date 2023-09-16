import java.util.Scanner;

public class MaiorQue20 {
    public static void main(String[] args) {
        int numero;
        
        Scanner n = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = n.nextInt();

        if (numero > 20) {
            System.out.println(numero + " é maior do que 20!");
        } else {
            System.out.println(numero + "não é maior do que 20 :(");
        }

        n.close();
    }
}
