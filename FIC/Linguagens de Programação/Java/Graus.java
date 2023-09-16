import java.util.Scanner;

class Graus {
    public static void main(String[] args) {
        double celsius;
        double Fah;

        Scanner graus = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = graus.nextDouble();

        Fah = (9*celsius+160) / 5;

        System.out.println(celsius + " graus Celsius em Fahrenheit são: "+ Fah +" ºF");

        graus.close();
    }
}