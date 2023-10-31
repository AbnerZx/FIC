// document.getElementsByTagName('p')[0].innerText="Olá mundo."
// document.getElementsByTagName('p')[1].innerText="Olá mundo2"
// document.getElementsByClassName('terceiro')[0].innerHTML="<b>Negrito</b>"

// function mudar() {
//     //document.getElementsByClassName('terceiro')[0].innerHTML="mudou"
//     let cor = document.getElementById('cor').value
//     document.body.style.background = cor
// }

// function somar() {
//     let n1 = document.getElementById('n1').value
//     let n2 = document.getElementById('n2').value
//     document.getElementById('resultado').innerHTML = Number(n1) + Number(n2)
// }

let flag = true

function mode(){
    if (flag == true){
        document.body.style.background="black"
        document.body.style.color="white"
        flag = false
    } else {
        document.body.style.background="white"
        document.body.style.color="black"
        flag = true
    }
}