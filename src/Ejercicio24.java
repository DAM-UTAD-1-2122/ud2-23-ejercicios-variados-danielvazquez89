import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Confeccionar un programa que lea n pares de datos, cada par de datos
 *         corresponde a la medida de la base y la altura de un triángulo. El
 *         programa deberá informar: a) De cada triángulo la medida de su base,
 *         su altura y su superficie. b) La cantidad de triángulos cuya
 *         superficie es mayor a 12.
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		// Inicializamos el Scanner y un contador para almacenar la cantidad de
		// triángulos con superficies mayores a 12 con un if posteriormente
		Scanner sc = new Scanner(System.in);
		int countMayores = 0;
		// Inicializamos el bucle for que tendrá un número de iteraciones el cual
		// dependerá de la variable cant, a la que el usuario le dará el valor por
		// consola
		System.out.println("Introduce la cantidad de pares de datos que quieras introducir: ");
		for (int cant = sc.nextInt(); cant > 0; cant--) {
			// Leemos la base y altura del triángulo y imprimimos los valores pedidos en
			// cada iteración
			System.out.println("Introduzca la base y altura del nuevo triángulo: ");
			int base = sc.nextInt();
			int altura = sc.nextInt();
			int sup = (base * altura) / 2;
			System.out.println("La base de este triangulo es = " + base + " ,la altura es = " + altura
					+ " y la superficie es = " + sup);
			if (sup > 12) {
				countMayores++;
			}
		}
		// Aquí se imprime por consola el contador del que he hablado en el primer
		// comentario
		System.out.println("Hay " + countMayores + " triángulos con una superficie mayor a 12");
		sc.close();
	}
}
