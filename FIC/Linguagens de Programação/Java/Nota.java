// Importa a classe Scanner do pacote java.util, que permite a entrada de dados pelo usuário.
import java.util.Scanner;

// Declaração da classe "Programa".
class Programa {
    // Método principal do programa.
    public static void main(String[] args) {
        // Declaração de variáveis para armazenar as notas e a média.
        double nota1 = 0, nota2 = 0, media = 0;

        // Criação de um objeto Scanner para ler a entrada do usuário.
        Scanner s = new Scanner(System.in);

        // Solicita ao usuário que digite as notas.
        System.out.print("Digite a primeira e a segunda nota: ");
        
        // Lê a primeira nota digitada pelo usuário e a armazena na variável "nota1".
        nota1 = s.nextDouble();
        
        // Solicita ao usuário que digite a segunda nota.
        System.out.print("Digite a segunda nota: ");
        
        // Lê a segunda nota digitada pelo usuário e a armazena na variável "nota2".
        nota2 = s.nextDouble();

        // Calcula a média das duas notas.
        media = (nota1 + nota2) / 2;

        // Exibe a média calculada na tela.
        System.out.println("A média do aluno foi: " + media);
    }
}
