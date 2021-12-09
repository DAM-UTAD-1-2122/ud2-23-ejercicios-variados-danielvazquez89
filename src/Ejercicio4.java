import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se cargan por teclado tres números distintos. Mostrar por pantalla el
 *         mayor de ellos.
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		// Se inicializa el Scanner para leer los tres números
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce el tercer número: ");
		int numero3 = sc.nextInt();
		// Inicializamos la variable mayor para asignar el número mayor a la variable y
		// imprimirlo al final, esto se lográ con los if con los que comparo valores
		// para averiguar esto
		int mayor;
		if (numero1 > numero2 && numero1 > numero3) {
			mayor = numero1;
		} else if (numero2 > numero3) {
			mayor = numero2;
		} else {
			mayor = numero3;
		}
		System.out.println("El mayor número introducido es: " + mayor);
		sc.close();
	}
}
