import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        //variáveis 
        int num1;
        int num2;
        double soma;
        double media;

        //construção de objeto para entrada de teclado
        Scanner teclado = new Scanner(System.in);

        //entrada de dados
        System.out.print("Escreva o primeiro número: ");
       // num1 = objeto.nextInt();
       num1 = teclado.nextInt();

        System.out.print("Escreva o segundo número: ");
        num2 = teclado.nextInt();

        //operações
        soma = (num1 + num2);
        media = soma / 2;

        //resultado
        System.out.println("a média de "+num1+" e "+num2+" é: "+media);
    }
}
