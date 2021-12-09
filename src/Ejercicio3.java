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
		// Inicializamos el Scanner para leer el n�mero del que consultaremos las cifras
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero: ");
		int num = sc.nextInt();
		// Usamos los if para que si el n�mero introducido dividido entre 10 es mayor
		// igual que 1, quiere decir que ten�a dos d�gitos, y sino tendr� 1
		if (num / 10 >= 1) {
			System.out.println("El n�mero introducido tiene 2 d�gitos");
		} else {
			System.out.println("El n�mero introducido tiene 1 d�gito");
		}
		sc.close();
	}
}
