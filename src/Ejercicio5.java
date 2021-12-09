import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresa por teclado un valor entero, mostrar una leyenda que
 *         indique si el número es positivo, nulo o negativo.
 * 
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		// Se inicializa el Scanner para leer el número introducido, el cúal mediante
		// unos ifs se imprimira si este es mayor a 0, menor, o nulo, lo que he
		// considerado que es 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
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
