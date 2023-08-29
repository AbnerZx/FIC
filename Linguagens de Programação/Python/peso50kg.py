peso = []
i = 0

while i < 25:
    peso.append(float(input("Informe o seu peso: ")))
    i = i + 1
i = 0
print("Segue abaixo pesos inferiores a 50 Kg: ")
while i < 25:
    if peso[i] < 50:
        print(peso[i])
    i = i + 1