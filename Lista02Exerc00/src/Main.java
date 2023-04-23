import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		if (notaFinal > 60) {
			System.out.println("Nota final = " + notaFinal);
		}
		
		else {
			System.out.println("Nota final = " + notaFinal);
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
