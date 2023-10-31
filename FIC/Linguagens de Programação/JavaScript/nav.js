let width = document.querySelector(".menu-list");
function abre() {
  width.style.width = "70%";
}
function fecha() {
  width.style.width = "0%";
}
let usuarios = [];
function cadastrar() {
  let nome = document.querySelector("#nome").value;
  let senha = document.querySelector("#senha").value;
  let usuario = { nome: nome, senha: senha };
  usuarios.push(usuario);
  console.log(usuarios);
}
