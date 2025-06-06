//  Find Largest and Smallest Word in a Sentence

package problemSove;

import java.util.Scanner;

public class PS2_LargestSmallestWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();

		if (sentence.length() == 0) {
			System.out.println("Please enter valid statement");
		} else {
			largestSmallestWord(str);
		}

	}

	public void largestSmallestWord(String str) {
		String[] words = str.split(" ");
		
		String largest = words[0];
		String smallest = words[0];
		
		for(int i=0;i<words.length;i++) {
			
			if(words[i].length()>largest.length()) {
				largest = words[i];
			}
			
			if(words[i].length<smallest.length())
			smallest=words[i]
		}
		
		System.out.println("Largest Word is : " + largest + "and Smallest word is : " + smallest);
	}
}
