/**
 * 
 * @author Daniel V�zquez
 *
 *         Realizar un programa que imprima 25 t�rminos de la serie 11 - 22 - 33
 *         - 44, etc. (No se ingresan valores por teclado)
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		while (count <= 25) {
			num += 11;
			if (count != 0) { // Este if lo uso para que no aparezca un gui�n de m�s
				System.out.print(" - " + num);
			} else {
				System.out.print(num);
			}
			count++;
		}
	}
}
