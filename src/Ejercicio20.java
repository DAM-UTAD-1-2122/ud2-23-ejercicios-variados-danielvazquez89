import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Realizar un programa que permita cargar dos listas de 15 valores cada
 *         una. Informar con un mensaje cual de las dos listas tiene un valor
 *         acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas
 *         iguales") Tener en cuenta que puede haber dos o más estructuras
 *         repetitivas en un algoritmo.
 *
 */
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 15, lista1 = 0, lista2 = 0;
		System.out.println("Introduzca los valores de la lista 1: ");
		while (c > 0) {
			int n = sc.nextInt();
			lista1 += n;
			c--;
		}
		c = 15;
		System.out.println("Introduzca los valores de la lista 2: ");
		while (c > 0) {
			int n = sc.nextInt();
			lista2 += n;
			c--;
		}
		if (lista1 > lista2) {
			System.out.println("Lista 1 mayor");
		} else if (lista1 < lista2) {
			System.out.println("Lista 2 mayor");
		} else {
			System.out.println("Listas iguales");
		}
		sc.close();
	}
}
