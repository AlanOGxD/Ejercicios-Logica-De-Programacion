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
let fn = 0;
let fr = 1;
let cadena = fn + ", " + fr;
if (numero > 1) {
    for (let i = 1; i < numero - 1; i++) {
        r = fn + fr;
        cadena += ", " + r;
        fn = fr;
        fr = r;
    }
    console.log(cadena);
} else {
    console.log("El numero es demasiado chico.");
}


