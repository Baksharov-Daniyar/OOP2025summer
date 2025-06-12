package Lab1;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		
		if(grade>0 && grade <49) {
			System.out.println("Grade is " + "F");
		}
		
		else if(grade>=50 && grade <70) {
			System.out.println("Grade is " + "C");
		}
		
		else if(grade>=70 && grade <90) {
			System.out.println("Grade is " + "B");
		}
		
		else if(grade>=90 && grade <=100) {
			System.out.println("Grade is " + "A");
		}
		
		sc.close();
		
	}
}
