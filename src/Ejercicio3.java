import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresa por teclado un número positivo de uno o dos dígitos
 *         (1..99) mostrar un mensaje indicando si el número tiene uno o dos
 *         dígitos. (Tener en cuenta que condición debe cumplirse para tener dos
 *         dígitos, un número entero)
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
		int num = sc.nextInt();
		if (num / 10 >= 1) {
			System.out.println("El número introducido tiene 2 dígitos");
		} else {
			System.out.println("El número introducido tiene 1 dígito");
		}
		sc.close();
	}
}
