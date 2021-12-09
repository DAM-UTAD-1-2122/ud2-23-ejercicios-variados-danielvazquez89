import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se cargan por teclado tres n�meros distintos. Mostrar por pantalla el
 *         mayor de ellos.
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		int numero3 = sc.nextInt();
		int mayor;
		if (numero1 > numero2 && numero1 > numero3) {
			mayor = numero1;
		} else if (numero2 > numero3) {
			mayor = numero2;
		} else {
			mayor = numero3;
		}
		System.out.println("El mayor n�mero introducido es: " + mayor);
		sc.close();
	}
}
