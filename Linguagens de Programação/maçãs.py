valor = 0
custo = 0
macas = int(input("Quantas maçãs você deseja comprar: "))

if (macas < 12):
    custo = 1.30
else:
    custo = 1

valor = custo * macas
print("O valor de compra ficará R$",valor)
