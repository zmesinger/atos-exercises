package hr.atos.praksa.zvonimirmesinger.zadatak04;

public class Zadatak04 {

	public static void main(String[] args) {
		
		int[] numbers = {6,10,22,11,3};
		
		checkNumber(numbers);
		
	}
	
	private static void checkNumber(int[] numbers) {
		
		checkIfNumberIsEvenOrOdd(numbers);
		checkIfNumberIsMultipleOf(numbers);
		
	}


	private static void checkIfNumberIsMultipleOf(int[] numbers) {
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i] % 3 == 0) {
					
					printNumberIsMultipleOf(numbers[i]);
					
				}else if(numbers[i] % 5 == 0) {
					
					printNumberIsMultipleOf(numbers[i]);
					
				}else if(numbers[i] % 11 == 0) {
					
					printNumberIsMultipleOf(numbers[i]);
					
				}
			}
		
	}

	private static void printNumberIsMultipleOf(int number) {
		if(number % 3 == 0) {
			
			System.out.println(number + " is multiple of 3");
			
		}else if(number % 5 == 0) {
			
			System.out.println(number + " is multiple of 5");
			
		}else if(number % 11 == 0) {
			
			System.out.println(number + " is multiple of 11");
			
		}
		
	}

	private static void checkIfNumberIsEvenOrOdd(int[] numbers) {
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				
				numberIsEven(numbers[i]);
				
			}else {
				
				numberIsOdd(numbers[i]);
				
			}
		}
		
	}

	private static void numberIsEven(int number) {
		System.out.println(number + " is even number");	
	}
	private static void numberIsOdd(int number) {
		System.out.println(number + " is odd number");
		
	}
	
	
	
}
