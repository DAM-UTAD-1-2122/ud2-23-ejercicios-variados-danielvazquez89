import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se ingresa por teclado un n�mero positivo de uno o dos d�gitos
 *         (1..99) mostrar un mensaje indicando si el n�mero tiene uno o dos
 *         d�gitos. (Tener en cuenta que condici�n debe cumplirse para tener dos
 *         d�gitos, un n�mero entero)
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero: ");
		int num = sc.nextInt();
		if (num / 10 >= 1) {
			System.out.println("El n�mero introducido tiene 2 d�gitos");
		} else {
			System.out.println("El n�mero introducido tiene 1 d�gito");
		}
		sc.close();
	}
}
