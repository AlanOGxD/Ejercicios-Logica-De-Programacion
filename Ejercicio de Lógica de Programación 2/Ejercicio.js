/**
 * 
 * 
- Crear un programa en `JavaScript` que realice lo siguiente:

- Input
  - Solicitar al usuario por input o prompt la temperatura en grados Celcius.
  


- Output
  - Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Farenheit.
  - Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Kelvin.

--- 

Input:
```
45
```
Output:
``` 
Grados Fahrenheit: 113
Grados Kelvin: 318.15
```

## Consideraciones


- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- Si no conoces las fórmulas para las conversiones, puedes apoyarte de `Google`.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.


 */


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


