package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BussinesExceptions;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double iniBalance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double limWithdraw = sc.nextDouble();
		Account acc = new Account(number, holder, iniBalance, limWithdraw);
		System.out.println();

		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());

		} catch (BussinesExceptions e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
