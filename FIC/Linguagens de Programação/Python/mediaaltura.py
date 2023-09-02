altura = []
media = 0
i = 0
soma = 0

while i < 5:
    altura.append(float(input("Digite a sua altura: ")))
    soma = soma + altura[i]
    i+=1
media = soma / i
i = 0
print("Segue media da altura da sua sala de aula: ",media)
print("Segue abaixo alturas acima da média da sua sala: ")
while i < 5:
    if altura[i] > media:
        print(altura[i])
    i = i + 1