package Ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// Crear un diccionario Español-Inglés
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("casa", "house");
		diccionario.put("coche", "car");
		diccionario.put("manzana", "apple");
		diccionario.put("pelota", "ball");
		diccionario.put("agua", "water");
		diccionario.put("sol", "sun");
		diccionario.put("teclado", "keyboard");
		diccionario.put("libro", "book");
		diccionario.put("ordenador", "computer");
		diccionario.put("amigo", "friend");
		diccionario.put("familia", "family");
		diccionario.put("jugar", "play");
		diccionario.put("comer", "eat");
		diccionario.put("dormir", "sleep");
		diccionario.put("trabajar", "work");
		diccionario.put("escuela", "school");
		diccionario.put("viajar", "travel");
		diccionario.put("amar", "love");

		// Seleccionar 5 palabras al azar del diccionario
		String[] palabrasAleatorias = seleccionarPalabrasAlAzar(diccionario, 5);

		Scanner scanner = new Scanner(System.in);
		int respuestasCorrectas = 0;
		int respuestasIncorrectas = 0;

		System.out.println("Juego de Traducción Español-Inglés");
		System.out.println("Ingresa la traducción en inglés de las siguientes palabras:");

		for (String palabraEspañol : palabrasAleatorias) {
			System.out.print("Traduce '" + palabraEspañol + "': ");
			String traduccionUsuario = scanner.nextLine();
			String traduccionCorrecta = diccionario.get(palabraEspañol);

			if (traduccionUsuario != null && traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
				System.out.println("¡Correcto!");
				respuestasCorrectas++;
			} else {
				System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
				respuestasIncorrectas++;
			}
		}

		// Mostrar el resultado
		System.out.println("Respuestas correctas: " + respuestasCorrectas);
		System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
	}

	// Función para seleccionar palabras al azar del diccionario
	public static String[] seleccionarPalabrasAlAzar(Map<String, String> diccionario, int cantidad) {
		Random random = new Random();
		String[] palabras = diccionario.keySet().toArray(new String[0]);
		String[] palabrasAleatorias = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			int indiceAleatorio = random.nextInt(palabras.length);
			palabrasAleatorias[i] = palabras[indiceAleatorio];
		}

		return palabrasAleatorias;
	}

}
