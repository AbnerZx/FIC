import java.util.Scanner;

class Sorvete {
    public static void main(String[] args) {
        int sabor;
        int bolas;
        int opcao;
        Scanner sabor1 = new Scanner(System.in);
        Scanner bolas1 = new Scanner(System.in);
        Scanner opcao1 = new Scanner(System.in);
        System.out.print("Bem-vindo à sorveteria ice!\nPara sair digite 0!\nPor favor escolha um sabor:\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: ");
        sabor = sabor1.nextInt();
        while (sabor != 0) {
            while (sabor > 2 || sabor < 0) {
                System.out.println("Opção inválida\nPor favor digite novamente: ");
                sabor = sabor1.nextInt();
            }
            if (sabor == 0) {
                System.out.println("Sistema encerrado!");
                System.exit(0);
            }
            System.out.print("Informe a quantidade de bolas: ");
            bolas = bolas1.nextInt();
            while (bolas <=0) {
                System.out.print("Quantidade inválida\nInforme a quantidade de bolas: ");
                bolas = bolas1.nextInt();
            }
            if (sabor == 1) {
                if (bolas > 3) {
                    System.out.println("Você tem direito a um desconto de 10%");
                }
                else {
                    System.out.println("Você tem direito a um desconto de 5%");
                }
            }
            else {
                System.out.println("Sorvete sem desconto");
            }
            System.out.print("Muito obrigado pela sua compra\nDeseja fazer uma nova compra?\n\n1- SIm\n2- Não\n\nDigite uma opção: ");
            opcao = opcao1.nextInt();
            while (opcao > 2 || opcao <= 0) {
                System.out.println("Opção inválida\nDeseja fazer uma nova compra?\n\n1- Sim\n2- Não\n\nDigite uma opção válida: ");
                opcao = opcao1.nextInt();
            }
            if (opcao == 1) {
                System.out.print("Olá novamente!\nPara sair digite 0!\nPor favor escolha um sabor:\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: ");
                sabor = sabor1.nextInt();
            }
            else {
                System.out.println("Sistema encerrado!");
                System.exit(0);
            }
        }
        sabor1.close();
        bolas1.close();
        opcao1.close();
    }
}
