package pl.uksw.wiszenko;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * 
 *	Klasa obslugujaca menu:
 *		- wyswietla menu
 *		- wczytuje z klawiatury liczby
 *		- wyswietla na ekran napisy
 *		- konczy program
 *	@author Mikolaj
 */
public class Menu {
	/**
	 * Stala zawierajaca napisy wyswietlane w menu, do wyboru prze uzytkownika.
	 */
	private static final String[] options = new String[]{"Obliczanie", "Wyjscie z programu"};
	/**
	 * Zmienna informujaca, czy program powinien sie zakonczyc.
	 */
	private boolean endOfProgram;
	/**
	 * Zmienna zawierajaca wczytana linie z konsoli.
	 */
	private String input;
	
	/**
	 * Konstruktor domyslny, zawierajacy wszystkie uruchamiane operacje programu.
	 * Tu odbywa sie czytanie z konsoli.
	 */
	public Menu(){
		this.setEndOfProgram(false);
		Scanner keyboard = new Scanner(System.in);
		while(!this.isEndOfProgram()){
			for(int i = 1; i <= 2; i++){
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
			case 2:
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
	/**
	 * Getter dla zmiennej endOfProgram
	 * @return
	 */
	private boolean isEndOfProgram() {
		return endOfProgram;
	}
	/**
	 * Setter dla zmiennej endOfProgram
	 * @param endOfProgram jezeli false to program nie zakonczy sie
	 */
	private void setEndOfProgram(boolean czyKoniec) {
		this.endOfProgram = czyKoniec;
	}
}
