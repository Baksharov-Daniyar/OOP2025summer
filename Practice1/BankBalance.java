package Lab1;
import java.util.Scanner;
//годовая процентная ставка 18%

public class Deposit {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double initial_value = 100000;
	System.out.println("Сколько месяцев прошло после открытия депозита? ");
	double month = sc.nextInt();
	double monthly_rate = 0.015;
	
	double finish_value = initial_value * Math.pow(1 + monthly_rate, month);
	System.out.println(finish_value);
	sc.close();
	}
}
