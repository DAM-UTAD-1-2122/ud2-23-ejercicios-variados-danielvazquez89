import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresan por teclado tres números, si al menos uno de los valores
 *         ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de
 *         los números es menor a diez".
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		// Se importa el Scanner y se leen los 3 valores
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Tercer valor: ");
		int num3 = sc.nextInt();
		// Utilizamos el operador or para que el if se ejecute con que alguno de los 3
		// valores cumpla la condición
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		}
		sc.close();
	}
}
