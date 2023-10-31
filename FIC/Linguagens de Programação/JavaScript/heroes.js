let img=document.querySelector('img')
let p = document.querySelector('p')
let btn = document.querySelectorAll('input')
function buscar() {
    let nome = document.querySelector('input#nome').value
    fetch(`https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/all.json`)
        .then(response => response.json())
        .then(data => {
            let dados = data
            console.log(dados)
            dados.forEach(e => {
                if(e.name.toLowerCase() == nome){
                    console.log(e.name)
                    img.src = e.images.lg
                    p.innerHTML = e.name
                    console.log(e.images.lg)
                }
            });
        })
        .catch(err => console.log(err));
}

btn[0].addEventListener('keypress',(e)=>{
    console.log('oi')
    if(e.key == "Enter"){
        buscar()
    }
})