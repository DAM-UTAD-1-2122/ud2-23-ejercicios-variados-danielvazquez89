/**
 * 
 * @author Daniel Vázquez
 *
 *         Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33
 *         - 44, etc. (No se ingresan valores por teclado)
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// Este programa es simple, inicializamos las variables y al ser múltiplos de 15
		// solo habrá que ejecutar la iteración del bucle while las veces que se nos
		// pide, sumando 11 y imprimiendo en cada iteración
		int count = 0;
		int num = 0;
		while (count <= 25) {
			num += 11;
			if (count != 0) { // Este if lo uso para que no aparezca un guión de más
				System.out.print(" - " + num);
			} else {
				System.out.print(num);
			}
			count++;
		}
	}
}
