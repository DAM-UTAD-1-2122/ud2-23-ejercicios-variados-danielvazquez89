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
		// Inicializamos el Scanner ya que necesitaremos leer valores, el contador a 15
		// ya que queremos pedir 15 valores, y también
		// inicializamos las 2 listas para acumular los valores introducidos en cada una
		// de ellas para así compararlas posteriormente
		Scanner sc = new Scanner(System.in);
		int c = 15, lista1 = 0, lista2 = 0;
		System.out.println("Introduzca los valores de la lista 1: ");
		while (c > 0) {
			int n = sc.nextInt();
			lista1 += n;
			c--;
		}
		// Le volvemos a dar el valor de 15 al contador para que lea 15 valores y los
		// sume a la variable lista2
		c = 15;
		System.out.println("Introduzca los valores de la lista 2: ");
		while (c > 0) {
			int n = sc.nextInt();
			lista2 += n;
			c--;
		}
		// Utilizamos los if para preguntar si una lista es mayor a otra y imprimir el
		// mensaje solicitado por el ejercicio según esto. Utilizamos las variables
		// lista1 y lista2 donde hemos acumulado los valores introducidos en cada lista
		// de 15 valores
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
