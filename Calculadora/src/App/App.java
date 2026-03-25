package App;

import java.util.Scanner;

import Calc.Calculadora;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		boolean terminar = false;
		Calculadora calc = new Calculadora();
		
		do {
			// MENU
			System.out.print("""
					1. Multiplicar
					2.Dividir
					3.Sumar
					4.Restar
					5.Salir
					Elige tu opción: """);
			opcion = sc.nextInt();

			switch (opcion) {
				case 1: {
					System.out.print("Elige un numero: ");
					int a = sc.nextInt();
					System.out.print("Elige un numero: ");
					int b = sc.nextInt();
					
					System.out.println("El resultado es " + calc.multiplicar(a, b));
					break;
				}
				case 2: {
					System.out.print("Elige un numero: ");
					int a = sc.nextInt();
					System.out.print("Elige un numero: ");
					int b = sc.nextInt();
					
					System.out.println("El resultado es " + calc.dividir(a, b));
					break;
				}
				case 3: {
					System.out.print("Elige un numero: ");
					int a = sc.nextInt();
					System.out.print("Elige un numero: ");
					int b = sc.nextInt();
					
					System.out.println("El resultado es " + calc.sumar(a, b));
					break;
				}
				case 4: {
					System.out.print("Elige un numero: ");
					int a = sc.nextInt();
					System.out.print("Elige un numero: ");
					int b = sc.nextInt();
					
					System.out.println("El resultado es " + calc.restar(a, b));
					break;
				}
				case 5: {
				terminar = true;
				}
			}
		} while (!terminar);
	}
}
