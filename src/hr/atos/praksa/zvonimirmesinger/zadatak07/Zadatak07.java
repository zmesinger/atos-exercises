package hr.atos.praksa.zvonimirmesinger.zadatak07;

import java.util.Scanner;

public class Zadatak07 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		System.out.println("Number of divisible by 6 is: " + checkIfDivisible(start, end));
		
		
		
		
	}

	private static int checkIfDivisible(int start, int end) {
		
		int counter = 0;
		
		for(int i = start; i <= end; i++) {
			if(i % 6 == 0) {
				counter++;
			}
			
		}
		return counter;
		
	}

	

}
