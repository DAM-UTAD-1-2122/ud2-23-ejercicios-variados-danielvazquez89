import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Se ingresan por teclado tres n�meros, si todos los valores ingresados
 *         son menores a 10, imprimir en pantalla la leyenda "Todos los n�meros
 *         son menores a diez".
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Tercer valor: ");
		int num3 = sc.nextInt();
		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los n�meros son menores de 10");
		} else {
			System.out.println("No son todos los n�meros menores de 10");
		}
		sc.close();
	}

}
