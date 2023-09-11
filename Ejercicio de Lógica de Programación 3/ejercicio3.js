let numero;
do {
    //Prompt para ingresar los numeros
    numero = prompt("Agregar numero: ");
    //Condicion para comprobar que sea numero, no este vacio y tampoco sea null
    if (!isNaN(numero) && numero != null && numero != "") {

        noEsNumero = false;
    } else {
        alert("El dato ingresado no es un numero o es un espacio vacio")
        noEsNumero = true;
    }

} while (noEsNumero);
let resultado = 1;
for (let i = 1; i <= numero; i++) {
    resultado *= i;
}

console.log(resultado);