/**
 * 
 * @author Daniel Vázquez
 *
 *         Desarrollar un programa que muestre la tabla de multiplicar del 5
 *         (del 5 al 50)
 */
public class Ejercicio26 {

	public static void main(String[] args) {
		int multiplicacion = 0;
		for (int n = 0; n <= 10; n++) {
			System.out.println("5 x "+ n + " = " + multiplicacion);
			multiplicacion +=5;
		}
	}
}
