import java.util.Scanner;

class Programa {
    public static void main(String[] args) {
        // Declaração das variáveis
        double nota1 = 0, nota2 = 0, media = 0;

        // Início do bloco try-with-resources para criar e gerenciar o Scanner
        try (Scanner s = new Scanner(System.in)) {
            // Solicita ao usuário que digite a primeira e a segunda nota
            System.out.print("Digite a primeira e a segunda nota: ");
            
            // Lê a primeira nota fornecida pelo usuário e a armazena na variável nota1
            nota1 = s.nextDouble();
            
            // Solicita ao usuário que digite a segunda nota
            System.out.print("Digite a segunda nota: ");
            
            // Lê a segunda nota fornecida pelo usuário e a armazena na variável nota2
            nota2 = s.nextDouble();
        } // O bloco try é encerrado aqui, e o Scanner é fechado automaticamente

        // Calcula a média das notas
        media = (nota1 + nota2) / 2;
        
        // Exibe a média calculada no console
        System.out.println("A média do aluno foi: " + media);
    }
}
