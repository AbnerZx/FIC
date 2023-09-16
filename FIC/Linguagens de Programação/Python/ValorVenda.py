custo = float(input("Informe o valor de custo do produto: "))
percentual = int(input("Informe um percentual: "))

valor = ((custo * percentual) / 100) + custo
print(valor)