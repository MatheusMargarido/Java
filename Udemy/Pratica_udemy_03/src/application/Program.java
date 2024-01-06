package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println("ENTER CLIENT DATA: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Bird Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(nome, email, birthDate);
		System.out.println();

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.println("ENTER " + (i + 1) + "° Item data: ");

			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Product price: ");
			double price = sc.nextDouble();

			Product product = new Product(name, price);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			System.out.println();

			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);

		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();

	}

}
