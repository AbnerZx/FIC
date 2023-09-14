import java.util.Scanner; // Importe a classe Scanner corretamente

class Nmaior {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;

        Scanner num = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = num.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = num.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = num.nextDouble();

        System.out.println("Os números informados em ordem crescente ficam:");

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println(n1+"\n"+n2+"\n"+n3);
            }else{
                System.out.println(n1+"\n"+n3+"\n"+n2);
            }
        }else if ((n2 < n1)&&(n2 < n3)){
            if(n1 < n3){
                System.out.println(n2+"\n"+n1+"\n"+n3);
            }else{
                System.out.println(n2+"\n"+n3+"\n"+n1);
            }
        }else if ((n3 < n2) && (n3 < n1)) {
            if (n3 < n1) {
                System.out.println(n3+"\n"+n2+"\n"+n1);
            }else{
                System.out.println(n3+"\n"+n1+"\n"+n2);
            }
        }
        num.close();
    }
}
