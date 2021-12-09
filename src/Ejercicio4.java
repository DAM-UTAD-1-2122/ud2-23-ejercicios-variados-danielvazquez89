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
		// Se inicializa el Scanner para leer los tres n�meros
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer n�mero: ");
		int numero3 = sc.nextInt();
		// Inicializamos la variable mayor para asignar el n�mero mayor a la variable y
		// imprimirlo al final, esto se logr� con los if con los que comparo valores
		// para averiguar esto
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
