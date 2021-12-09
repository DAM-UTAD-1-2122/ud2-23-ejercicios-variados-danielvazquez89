import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Escribir un programa que pida ingresar la coordenada de un punto en
 *         el plano, es decir dos valores enteros x e y (distintos a cero).
 *         Posteriormente imprimir en pantalla en que cuadrante se ubica dicho
 *         punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0,
 *         etc.)
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Introduzca las coordenadas para ver en que cuadrante se encuentra, recuerda que el 0 no es válido!");
		System.out.println("Introduzca la coordenada x: ");
		int x = sc.nextInt();
		System.out.println("Introduzca la coordenada y: ");
		int y = sc.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("El punto se encuentra en el primer cuadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("El punto se encuentra en el segundo cuadrante");
		} else {
			System.out.println("El punto introducido no es válido :(");
		}
		sc.close();
	}

}
