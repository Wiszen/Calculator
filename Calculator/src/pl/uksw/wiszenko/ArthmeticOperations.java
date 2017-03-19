/**
 * 
 */
package pl.uksw.wiszenko;


/**
 * 
 *	Klasa obslugujaca operacje arytmetczne:
 *		- dodawanie
 *		- odejmowanie
 *		- mnozenie
 *		- dzielenie
 *	Kazde dzialanie zawiera tylko dwie liczby i operator.
 *	@author Mikolaj
 */
public class ArthmeticOperations {
	/**
	 * Nie tworzymy na stale klasy - nic nie da nam to.
	 */
	public ArthmeticOperations(){
		super();
	}
	/**
	 * Metoda pobierajaca podzielona na tablice String-ow operacje i wyswietla wynik.
	 * @param devidedOperation Podzielona operacja na skladowe do tablicy typu String
	 */
	public void printResult(String[] devidedOperation){
		int a = Integer.parseInt(devidedOperation[0]);
		int b = Integer.parseInt(devidedOperation[2]);
		char operator = devidedOperation[1].charAt(0);
		System.out.println(this.performSingleOperation(a, b, operator));
	}
	/**
	 * Metoda pobierajaca dwie liczby i znak operacji, a zwracajaca jej wynik.
	 * Pozwala obslurzyc dzielenie przez 0.
	 * @param a Pierwsza liczba dzialania
	 * @param b Druga liczba dzialania
	 * @param operator Operator dzialania
	 * @return Wynik dzialania
	 * @throws IllegalArgumentException Jest rzucony kiedy b jest zerem (nie mozna dzielc przez zero)
	 */
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
