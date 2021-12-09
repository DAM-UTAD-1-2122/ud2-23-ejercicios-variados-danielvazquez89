import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Se ingresan un conjunto de n alturas de personas por teclado. Mostrar
 *         la altura promedio de las personas.
 * 
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// Inicializamos el Scanner y las variables necesarias para almacenar la altura
		// y ver la cantidad de alturas a introducir
		Scanner sc = new Scanner(System.in);
		int sumAlturas = 0;
		System.out.println("Cantidad de alturas que quiere introducir: ");
		int n = sc.nextInt();
		int count = n;
		System.out.println("Introduce las alturas ( en cm ): ");
		// Pedimos las alturas en cm, las leemos por el Scanner, y las sumamos a la
		// variable sumAlturas para almacenar la suma de todas las alturas
		while (count > 0) {
			int altura = sc.nextInt();
			sumAlturas += altura;
			count--;
		}
		// Dividimos la variavle sum alturas entre el número de alturas que han sido
		// introducidas, que es n, y así sacamos la media
		int media = sumAlturas / n;
		System.out.println(media);
		sc.close();
	}

}
