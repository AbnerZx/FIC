import java.util.Scanner;

class Sorvete {
    public static void main(String[] args) {
        int sabor = 0;
        int bolas = 0;
        int opcao = 0;

        Scanner sorvete = new Scanner(System.in);

        while (true) {
            System.out.print("Bem-vindo à sorveteria ice!\nPara sair, digite 0!\nPor favor escolha um sabor:\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: ");

            try {
                sabor = Integer.parseInt(sorvete.nextLine());

                if (sabor == 0) {
                    System.out.println("Sistema encerrado!");
                    break;
                } else if (sabor >= 1 && sabor <= 2) {
                    System.out.print("Informe a quantidade de bolas: ");
                    
                    while (true) {
                        try {
                            bolas = Integer.parseInt(sorvete.nextLine());

                            if (bolas > 0) {
                                break; // Sair do loop se a quantidade for válida
                            } else {
                                System.out.print("Quantidade inválida. Por favor, digite novamente: ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.print("Quantidade inválida. Por favor, digite novamente: ");
                        }
                    }

                    if (sabor == 1) {
                        if (bolas > 3) {
                            System.out.println("Você tem direito a um desconto de 10%");
                        } else {
                            System.out.println("Você tem direito a um desconto de 5%");
                        }
                    } else {
                        System.out.println("Sorvete sem desconto");
                    }

                    System.out.print("Muito obrigado pela sua compra\nDeseja fazer uma nova compra?\n\n1- SIm\n2- Não\n\nDigite uma opção: ");
                    
                    while (true) {
                        try {
                            opcao = Integer.parseInt(sorvete.nextLine());

                            if (opcao == 1 || opcao == 2) {
                                break; // Sair do loop se a opção for válida
                            } else {
                                System.out.print("Opção inválida. Por favor, digite novamente: ");
                            }
                        } catch (NumberFormatException e) {
                            System.out.print("Opção inválida. Por favor, digite novamente: ");
                        }
                    }

                    if (opcao == 1) {
                        continue; // Continue para a próxima iteração do loop
                    } else {
                        System.out.println("Sistema encerrado!");
                        break;
                    }
                } else {
                    System.out.print("Opção inválida. Por favor, digite novamente:\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("Opção inválida. Por favor, digite novamente:\n");
            }
        }
        sorvete.close();
    }
}
