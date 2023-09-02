signo = ["Macaco","Galo","Cão","Porco","Rato","Boi","Tigre","Coelho","Dragão","Serpente","Cavalo","Carneiro"]
i = 0

ano = int(input("Qual o mês do seu nascimento: "))
i = ano % 12
print("Seu signo Zodiaco chinês é",signo[i])