import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Confeccionar un programa que permita cargar un número entero positivo
 *         de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o
 *         3 cifras. Mostrar un mensaje de error si el número de cifras es
 *         mayor.
 * 
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		// Inicializamos el Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int num = sc.nextInt();
		// Utilizamos los ifs para comparar nuestra variable con los valores intoducidos
		// de manera que imprima una cosa o otra dependiendo del resultado de esta
		// comparación
		if (num >= 1000) {
			System.out.println("El número introducido es mayor al esperado");
		} else if (num / 10 < 1) {
			System.out.println("El número introducido tiene 1 cifra");
		} else if (num / 10 < 10) {
			System.out.println("El número introducido tiene 2 cifras");
		} else {
			System.out.println("El número introducido tiene 3 cifras");
		}
		sc.close();
	}
}
