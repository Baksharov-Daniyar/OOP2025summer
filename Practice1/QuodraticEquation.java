package Lab1;
import java.util.Scanner;

public class Discriminant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int D = b*b - 4*a*c;
		if(D>0) {
			double x1 = (-b + Math.sqrt(D))/2*a;
			double x2 = (-b + Math.sqrt(D))/2*a;
			System.out.println(x1);
			System.out.println(x2);
		}
		
		else if(D==0) {
			double x = -b/2*a;
			System.out.println(x);
		}

		else {
			System.out.println("Err");
		}
		
		
		
		
		sc.close();
	}
}
