/**
 * 
 */
package pl.uksw.wiszenko;

/**
 * @author Mikolaj
 *
 */
public class ArthmeticOperations {
	
	public double addition(double a, double b){
		return a + b;
	}
	
	public double substration(double a, double b){
		return a - b;
	}
	
	public double multiplication(double a, double b){
		return a * b;
	}
	
	public double division(double a, double b) throws IllegalArgumentException{
		if(b == 0){
			throw new IllegalArgumentException("Nie dziel przez zero!");
		}
		return a / b;
	}
}
