import java.util.Scanner;

class Programa {
    public static void main(String[] args) {
        // Declaração das variáveis
        double nota1 = 0, nota2 = 0, media = 0;

        Scanner s = new Scanner(System.in);
        
        // Solicita ao usuário que digite a primeira e a segunda nota e lê as notas
        System.out.print("Digite a primeira nota: ");
        nota1 = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = s.nextDouble();

        // Calcula a média das notas
        media = (nota1 + nota2) / 2;
        
        // Exibe a média calculada no console usando printf
        System.out.printf("A média do aluno foi: %.2f%n", media);

        // Fechando o Scanner
        s.close();
    }
}
