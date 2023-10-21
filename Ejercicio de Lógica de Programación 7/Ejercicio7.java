package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Favor de ingresar el dia de la semana:");
			String dia = sc.nextLine().toLowerCase().trim();
			int nDia = 0;
			boolean bandera = true;
			switch (dia) {
			case "lunes":
				nDia = 0;
				break;
			case "martes":
				nDia = 1;
				break;
			case "miércoles":
			case "miercoles":
				nDia = 2;
				break;
			case "jueves":
				nDia = 3;
				break;
			case "viernes":
				nDia = 4;
				break;
			default:
				System.out.print("El día introducido no es correcto.");
				bandera = false;
				break;
			}
			if (bandera) {

				System.out.println("Favor de ingresar Hora y minutos.");

				System.out.print("Hora: ");
				int horas = sc.nextInt();

				if (horas <= 24 && horas >= 0) {
					System.out.print("Minutos: ");
					int minutos = sc.nextInt();
					if (minutos >= 0 && minutos <= 60) {

						int minutosTotales = (4 * 24 * 60) + (15 * 60);
						int minutosActuales = (nDia * 24 * 60) + (horas * 60) + minutos;

						System.out.print("Faltan " + (minutosTotales - minutosActuales)
								+ " minutos para llegar al fin de semana.");
					} else {
						System.out.println("El numero de minutos ingresado es incorrecto");
					}
				} else {
					System.out.println("Numero de horas ingresado incorrecto..");
				}
			}
		} catch (InputMismatchException ex) {
			System.out.println("dato ingresado de manera incorrecta");
		}

	}
}
