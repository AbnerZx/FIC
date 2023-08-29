venda = {}
i = 0

while i < 5:
    produto = input(f"Adicione seu produto: {i+1} ")
    quantidade = int(input("Quantas unidades desse produto foram vendidas: "))
    venda[produto] = quantidade
    i+=1
    
print("Produtos que venderam mais de 100 unidades:\n")
for produto, quantidade in venda.items():
    if quantidade > 100:
        print(produto)
