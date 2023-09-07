import java.util.Scanner;

class Programa {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, media = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a primeira e a segunda nota: ");
        nota1 = s.nextDouble();
        System.out.print("Digite a segunda e a segunda nota: ");
        nota2 = s.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno foi: " + media);
    }
}