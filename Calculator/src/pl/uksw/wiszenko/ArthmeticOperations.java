/**
 * 
 */
package pl.uksw.wiszenko;


/**
 * @author Mikolaj
 *
 */
public class ArthmeticOperations {
	
	public ArthmeticOperations(){
		super();
	}
	
	public void printResult(String[] devidedOperation){
		System.out.println(devidedOperation[0]);
		int a = Integer.parseInt(devidedOperation[0]);
		System.out.println(devidedOperation[2]);
		int b = Integer.parseInt(devidedOperation[2]);
		System.out.println(devidedOperation[1]);
		char operator = devidedOperation[1].charAt(0);
		System.out.println(this.performSingleOperation(a, b, operator));
	}
	
	public int performSingleOperation(int a, int b, char operator){
		if(operator == '+'){
			return a + b;
		}
		if(operator == '-'){
			return a - b;
		}
		if(operator == '*'){
			return a * b;
		}
		if(b == 0){
			throw new IllegalArgumentException("Nie dziel przez zero!");
		}
		return a / b;
	}

}
