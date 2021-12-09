import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Desarrollar un programa que permita cargar n números enteros y luego
 *         nos informe cuántos valores fueron pares y cuántos impares. Emplear
 *         el operador ?%? en la condición de la estructura condicional: if
 *         (valor%2==0) //Si el if da verdadero luego es par.
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		// Inicializamos el Scanner y los contadores
		Scanner sc = new Scanner(System.in);
		int countPares = 0, countImpares = 0;
		System.out.println("Introduzca la cantidad de valores a introducir: ");
		int n = sc.nextInt();
		System.out.println("Introduzca los valores: ");
		// Este while ejecuta el número de iteraciones pedidas en n y lee en cada
		// iteración un valor que según si es par o impar, con el if, suma 1 al contador
		// respectivo, para esto usamos el operador de módulo de 2, si % 2 = 0 quiere
		// decir que es par, y sino impar
		while (n > 0) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				countPares++;
			} else {
				countImpares++;
			}
			n--;
		}
		System.out.println("Se han introducido " + countPares + " valores pares");
		System.out.println("Se han introducido " + countImpares + " valores impares");
		sc.close();
	}
}
