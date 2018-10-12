package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ConPf;
import entities.Contribuinte;
import entities.ConPj;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Contribuinte> listaContribuintes = new ArrayList<>();

		System.out.print("QUANTOS CONTRIBUINTES?");
		int qtd = sc.nextInt();

		double impostoInd = 0.00;
		double impostoTotal = 0.00;

		for (int i = 1; i <= qtd; i++) {
			System.out.print("P[F] ou P[J]  - ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("NOME: ");
			String nome = sc.nextLine();
			System.out.print("RENDA ANUAL: ");
			Double renda = sc.nextDouble();

			if (op == 'f' || op == 'F') {
				System.out.print("GASTOS COM SAÚDE: ");
				Double gastoSaude = sc.nextDouble();

				Contribuinte contribuinte = new ConPf(nome, renda, gastoSaude);
				listaContribuintes.add(contribuinte);
				impostoTotal += contribuinte.calcImposto();

			} else if ( op == 'J' || op == 'j') {
				System.out.print("QUANTIDADE DE FUNCIONARIOS: ");
				int qtdFunc = sc.nextInt();
				
				Contribuinte contribuinte = new ConPj(nome, renda, qtdFunc);
				listaContribuintes.add(contribuinte);
				impostoTotal += contribuinte.calcImposto();
			}
			
			if(i == qtd) {
				for(Contribuinte con : listaContribuintes) {
					System.out.println(con);
				}
				System.out.printf("TOTAL DE IMPOSTOS DURANTE O ANO: R$%.2f", impostoTotal);
			}

		}

		sc.close();

	}

}
