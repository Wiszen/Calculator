/**
 * 
 */
package pl.uksw.wiszenko;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Mikolaj
 *
 */
public class Menu {
	private static final String[] options = new String[]{"Obliczanie", "Import z pliku", "Wyjscie z programu"};
	private boolean endOfProgram;
	private String input;

	public Menu(){
		this.setEndOfProgram(false);
		Scanner keyboard = new Scanner(System.in);
		while(!this.isEndOfProgram()){
			for(int i = 1; i <= 3; i++){
				System.out.println(i + ". " + options[i - 1]);
			}
			
			System.out.print("Wpisz liczbe: ");
			switch (keyboard.nextInt()) {
			case 1:
				input = keyboard.nextLine(); // Consume newline left-over
				System.out.println("Prosze wpisywac rownania zakonczone \'=\' (wpisanie \"koniec\" zakonczy):");
				input = keyboard.nextLine();
				while(!input.equals("koniec")){
					try{
						new ArthmeticOperations().printResult(StringUtils.splitByCharacterType(input));
					} catch(IllegalArgumentException e){
						System.err.println(e.getMessage());
					}
					System.out.println("Prosze wpisywac rownania zakonczone \'=\' (wpisanie \"koniec\" zakonczy):");
					input = keyboard.nextLine();
				}
				break;
			case 3:
				this.setEndOfProgram(true);
				break;
			default:
				System.out.println("Wpisano zly klawisz. Sprobuj ponownie");
				break;
			}
		}
		System.out.println("Koniec programu.");
		keyboard.close();
	}
	
	private boolean isEndOfProgram() {
		return endOfProgram;
	}

	private void setEndOfProgram(boolean czyKoniec) {
		this.endOfProgram = czyKoniec;
	}
}
