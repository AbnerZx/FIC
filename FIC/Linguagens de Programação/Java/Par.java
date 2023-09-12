import java.util.Scanner;

class Par {
    public static void main(String[] args) {
        int num;
        Scanner n1 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = n1.nextInt();
        if (num % 2 == 0) {
            System.out.println("Este número é par!");
        } 
        else {
            System.out.println("Este número é impar!");
        }
        n1.close();
    }
}