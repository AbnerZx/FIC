
do {
    var start = parseInt(prompt('Para começar a usar a calculadora digite 1'))
    if (isNaN(start) || start !==1) {
        alert('Opção inválida')
    }
} while (start !==1)
do {
    var op = parseInt(prompt('Qual operação você deseja fazer\nDigite:\n\n1 para Soma\n2 para Subtração\n3 para Multiplicação\n4 para Divisão\n\nDigite um dos 4 números correspondentes ao que você deseja'))
    if (isNaN(op) || op < 0 || op > 4) {
        alert('Opçao inválida!')
    }
} while (!op)
do {
    var n1 = Number(prompt('Informe um número'))
    if (isNaN(n1) && n1 < 0) {
        alert(`O número ${n1} é inválido`)
    }
} while (!n1)   

do {
    var n2 = Number(prompt('Informe outro número'))
    if (isNaN(n2) && n2 < 0) {
        alert(`O número ${n2} é inválido`)
    }
} while (!n2)

calculadora(n1, n2, op)

function calculadora (a, b, c){
    if (c === 1) {
        var res = a + b
        char = '+'
        console.log(res)
        //alert(`A soma entre ${a} e ${b} é igual a ${res}`)
    }
    else if (c === 2) {
        var res = a - b
        char = '-'
        console.log(res)
        //alert(`A subtração de ${a} e ${b} é igual a ${res}`)
    }
    else if (c === 3) {
        var res = a * b
        char = '*'
        console.log(res)
       // alert(`A multiplicação de ${a} por ${b} é igual a ${res}`)
    }
    else if (c === 4) {
        var res = a / b
        char = '/'
        console.log(res)
      //  alert(`A divisão entre ${a} e ${b} é igual a ${res}`)
    }
    alert(`O resultado de ${a} ${char} ${b} é: ${res}`)

}
