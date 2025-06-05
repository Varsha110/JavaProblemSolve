//Create a password of length 8 in which first two will be from A to z and last 6 will be digits from 0 to 9.

package problemSove;

import java.util.Scanner;

public class PS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the password");
			String password = sc.nextLine();
			
			
			if (isValidPassword(password)) {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		}

	}

	public static boolean isValidPassword(String Password) {

		char[] ch = Password.toCharArray();

		if (ch.length != 8) {
			return false;
		}

		for (int i = 0; i < 2; i++) {
			if (!Character.isLetter(ch[i])) {
				return false;
			}
		}

		for (int i = 2; i < 8; i++) {
			if (!Character.isDigit(ch[i])) {
				return false;
			}
		}
		return true;
	}

}
