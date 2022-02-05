package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Boletim;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Boletim boletim = new Boletim();
		
		System.out.print("Name: ");
		boletim.name = sc.nextLine();
		System.out.print("Notas: ");
		boletim.n1 = sc.nextDouble();
		boletim.n2 = sc.nextDouble();
		boletim.n3 = sc.nextDouble();
		
		System.out.println("Aluno: " + boletim.name);
		System.out.printf("FINAL GRADE: %.2f%n", boletim.finalgrade());
		
		if(boletim.finalgrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", boletim.aprove());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
