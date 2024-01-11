package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle: (R|C): ");
			char r = sc.next().charAt(0);
			System.out.print("Color (Black|Blue|Red): ");
			Color color = Color.valueOf(sc.next());

			if (r == 'r') {
				System.out.print("Width: ");
				double w = sc.nextDouble();

				System.out.print("height: ");
				double h = sc.nextDouble();
				list.add(new Rectangle(color, w, h));

			} else {
				System.out.print("Radios: ");
				double rad = sc.nextDouble();
				list.add(new Circle(color, rad));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");

		for (Shape c : list) {
			System.out.println(String.format("%.2f", c.area()));
		}
		sc.close();
	}
}
