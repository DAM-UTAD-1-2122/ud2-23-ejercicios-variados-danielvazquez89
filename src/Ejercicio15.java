import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Escribir un programa que solicite ingresar 10 notas de alumnos y nos
 *         informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayores = 0;
		int menores = 0;
		int count = 1;
		System.out.println("Ingrese diez notas entre 0 y 10: ");
		while (count <= 10) {
			int num = sc.nextInt();
			if (num >= 7) {
				mayores += 1;
			} else {
				menores += 1;
			}
			count++;
		}
		System.out.println(
				"Se han introducido " + mayores + " notas mayores o iguales a 7 y " + menores + " notas menores a 7!");
		sc.close();
	}
}
