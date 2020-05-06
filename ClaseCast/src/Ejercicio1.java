import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double area;
		double pi = 3.1415;
		
		System.out.println("Ingrese el radio: ");
		double radio = scan.nextDouble();
		
		area = pi*(radio *radio); 
		
		System.out.println("El area del circulo es: "+area);
	}

}
