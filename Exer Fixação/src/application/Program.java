package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rec = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.println();
		System.out.println(rec);

	}

}
