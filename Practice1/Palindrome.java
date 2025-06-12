package Lab1;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		int length = word.length();
		boolean isPalindrome = true;
		
		for(int i = 0; i < length / 2; i++) {
			if(word.charAt(i) != word.charAt(length - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Это палиндром");
		} else {
			System.out.println("Это не палиндром");
		}
		
		sc.close();
	}
}

