contador = 0
maior = 0
menor = 9999
media = 0
soma = 0

numero = int(input("Digite um número desejado: "))

while numero > 0:
    if numero < menor:
        menor = numero
    elif numero > maior:
        maior = numero
    soma = soma + numero
    contador = contador + 1
    numero = int(input("Digite um número desejado: "))
media = soma/contador
print("maior:",maior)
print("menor:",menor)
print("media:",media)