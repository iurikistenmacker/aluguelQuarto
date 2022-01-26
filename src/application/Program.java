package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<N; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			System.out.println();
			vect[quarto] = new Aluguel(name, email, quarto);
			
		}
		
		System.out.println("Busy rooms:"  );
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].getQuarto()+": "+ vect[i].getName()+", "+ vect[i].getEmail());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}	

}
