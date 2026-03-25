package Calc;

public class Calculadora {
	
	public Calculadora(){
		
	}
	//Para sumar los numeros
	public int sumar(int a, int b) {
		int result = a + b;
		
		return result;
	}
	//Para restar los numeros
	public int restar(int a, int b) {
		int result = a - b;
		
		return result;
	}
	//Para multiplicar los numeros
	public int multiplicar(int a, int b) {
		int result = a * b;
		
		return result;
	}
	//Para dividir los numeros
	public double dividir(int a, int b) {
		if(b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre 0");
		}
		int result = a / b;
		
		return result;
	}
	
}

