import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double num;
		
		System.out.println("Ingrese un numero: ");
		num = scan.nextDouble();
		
		if (num < 0) {
			
			System.out.println("Es negativo");
		}
		else {
			if (num == 0) {
				System.out.println("Es nulo");
			}
			
			else {
				System.out.println("Es positivo");
				
			}
		}
		
		

	}

}
