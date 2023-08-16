contador = 0
soma = 0

print("Sistema para média de altura [5 pessoas]")

while contador < 5:
    altura = float(input("Digite o valor da altura: "))
    soma = soma + altura
    contador = contador + 1
media = soma/contador
print("A média das alturas é de: ",media)
