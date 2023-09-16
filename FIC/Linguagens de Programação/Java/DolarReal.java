import java.util.Scanner;

public class DolarReal {
    public static void main(String[] args) {
        double cotação;
        double dolar;
        double valor;

        Scanner convert = new Scanner(System.in);
        
        System.out.print("Informe o valor da cotação do dolar: ");
        cotação = convert.nextDouble();

        System.out.print("Informe quantos dolar você deseja converter: ");
        dolar = convert.nextDouble();

        valor = (dolar * cotação);

        System.out.println(dolar + " dolares em Reais são R$ " + valor);

        convert.close();
    }
}
