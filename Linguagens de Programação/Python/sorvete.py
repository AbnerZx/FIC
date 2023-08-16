sabor = int(input("Bem-vindo á sorveteria ice! Qual sabor você deseja?\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: "))
bolas = int(input("Informe a quantidade de bolas: "))

if (sabor == 1):
    if (bolas > 3):
        print("Você tem direito a um desconto de 10%.")
    else:
        print("Você tem direito a um desconto de 5%.")
else:
    print("Sorvete sem desconto.")