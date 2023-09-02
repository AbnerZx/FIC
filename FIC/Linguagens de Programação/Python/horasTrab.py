salario = 0
extra = 1.50
salarioH = float(input("Qual o valor do seu salário por hora: "))
horasE = int(input("Você trabalhou hora extra?\n\n1- Sim\n2- Não\n\nDigite uma opção: "))

if (horasE == 1):
    valorE = int(input("Quantas horas EXTRAS você trabalhou: "))
    salario = (salarioH * 40) + (valorE * 1.5)
    print("Seu salário é de:",salario)
else:
    salario = salarioH * 40
    print("Seu salário é de:",salario)