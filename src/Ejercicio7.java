import java.util.Scanner;

/**
 * 
 * @author Daniel Vázquez
 *
 *         Un postulante a un empleo, realiza un test de capacitación, se obtuvo
 *         la siguiente información: cantidad total de preguntas que se le
 *         realizaron y la cantidad de preguntas que contestó correctamente. Se
 *         pide confeccionar un programa que ingrese los dos datos por teclado e
 *         informe el nivel del mismo según el porcentaje de respuestas
 *         correctas que ha obtenido, y sabiendo que: Nivel máximo:
 *         Porcentaje>=90% Nivel medio: Porcentaje>=75% y <90% Nivel regular:
 *         PorceAntaje>=50% y <75% Fuera de nivel:Porcentaje<50%
 * 
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de preguntas: ");
		int numPreguntas = sc.nextInt();
		System.out.println("Cantidad preguntas acertadas: ");
		int acertadas = sc.nextInt();
		int porcentaje = (acertadas * 100) / numPreguntas;
		String resultado = null;
		if (porcentaje < 50) {
			resultado = "Fuera de nivel";
		} else if (porcentaje < 75) {
			resultado = "Nivel regular";
		} else if (porcentaje < 90) {
			resultado = "Nivel medio";
		} else {
			resultado = "Nivel máximo";
		}
		System.out.println(resultado);
		sc.close();
	}
}
