let nome;
let idade;
let opcao;
opcao = prompt('Deseja iniciar o programa de VivaMais? \n 1 - SIM \n 2 - NÃO').toUpperCase()
while(opcao === 'SIM'){
    nome = prompt('Digite o seu nome:');
    idade = Number(prompt('Informe a sua idade:'));
    if(isNaN(idade) || idade <= 0){
        alert('Dados inválidos!')
    }else{
        if (idade > 18){
            alert('Você é maior de idade')
            opcao = prompt('Deseja continuar o programa de VivaMais? \n 1 - SIM \n 2 - NÃO').toUpperCase()
        }
        else{
            alert('Você é menor de idade!')
            opcao = prompt('Deseja continuar o programa de VivaMais? \n 1 - SIM \n 2 - NÃO').toUpperCase()

        }
       //document.write(`${nome} você tem ${idade} anos e seu peso é: ${peso}`)
    
    } 

}
alert('Programa finalizado com sucesso!')