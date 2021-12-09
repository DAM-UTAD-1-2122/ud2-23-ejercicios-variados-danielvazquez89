/**
 * 
 * @author Daniel V�zquez
 *
 *         Desarrollar un programa que muestre la tabla de multiplicar del 5
 *         (del 5 al 50)
 */
public class Ejercicio26 {

	public static void main(String[] args) {
		// Inicializamos la variable multiplicacion y el for con el valor de 10 para
		// mostrar la tabla del 5 hasta 50
		int multiplicacion = 0;
		// En cada iteraci�n del for se imprime el valor de multiplicaci�n el cual aumenta de 5
		// en 5 por iteraci�n, junto a n, de manera que queda confeccionado como una
		// tabla de multiplicar cl�sica
		for (int n = 0; n <= 10; n++) {
			System.out.println("5 x " + n + " = " + multiplicacion);
			multiplicacion += 5;
		}
	}
}
