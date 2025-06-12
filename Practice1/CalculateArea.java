package Lab1;
import java.util.Scanner;

public class CalcArea {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

    double area = a * a;
    double perimeter = 4 * a;
    double diagonal = a * Math.sqrt(2);

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
    System.out.println("Length of the diagonal: " + diagonal);

    sc.close();
	}
}

