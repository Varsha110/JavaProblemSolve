//Check if a Character is a Vowel or Consonant

package problemSolve;

import java.util.Scanner;

public class PS3_CharacterIsVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		String input = sc.nextLine();

		if (input.length()!=1) {
			System.out.println("Please enter valid character");
		} else {
			
			char ch = input.toLowerCase().charAt(0);
			checkCharacterVowelOrConsonant(ch);

		}
	}

	public static void checkCharacterVowelOrConsonant(char ch) {

		if (!Character.isLetter(ch)) {
			System.out.println("Not a valid alphabet");
		} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}

	}

}
