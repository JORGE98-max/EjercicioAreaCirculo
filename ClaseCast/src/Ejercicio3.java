import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un numero: ");
		double num = scan.nextDouble();
		
		if (num < 0) {
			
			System.out.println("Es negativo");
		}
		else {
			System.out.println("Es positivo");
		}

	}

}
