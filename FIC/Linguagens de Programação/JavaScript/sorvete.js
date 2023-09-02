let sabor;

do {
    sabor = parseInt(prompt("Bem-vindo à sorveteria ice!\nPara sair digite 0!\nQual sabor você deseja?\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: "));
    if (sabor != 0 && sabor != 1 && sabor != 2) {
        alert("Opção inválida.\nApenas digite 1 para Chocol ate ou 2 para Morango ou 0 para sair.");
    }
} while (sabor != 0 && sabor != 1 && sabor != 2);

let op;

while (sabor === 1 || sabor === 2) {
    let bolas = parseInt(prompt("Informe a quantidade de bolas: "));
    
    while (isNaN(bolas) || bolas === "" || bolas === 0 || bolas < 0) {
        bolas = parseInt(prompt("Você não informou a quantidade de bolas\nPor favor informe a quantidade de bolas"));
    }
    
    if (sabor === 1) {
        if (bolas > 3) {
            alert("Você tem direito a um desconto de 10%.");
        } else {
            alert("Você tem direito a um desconto de 5%.");
        }
    } else {
        alert("Sorvete sem desconto.");
    }
    
    op = parseInt(prompt("Deseja fazer uma nova compra?\n\n1- Sim\n2- Não\n\nDigite uma opção:"));
    while (op != 1 && op != 2) {
        op = parseInt(prompt("Opção inválida\nDeseja fazer uma nova compra?\n\n1- Sim\n2- Não"));
    }
    w
    if (op === 1) {
        do {
            sabor = parseInt(prompt("Qual sabor você deseja?\n\n1- Chocolate\n2- Morango\n\nDigite uma opção: "));
            if (sabor != 0 && sabor != 1 && sabor != 2) {
                alert("Opção inválida. Digite 1 para Chocolate, 2 para Morango ou 0 para sair.");
            }
        } while (sabor != 0 && sabor != 1 && sabor != 2);
    } else {
        alert("Sistema encerrado");
    }
}