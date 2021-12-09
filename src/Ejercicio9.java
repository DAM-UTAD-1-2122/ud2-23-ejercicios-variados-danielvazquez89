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
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Tercer valor: ");
		int num3 = sc.nextInt();
		if (num1 == num2 && num2 == num3) {
			System.out.println((num1 + num2) * num3);
		} else {
			System.out.println("No son iguales");
		}
		sc.close();
	}

}
