//  Find Largest and Smallest Word in a Sentence

package problemSove;

import java.util.Scanner;

public class PS2 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the sentence: ");
	        String sentence = sc.nextLine();

	        String[] words = sentence.split(" "); // Split sentence into words

	        String smallest = words[0];
	        String largest = words[0];

	        for (String word : words) {
	            if (word.length() < smallest.length()) {
	                smallest = word;
	            }
	            if (word.length() > largest.length()) {
	                largest = word;
	            }
	        }

	        System.out.println("Smallest word: " + smallest);
	        System.out.println("Largest word: " + largest);
	    }
	}




