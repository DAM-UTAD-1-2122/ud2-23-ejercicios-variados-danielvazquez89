import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Confeccionar un programa que permita ingresar un valor del 1 al 10 y
 *         nos muestre la tabla de multiplicar del mismo (los primeros 12
 *         términos) Ejemplo: Si ingreso 3 deberá aparecer en pantalla los
 *         valores 3, 6, 9, hasta el 36.
 */
public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de la tabla que quiere saber: ");
		int numMult = sc.nextInt();
		int multiplicacion = numMult;
		for (int count = 1; count <= 12; count++) {
			if (count == 1) {
				System.out.print(multiplicacion);
			} else {
				System.out.print(", " + multiplicacion);
			}
			multiplicacion += numMult;
		}
		sc.close();
	}
}
