import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero: ");
		int num1 = scan.nextInt();
		System.out.println("Ingrese el primer numero: ");
		int num2 = scan.nextInt();

		if (num1 == num2) {
			
			System.out.println("Los 2 numeros ingresados son iguales");
		}
		else {
			System.out.println("Son totalmente diferentes");
		}

	}

}
