
let celsius;

do {
  numero = prompt("Ingresa la temperatura en grados celsius: ");
  if (!isNaN(numero) && numero != null && numero != "") {
    celsius = numero;
    valido = false;
  } else {
    alert("El dato ingresado no es un numero o valor valido.")
    valido = true;
  }


} while (valido);


console.log("Los grados celsius equivalen a " + (celsius * 1.8 + 32) + " Farenheit");
console.log("Los grados celsius equivalen a " + (parseFloat(celsius) + 273.15) + " Kelvin");


