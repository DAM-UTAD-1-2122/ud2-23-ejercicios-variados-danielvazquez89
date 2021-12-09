import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Escribir un programa que pida ingresar la coordenada de un punto en
 *         el plano, es decir dos valores enteros x e y (distintos a cero).
 *         Posteriormente imprimir en pantalla en que cuadrante se ubica dicho
 *         punto. (1� Cuadrante si x > 0 Y y > 0 , 2� Cuadrante: x < 0 Y y > 0,
 *         etc.)
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		// Importamos el Scanner para leer los dos valores para sacar la coordenada
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Introduzca las coordenadas para ver en que cuadrante se encuentra, recuerda que el 0 no es v�lido!");
		System.out.println("Introduzca la coordenada x: ");
		int x = sc.nextInt();
		System.out.println("Introduzca la coordenada y: ");
		int y = sc.nextInt();
		// Preguntamos las distintas condiciones que nos pone el ejercicio y seg�n cual
		// se cumpla se imprimir� si est� en un cuadrante o en otro
		if (x > 0 && y > 0) {
			System.out.println("El punto se encuentra en el primer cuadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("El punto se encuentra en el segundo cuadrante");
		} else {
			System.out.println("El punto introducido no es v�lido :(");
		}
		sc.close();
	}

}
