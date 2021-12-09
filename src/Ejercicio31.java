import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se realiza la carga de 10 valores enteros por teclado. Se desea
 *         conocer: a) La cantidad de valores ingresados negativos. b) La
 *         cantidad de valores ingresados positivos. c) La cantidad de múltiplos
 *         de 15. d) El valor acumulado de los números ingresados que son pares.
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
		System.out.println("Se han ingresado " + countPositivos + " números positivos");
		System.out.println("Se han ingresado " + countNegativos + " números negativos");
		System.out.println("Se han ingresado " + countMultiplos + " números múltiplos de 15");
		System.out.println("La suma de todos los pares será igual a: " + valorAcumulado);
		sc.close();
	}
}
