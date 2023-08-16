ingresso = int(input("Qual tipo de ingresso você deseja?\n\n1- VIP\n2- Standard\n\nDigite uma opção: "))
if (ingresso == 1):
    combo = int(input("Você tambem deseja o combo de pipoca?\n\n1- Sim\n2- Não\n\nDigite uma opção: "))
    if (combo == 1):
        print("O valor ficará R$ 110")
    elif (combo == 2):
        print("O valor ficará R$ 80")
elif (ingresso == 2):
    combo = int(input("Você tambem deseja o combo de pipoca?\n\n1- Sim\n2- Não\n\nDigite uma opção: "))
    if (combo == 1):
        print("O valor ficará R$ 70")
    elif (combo == 2):
        print("O valor ficará R$ 40")
else:
    print("Opção inválida")
