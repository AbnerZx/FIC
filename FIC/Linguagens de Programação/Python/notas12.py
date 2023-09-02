nota = []
i = 0

while i < 12:
    nota.append(int(input("Digite a sua nota: ")))
    i = i + 1
i = 0
print("Segue abaixo notas que são inferiores a 5.0:")
while i < 12:
    if nota[i] < 5:
        print(nota[i])
    i = i + 1