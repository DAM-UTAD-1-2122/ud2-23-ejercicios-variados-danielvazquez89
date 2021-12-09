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
		// Se inicializa el Scanner para leer el n�mero introducido, el c�al mediante
		// unos ifs se imprimira si este es mayor a 0, menor, o nulo, lo que he
		// considerado que es 0
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
