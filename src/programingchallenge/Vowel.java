package programingchallenge;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		System.out.println("Enter the String");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] character = str.toCharArray();

		int Count = 0;
		for (char c : character) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				Count++;
				break;

			}

		}
		System.out.println("Number opf Vowels in string = " + Count);
	}

}
