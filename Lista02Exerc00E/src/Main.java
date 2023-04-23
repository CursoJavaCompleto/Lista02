import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;

		double raiz1 = (-b + Math.sqrt(delta)) / (a * 2);
		double raiz2 = (-b - Math.sqrt(delta)) / (a * 2);

		if (delta < 0 || a == 0) {
			System.out.println("Impossível calcular!");
		} else {
			System.out.printf("R1 = %.5f%n", raiz1);
			System.out.printf("R2 = %.5f%n", raiz2);
		}
		
		sc.close();
	}

}
