pontuacao = []
i = 0

while (i < 15):
    pontuacao.append(int(input("Informe a sua pontuação: ")))
    i = i + 1
i = 0
print("Segue abaixo as pontuações que excederam 20 pontos:\n")
while (i < 15):
    if pontuacao[i] > 20:
        print(pontuacao[i])
    i = i + 1