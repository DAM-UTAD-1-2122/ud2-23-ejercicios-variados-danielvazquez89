import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Desarrollar un programa que solicite la carga de 10 n�meros e imprima
 *         la suma de los �ltimos 5 valores ingresados.
 * 
 */
public class Ejercicio25 {
	public static void main(String[] args) {
		// Inicializamos Scanner para leer los valores y sum para almacenar la suma de
		// los 5 �ltimos ingresados
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Introduce los n�meros: ");
		// Utilizo el for para ejecutar 10 iteraciones de leer el n�mero, y el if para
		// solo almacenar en sum la suma de las �ltimas 5 iteraciones
		for (int count = 10; count > 0; count--) {
			int num = sc.nextInt();
			if (count <= 5) {
				sum += num;
			}
		}
		// Imprimimos por consola la suma de los 5 �ltimos valores
		System.out.println("La suma de los 5 �ltimos valores es " + sum);
		sc.close();
	}
}
