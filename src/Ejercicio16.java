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
		Scanner sc = new Scanner(System.in);
		int sumAlturas = 0;
		System.out.println("Cantidad de alturas que quiere introducir: ");
		int n = sc.nextInt();
		int count = n;
		System.out.println("Introduce las alturas ( en cm ): ");
		while (count > 0) {
			int altura = sc.nextInt();
			sumAlturas += altura;
			count--;
		}
		int media = sumAlturas / n;
		System.out.println(media);
		sc.close();
	}

}
