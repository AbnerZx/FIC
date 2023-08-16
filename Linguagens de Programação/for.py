contador = 1
soma = 0

for contador in range (5):
    altura = float(input("Digite o valor da altura: "))
    soma = soma + altura
    contador = contador + 1
media = soma/contador
print("A média das alturas é de: ", media)