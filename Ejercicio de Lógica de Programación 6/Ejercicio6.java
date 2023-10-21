package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Favor de ingresar palabra o frase a continuacion:");
		String string = sc.nextLine();

		String nuevoString = "";
		for (int i = 0; i < string.length(); i++) {
			nuevoString = string.charAt(i) + nuevoString;
		}

		System.out.println(nuevoString);

	}
}
