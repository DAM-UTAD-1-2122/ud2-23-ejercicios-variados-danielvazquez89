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
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Introduce los n�meros: ");
		for (int count = 10; count > 0; count--) {
			int num = sc.nextInt();
			if (count <= 5) {
				sum += num;
			}
		}
		System.out.println("La suma de los 5 �ltimos valores es " + sum);
		sc.close();
	}
}
