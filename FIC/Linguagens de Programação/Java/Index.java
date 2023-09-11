import java.util.Scanner;

class Index {
    public static void main(String[] args) {
        /*
        String frase = "Teste Java";
        int idade;
        float horas = 2.30f;
        double pi = 3.14;
        boolean flag = true;
        char letra = 'm';

        int x = 10;
        int z = 20;

        x = z;
        z = 10;
        System.out.println(z);
        System.out.println("Teste Java");
        */
        String nome;
        try (Scanner zinho = new Scanner(System.in)) {
        System.out.print("Escreva o seu nome: ");
        nome = zinho.next();
        System.out.println("O seu nome é "+nome);
        }
    }
}