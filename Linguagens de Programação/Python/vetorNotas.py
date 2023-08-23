notas = []
i = 0
media = 0
soma = 0

while (i < 20):
    notas.append( float(input("Digite a nota: ")))
    soma = soma + notas[i]
    i = i + 1
media = soma/i

i = 0
print(media)
print("Notas acima da média:")
while (i < 20):
    if notas[i] > media:
        print(notas[i])
    i = i + 1