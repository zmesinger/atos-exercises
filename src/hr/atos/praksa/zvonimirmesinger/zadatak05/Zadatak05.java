package hr.atos.praksa.zvonimirmesinger.zadatak05;

public class Zadatak05 {
	
	public static void main(String[] args) {
		
		int start = 5;
		int end = 110;
		int counter = 0;
		
		checkIfIntervalsAreValid(start, end, counter);
		
		
		
	}

	private static void checkIfIntervalsAreValid(int start, int end, int counter) {
		if(start < 10 && end > 100) {
		
			iterateThroughIntervals(start, end, counter);
			
		}else {
			printErrorMessage();
		}
		
	}

	private static void iterateThroughIntervals(int start, int end, int counter) {
		
		while(start < end) {
			int number = start;
			
			if(number <= 18) {
				counter = counter + 4;
			}else if(number > 18) {
				counter = counter - 1;
			}else if(number % 20 == 0) {
				continue;
			}else if(number >= 75) {
				printCounter(counter);
				break;
				
			}
			
		}
	}

	private static void printCounter(int counter) {
		System.out.println(counter);
		
	}

	private static void printErrorMessage() {
		System.out.println("Intervals are not valid, please check if they are correct.");
		
	}
	
	

}
