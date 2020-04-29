public class Problemas {

	public static void ExercicioUm() {
		int n1, n2;

		n1 = Console.readInt("Informe o primeiro valor: ");
		n2 = Console.readInt("Informe o segundo valor: ");

		if (n1 > n2) {
			System.out.println("O primeiro número é maior que o segundo.");
		}
		if (n2 > n1) {
			System.out.println("O segundo número é maior que o primeiro.");
		}
		if (n1 == n2) {
			System.out.println("Os números são iguais.");
		}
	}

	public static void ExercicioDois() {
		int opcao;
		float salario;
		String opcoes[] = new String[] { "Técnico", "Gerente", "Outros" };

		for (int i = 0; i < opcoes.length; i++) {
			System.out.println((i + 1) + " - " + opcoes[i]);
		}

		opcao = Console.readInt("Informe seu cargo: ");
		salario = Console.readFloat("Informe seu salário: ");

		if (opcao == 1) {
			salario *= 1.5;
		}
		if (opcao == 2) {
			salario *= 1.3;
		}
		if (opcao == 3) {
			salario *= 1.2;
		}
		if (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Opção Inválida");
		}
		System.out.println("Seu novo salário será " + salario + "\n");
	}

	public static void ExercicioTres() {
		int idade;

		idade = Console.readInt("Informe a sua idade: ");

		if (idade > 0 && idade < 14) {
			System.out.println("Criança");
		}
		if (idade > 13 && idade < 20) {
			System.out.println("Adolescente");
		}
		if (idade > 19 && idade < 61) {
			System.out.println("Adulto");
		}
		if (idade > 60 && idade < 150) {
			System.out.println("Idoso");
		}
		if (idade < 1 || idade > 150) {
			System.out.println("Idade inválida");
		}
		System.out.println();
	}

	public static void ExercicioQuatro() {
		int opcao;

		opcao = Console.readInt("Informe o código de origem: ");

		if (opcao > 0 && opcao < 21) {
			System.out.println("Europa");
		}
		if (opcao > 20 && opcao < 41) {
			System.out.println("Asias");
		}
		if (opcao > 40 && opcao < 61) {
			System.out.println("América");
		}
		if (opcao > 60 && opcao < 81) {
			System.out.println("África");
		}
		if (opcao > 80) {
			System.out.println("Paraguai");
		}
		if (opcao < 1) {
			System.out.println("Opção inválida");
		}
		System.out.println();
	}

	public static void ExercicioCinco() {
		for (int i = 0; i < 20; i++) {

			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void ExercicioSeis() {
		int numeros[] = new int[10];
		int impar = 0, par = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Console.readInt("Informe o " + (i + 1) + " número: ");
			if (numeros[i] % 2 != 0) {
				impar++;
			} else {
				par++;
			}
		}
		System.out.println("\nImpares: " + impar);
		System.out.println("Pares: " + par + "\n");
	}

	public static void ExercicioSete() {
		int numeros[] = new int[20];
		int positivos = 0, negativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Console.readInt("Informe o " + (i + 1) + " número: ");
			if (numeros[i] > 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		System.out.println("\nPositivos: " + positivos);
		System.out.println("Negativos: " + negativos + "\n");

	}

	public static void ExercicioOito() {
		int numeros[] = new int[20];
		int maior = 0, menor = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Console.readInt("Informe o " + (i + 1) + " número: ");
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("\nMaior: " + maior);
		System.out.println("Menor: " + menor + "\n");
	}

	public static void ExercicioNove() {
		int i = Console.readInt("Informe de quantos números deseja fazer a média: ");
		int numeros[] = new int[i];
		float contador = 0;

		for (int j = 0; j < numeros.length; j++) {
			numeros[j] = Console.readInt("Informe o " + (j + 1) + " número: ");
			contador += numeros[j];
		}

		System.out.println("\nA média aritmética é igual a " + (contador / i) + ".\n");

	}

	public static void ExercicioDez() {
		int numeros[] = new int[10];
		int maior = 0, menor = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Console.readInt("Informe o " + (i + 1) + " número: ");
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("\nMaior: " + maior);
		System.out.println("Menor: " + menor + "\n");
	}

	public static void ExercicioOnze() {
		int numeros[] = new int[10];
		int positivos = 0, negativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Console.readInt("Informe o " + (i + 1) + " número: ");
			if (numeros[i] > 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		System.out.println("\nPositivos: " + positivos);
		System.out.println("Negativos: " + negativos + "\n");
	}

	public static void ExercicioDoze() {

	}

	public static void ExercicioTreze() {

	}

}
