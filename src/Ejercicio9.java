import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresan tres valores por teclado, si todos son iguales se imprime
 *         la suma del primero con el segundo y a éste resultado se lo
 *         multiplica por el tercero.
 * 
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// Inicializamos el Scanner para leer los 3 valores
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Tercer valor: ");
		int num3 = sc.nextInt();
		// Con este if preguntamos si todos los valores son iguales, si lo son se
		// imprime lo pedido, y sino se imprime que no son iguales
		if (num1 == num2 && num2 == num3) {
			System.out.println((num1 + num2) * num3);
		} else {
			System.out.println("No son iguales");
		}
		sc.close();
	}

}
