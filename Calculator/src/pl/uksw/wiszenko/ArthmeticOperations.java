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
		int a = Integer.parseInt(devidedOperation[0]);
		int b = Integer.parseInt(devidedOperation[2]);
		char operator = devidedOperation[1].charAt(0);
		System.out.println(this.performSingleOperation(a, b, operator));
	}
	
	public int performSingleOperation(int a, int b, char operator) throws IllegalArgumentException{
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
