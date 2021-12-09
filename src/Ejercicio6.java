import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Confeccionar un programa que permita cargar un n�mero entero positivo
 *         de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o
 *         3 cifras. Mostrar un mensaje de error si el n�mero de cifras es
 *         mayor.
 * 
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		// Inicializamos el Scanner para leer el n�mero
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el n�mero: ");
		int num = sc.nextInt();
		// Utilizamos los ifs para comparar nuestra variable con los valores intoducidos
		// de manera que imprima una cosa o otra dependiendo del resultado de esta
		// comparaci�n
		if (num >= 1000) {
			System.out.println("El n�mero introducido es mayor al esperado");
		} else if (num / 10 < 1) {
			System.out.println("El n�mero introducido tiene 1 cifra");
		} else if (num / 10 < 10) {
			System.out.println("El n�mero introducido tiene 2 cifras");
		} else {
			System.out.println("El n�mero introducido tiene 3 cifras");
		}
		sc.close();
	}
}
