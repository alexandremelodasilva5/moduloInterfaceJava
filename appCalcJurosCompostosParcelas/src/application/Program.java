package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Montante do empréstimo(): ");
		double amount = sc.nextDouble();
		System.out.print("Quantidade de meses: ");
		int months = sc.nextInt();
		
		InterestService isBR = new BrazilInterestService(2);
		InterestService isUSA = new UsaInterestService(1);
		
		System.out.printf("O total do emprestimo no Brasil é %.2f\n", isBR.payment(amount, months));
		System.out.printf("O total do emprestimo no USA é %.2f", isUSA.payment(amount, months));
		
		
		sc.close();

	}

}
