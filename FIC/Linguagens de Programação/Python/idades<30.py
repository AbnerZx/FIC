idades = []
i = 0

while i < 10:
    idades.append(int(input("Digite a idade do funcionário: ")))
    i = i + 1
i = 0
print("idades menores que 30 anos:")
while i < 10:
    if idades[i] < 30:
        print(idades[i])
    i = i + 1