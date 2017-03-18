/**
 * 
 */
package pl.uksw.wiszenko;

import java.util.Scanner;

/**
 * @author Mikolaj
 *
 */
public class Menu {
	private static final String[] options = new String[]{"Obliczanie", "Import z pliku", "Wyjscie z programu"};
	private boolean czyKoniec;
	private int input;
	
	

	public Menu(){
		this.setCzyKoniec(false);
		for(int i = 1; i <= 3; i++){
			System.out.println(i + ". " + options[i - 1]);
		}
		
		System.out.print("Wpisz liczbe: ");
		Scanner keyboard = new Scanner(System.in);
		switch (keyboard.nextInt()) {
		case 1:
			do{
				System.out.println("Prosze wpisywac rownania zakonczone \'=\' (wpisanie \"koniec\" zakonczy):");
				this.setInput(keyboard.nextInt());
			} while(new String("koniec").equals(this.getInput()));
			break;

		default:
			break;
		}
		keyboard.close();
	}
	
	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}
	public boolean isCzyKoniec() {
		return czyKoniec;
	}

	public void setCzyKoniec(boolean czyKoniec) {
		this.czyKoniec = czyKoniec;
	}
}
