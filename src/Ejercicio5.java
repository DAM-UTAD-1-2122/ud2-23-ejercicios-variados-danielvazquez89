import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se ingresa por teclado un valor entero, mostrar una leyenda que
 *         indique si el n�mero es positivo, nulo o negativo.
 * 
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positivo");
		} else if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("0 o nulo");
		}
		sc.close();
	}
}
