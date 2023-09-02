sabor = int(input("Bem-vindo á sorveteria ice!\nPara encerrar digite 0!\nQual sabor você deseja?\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: "))

while sabor != 0:
    if (sabor > 2) or (sabor <= 0):
        print("Opção inválida")
        sabor = int(input("Digite uma opção válida: "))
    bolas = int(input("Informe a quantidade de bolas: "))
    if (sabor == 1):
        if (bolas > 3):
            print("Você tem direito a um desconto de 10%.")
        else:
            print("Você tem direito a um desconto de 5%.")
    elif (sabor == 0):
        exit()
    else:
        print("Sorvete sem desconto.")
    op = int(input("Deseja fazer uma nova compra?\n\n1- Sim\n2- Não\n\nDigite uma opção: "))
    if (op > 2) or (op <= 0):
        print("Opção inválida")
        op = int(input("Tente novamente: "))
    if (op == 1):
        sabor = int(input("Qual sabor você deseja?\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: "))
    if (op == 2):
        print("Sistema encerrado")
        exit()
print("Sistema encerrado")