resultado = 0

n1 = float(input("Para sair digite 0!\nDigite um número: "))

while (n1 != 0):
    n2 = float(input("Digite outro número: "))
    op = int(input("Qual tipo de operação você deseja fazer:\n\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n\nDigite uma opção: "))
    if (op > 4) or (op <= 0): 
        print("Opção inválida")
        op = int(input("Digite a opção novamente: "))
    if (op == 1):
        resultado = n1 + n2
    if (op == 2):
        resultado = n1 - n2
    if (op == 3):
        resultado = n1 * n2
    if (op == 4):
        resultado = n1 / n2
    print(resultado)
    cont = float(input("Deseja fazer uma nova operação?\n\n1- Sim\n2- Não\n\nDigite uma opção: "))
    if (cont == 1):
        n1 = float(input("Para sair digite 0!\nDigite um número: "))
    else:
        exit()
        