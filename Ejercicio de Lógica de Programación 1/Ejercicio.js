
let arreglo = new Array();

//ciclo for del tamaño de 3
for (let i = 0; i < 3; i++) {
    do {
        //Prompt para ingresar los numeros
        numero = prompt("Agregar numero " + (i + 1));
        //Condicion para comprobar que sea numero, no este vacio y tampoco sea null
        if (!isNaN(numero) && numero != null && numero != "") {

            arreglo[i] = numero;
            esNumero = true;
        } else {
            alert("El dato ingresado no es un numero o es un espacio vacio")
            esNumero = false;
        }

    } while (!esNumero);


}
//Cadena antes de ordenar

console.log("Cadena desordenada: " + arreglo);

//Metodo de ordenamiento mayor a menor
arreglo.sort(function (a, b) { return b - a });

//Cadena de datos ordenada de mayor a menor
console.log("Cadena ordenada de mayor a menor: " + arreglo);

//Metodo de ordenamiento menor a mayor
arreglo.sort(function (a, b) { return a - b });

//Cadena de datos ordenada de menor a mayor

console.log("Cadena Ordenada de menor a mayor: " + arreglo);

