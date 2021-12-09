import java.util.Scanner;

/**
 * 
 * @author Daniel V�zquez
 *
 *         Confeccionar un programa que lea n pares de datos, cada par de datos
 *         corresponde a la medida de la base y la altura de un tri�ngulo. El
 *         programa deber� informar: a) De cada tri�ngulo la medida de su base,
 *         su altura y su superficie. b) La cantidad de tri�ngulos cuya
 *         superficie es mayor a 12.
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countMayores = 0;
		System.out.println("Introduce la cantidad de pares de datos que quieras introducir: ");
		for (int cant = sc.nextInt(); cant > 0; cant--) {
			System.out.println("Introduzca la base y altura del nuevo tri�ngulo: ");
			int base = sc.nextInt();
			int altura = sc.nextInt();
			int sup = (base * altura) / 2;
			System.out.println("La base de este triangulo es = " + base + " ,la altura es = " + altura
					+ " y la superficie es = " + sup);
			if (sup > 12) {
				countMayores++;
			}
		}
		System.out.println("Hay " + countMayores + " tri�ngulos con una superficie mayor a 12");
		sc.close();
	}
}
