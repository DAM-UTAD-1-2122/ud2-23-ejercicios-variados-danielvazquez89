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
		// Inicializamos el Scanner para leer valores y todos los contadores necesarios
		// que se nos piden, adem�s de la variable donde acumularemos el valor total de
		// la suma de los pares
		Scanner sc = new Scanner(System.in);
		int countMultiplos = 0, countNegativos = 0, countPositivos = 0, valorAcumulado = 0;
		System.out.println("Introduzca los 10 valores: ");
		// Este for se inicializa a 10 y se va restando 1 al final de cada iteraci�n
		// para hacer 10 iteraciones como se nos pide y as� leer 10 n�meros y hacer con
		// su valor lo que se nos pide
		for (int c = 10; c > 0; c--) {
			int n = sc.nextInt();
			if (n < 0) {
				countNegativos++;
			} else {
				countPositivos++;
			}
			// Este if es para aumentar en 1 el valor del contador de multiplos solo si el
			// valor introducido es m�ltimplo de 15
			if (n % 15 == 0) {
				countMultiplos++;
			}
			// Este if es para solo sumar los pares a nuestra variable valorAcumulado
			if (n % 2 == 0) {
				valorAcumulado += n;
			}
		}
		// Imprimimos todo lo pedido al final
		System.out.println("Se han ingresado " + countPositivos + " n�meros positivos");
		System.out.println("Se han ingresado " + countNegativos + " n�meros negativos");
		System.out.println("Se han ingresado " + countMultiplos + " n�meros m�ltiplos de 15");
		System.out.println("La suma de todos los pares ser� igual a: " + valorAcumulado);
		sc.close();
	}
}
