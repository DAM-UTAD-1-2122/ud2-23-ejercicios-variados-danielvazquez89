import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Confeccionar un programa que permita ingresar un valor del 1 al 10 y
 *         nos muestre la tabla de multiplicar del mismo (los primeros 12
 *         t�rminos) Ejemplo: Si ingreso 3 deber� aparecer en pantalla los
 *         valores 3, 6, 9, hasta el 36.
 */
public class Ejercicio27 {

	public static void main(String[] args) {
		// Inicializamos Scanner para preguntar el n�mero del que se har� su tabla
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero de la tabla que quiere saber: ");
		int numMult = sc.nextInt();
		// Inicializo una variable con el mismo valor para poder sumarle el valor de la
		// tabla que estamos haciendo en cada iteraci�n a la acumulaci�n que imprimimos
		int multiplicacion = numMult;
		// Este for ejecutar� 12 iteraciones ya que se nos pide la tabla hasta el x12
		for (int count = 1; count <= 12; count++) {
			// Este if es para evitar una coma de m�s a la derecha
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
