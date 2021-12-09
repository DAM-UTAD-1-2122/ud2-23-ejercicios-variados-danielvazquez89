import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se realiza la carga de 10 valores enteros por teclado. Se desea
 *         conocer: a) La cantidad de valores ingresados negativos. b) La
 *         cantidad de valores ingresados positivos. c) La cantidad de m�ltiplos
 *         de 15. d) El valor acumulado de los n�meros ingresados que son pares.
 */
public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countMultiplos = 0, countNegativos = 0, countPositivos = 0, valorAcumulado = 0;
		System.out.println("Introduzca los 10 valores: ");
		for (int c = 10; c > 0; c--) {
			int n = sc.nextInt();
			if (n < 0) {
				countNegativos++;
			} else {
				countPositivos++;
			}
			if (n % 15 == 0) {
				countMultiplos++;
			}
			if (n % 2 == 0) {
				valorAcumulado += n;
			}
		}
		System.out.println("Se han ingresado " + countPositivos + " n�meros positivos");
		System.out.println("Se han ingresado " + countNegativos + " n�meros negativos");
		System.out.println("Se han ingresado " + countMultiplos + " n�meros m�ltiplos de 15");
		System.out.println("La suma de todos los pares ser� igual a: " + valorAcumulado);
		sc.close();
	}
}
