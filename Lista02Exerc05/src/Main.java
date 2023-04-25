import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int quant = sc.nextInt();

		if (cod == 1) {
			System.out.printf("Total R$ %.2f%n", quant * 4.0);
		}

		else if (cod == 2) {
			System.out.printf("Total R$ %.2f%n", quant * 4.50);
		} else if (cod == 3) {
			System.out.printf("Total R$ %.2f%n", quant * 5.0);
		} else if (cod == 4) {
			System.out.printf("Total R$ %.2f%n", quant * 2.0);
		} else {
			System.out.printf("Total R$ %.2f%n", quant * 1.50);
		}

		sc.close();

	}

}
