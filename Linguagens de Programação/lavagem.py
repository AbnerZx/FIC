lavagem = int(input("Qual tipo de lavagem você vai querer:\n\n1- Lavagem simples\n2- Lavagem completa (inclui polimero)\n\nDigite uma opção: "))
pagamento = int(input("Qual será a forma de pagamento:\n\n1- Dinheiro\n2- Cartão\n\nDigite uma opção: "))

if (lavagem == 1):
    if (pagamento == 1):
        print("O valor ficará por R$ 30.")
    elif (pagamento == 2):
        print("O valor ficará por R$ 35.")
elif (lavagem == 2):
    if (pagamento == 1):
        print("O valor ficará por R$ 50.")
    elif (pagamento == 2):
        print("O valor ficará por R$ 55.")