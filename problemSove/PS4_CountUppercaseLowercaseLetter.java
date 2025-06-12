// Count the Number of Uppercase and Lowercase Letters

package problemSolve;

import java.util.Scanner;

public class PS4_CountUppercaseLowercaseLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine();

		if (sentence.length() == 0) {
			System.out.println("Please enter valid sentence");
		} else {
			UpperLowerCase(sentence);
		}

	}

	public static void UpperLowerCase(String str) {

		int Uppercase = 0;
		int LowerCase = 0;

		char[] words = str.toCharArray();

		for (int i = 0; i < words.length; i++) {
			if (Character.isUpperCase(words[i])) {
				Uppercase++;
			}

			else if (Character.isLowerCase(words[i])) {
				LowerCase++;
			}
		}

		System.out.println("Uppercase letters count is : " + Uppercase);
		System.out.println("LowerCase letters count is : " + LowerCase);
	}
}
