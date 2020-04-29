public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcoes[] = new String[] { "Maior e menor (2 valores)", "Salário", "Idade", "Origem", "1 ao 20",
				"Pares e Impares", "Positivos e Negativos", "Maior e Menor", "Média aritmética", "Vetor 10 valores",
				"11", "12", "13", "Sair" };
		boolean continuar = true;

		do {
			for (int i = 0; i < opcoes.length; i++) {
				System.out.println((i + 1) + " - " + opcoes[i]);
			}

			int opcao = Console.readInt("\nInforme qual exercício: ");
			System.out.println();

			switch (opcao) {
			case 1:
				Problemas.ExercicioUm();
				break;
			case 2:
				Problemas.ExercicioDois();
				break;
			case 3:
				Problemas.ExercicioTres();
				break;
			case 4:
				Problemas.ExercicioQuatro();
				break;
			case 5:
				Problemas.ExercicioCinco();
				break;
			case 6:
				Problemas.ExercicioSeis();
				break;
			case 7:
				Problemas.ExercicioSete();
				break;
			case 8:
				Problemas.ExercicioOito();
				break;
			case 9:
				Problemas.ExercicioNove();
				break;
			case 10:
				Problemas.ExercicioDez();
				break;
			case 11:
				Problemas.ExercicioOnze();
				break;
			case 12:
				Problemas.ExercicioDoze();
				break;
			case 13:
				Problemas.ExercicioTreze();
				break;
			case 14:
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida.\n");
				break;
			}
		} while (continuar);
	}
}