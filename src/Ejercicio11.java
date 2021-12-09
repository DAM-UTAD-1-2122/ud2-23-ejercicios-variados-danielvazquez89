import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se ingresan por teclado tres n�meros, si al menos uno de los valores
 *         ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de
 *         los n�meros es menor a diez".
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Tercer valor: ");
		int num3 = sc.nextInt();
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los n�meros es menor a diez");
		}
		sc.close();
	}
}
