import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double horaInicial = sc.nextDouble();
		double horaFinal = sc.nextDouble();

		double horaTotal;

		if (horaInicial > horaFinal) {
			horaTotal = (24 - horaInicial) + horaFinal;
			System.out.printf("O jogo durou %.2f hora(s)", horaTotal);
		} else if (horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
			System.out.printf("O jogo durou %.2f hora(s)", horaTotal);
		} else if (horaInicial == horaFinal)
			System.out.printf("O jogo durou 24h");

		sc.close();

	}

}
