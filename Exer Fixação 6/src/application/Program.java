package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hotel[] vect = new Hotel[10];
		
		System.out.println("How many rooms will be rented? ");
		int hospedes = sc.nextInt();
		
		for(int i = 0; i < hospedes; i++) {
			System.out.println("Rent #" + i + ": ");
			System.out.println();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			System.out.println();
			vect[quarto] = new Hotel(name, email, quarto);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
