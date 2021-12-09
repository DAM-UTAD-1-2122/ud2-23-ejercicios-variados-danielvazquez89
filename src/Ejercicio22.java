import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Realizar un programa que acumule (sume) valores ingresados por
 *         teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha
 *         finalizado la carga). Imprimir el valor acumulado e informar si dicho
 *         valor es cero, mayor a cero o menor a cero.
 */
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		System.out.println("Introduce los números ( esto se finaliza introduciendo 9999 )");
		do {
			num = sc.nextInt();
			sum += num;
		} while (num != 9999);
		sum -= 9999;
		System.out.println("La suma de todos los valores será igual a: " + sum);
		if (sum > 0) {
			System.out.println("La suma de los valores es mayor que 0");
		} else if (sum < 0) {
			System.out.println("La suma de los valores es menor que 0");
		} else {
			System.out.println("La suma de todos los valores es igual a 0");
		}
		sc.close();
	}
}
