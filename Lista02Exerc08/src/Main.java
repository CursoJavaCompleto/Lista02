import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario < 2000) {
			System.out.println("Isento");
		}
		else if (salario < 3000) {
			salario =(salario - 2000) / 100 * 8;
			System.out.printf("%.2f%n",salario);
		}
		else if (salario < 4500) {
			salario =(salario - 3000) / 100 * 18 + 1000 * 0.08;
			System.out.printf("%.2f%n",salario);
		}	
		else {
			salario = (salario - 4500) / 100 * 28 + 1500 * 0.18 + 1000 *0.08;
			System.out.printf("%.2f%n",salario);
		}
	}
}
