package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Set<Product> set = new TreeSet<>();
		set.add(new Product("Tv", 900.00));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		for (Product p : set) {
			System.out.println(p);
		}
	}
}