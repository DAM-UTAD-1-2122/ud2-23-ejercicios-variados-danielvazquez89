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
		// Inicializamos el Scanner para leer los valores, además de las variables
		// necesarias
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		System.out.println("Introduce los números ( esto se finaliza introduciendo 9999 )");
		// Utilizamos el do while para leer valores y sumarlos a la variable sum hasta
		// que se introduzca el valor de 9999, cuando este se introduce salimos del
		// bucle y restamos el 9999 ya que no lo queremos sumado en nuestra variable
		do {
			num = sc.nextInt();
			sum += num;
		} while (num != 9999);
		sum -= 9999;
		System.out.println("La suma de todos los valores será igual a: " + sum);
		// Utilizamos los if para imprimir una cosa o otra según el valor final de sum
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
