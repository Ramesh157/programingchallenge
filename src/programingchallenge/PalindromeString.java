package programingchallenge;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		String reverse = "";
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("given String is not palindrome");
		}
	}
}
