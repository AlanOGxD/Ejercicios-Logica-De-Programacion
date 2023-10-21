package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		// Crear un diccionario Español-Inglés
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("casa", "house");
		diccionario.put("auto", "car");
		diccionario.put("manzana", "apple");
		diccionario.put("pelota", "ball");
		diccionario.put("agua", "water");
		diccionario.put("sol", "sun");
		diccionario.put("libro", "book");
		diccionario.put("computadora", "computer");
		diccionario.put("amigo", "friend");
		diccionario.put("familia", "family");
		diccionario.put("jugar", "play");
		diccionario.put("comer", "eat");
		diccionario.put("dormir", "sleep");
		diccionario.put("trabajar", "work");
		diccionario.put("escuela", "school");
		diccionario.put("viajar", "travel");
		diccionario.put("amar", "love");

		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario una palabra en español
		System.out.print("Ingrese una palabra en español: ");
		String palabraEspañol = scanner.nextLine();

		// Buscar la traducción en el diccionario
		String traduccion = diccionario.get(palabraEspañol);

		if (traduccion != null) {
			// Mostrar la traducción en inglés
			System.out.println("La traducción al inglés es: " + traduccion);
		} else {
			// Mostrar un mensaje en caso de no encontrar la traducción
			System.out.println("Palabra no encontrada en el diccionario.");
		}
	}
}
