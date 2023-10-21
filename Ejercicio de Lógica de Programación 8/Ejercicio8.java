package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		int[] primos = new int[10];
		int[] noPrimos = new int[10];
		int indicePrimos = 0;
		int indiceNoPrimos = 0;

		// Solicitar al usuario 10 números por consola y almacenarlos en un array
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Identificar números primos y no primos
		for (int i = 0; i < 10; i++) {
			if (esPrimo(numeros[i])) {
				primos[indicePrimos] = numeros[i];
				indicePrimos++;
			} else {
				noPrimos[indiceNoPrimos] = numeros[i];
				indiceNoPrimos++;
			}
		}

		// Mostrar números primos al inicio
		System.out.println("Números primos al inicio:");
		for (int i = 0; i < indicePrimos; i++) {
			System.out.println("Índice " + i + ": " + primos[i]);
		}

		// Mostrar números no primos
		System.out.println("Números no primos:");
		for (int i = 0; i < indiceNoPrimos; i++) {
			System.out.println("Índice " + i + ": " + noPrimos[i]);
		}
	}

	// Función para verificar si un número es primo
	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
