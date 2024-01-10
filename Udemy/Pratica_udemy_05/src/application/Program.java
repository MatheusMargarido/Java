package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + " data: ");

			System.out.print("Outsourced (y|n)? ");
			char resposta = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			Integer hours = sc.nextInt();

			System.out.print("Value per hours: ");
			Double valuePerHours = sc.nextDouble();

			if (resposta == 'y') {
				System.out.print("Additional charge: ");
				Double addCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHours, addCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHours));
			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee c : list) {
			System.out.println(c);
		}

		sc.close();

	}

}
