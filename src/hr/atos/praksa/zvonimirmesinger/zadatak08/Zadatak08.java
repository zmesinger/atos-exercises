package hr.atos.praksa.zvonimirmesinger.zadatak08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Zadatak08 {

	
	public static void main(String[] args) {
		
		int month = getUserInput();
		
		
		Calendar calendar = new GregorianCalendar(2020, month, 01);
		calendar.set(Calendar.DAY_OF_MONTH, 1); 
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); 
		int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		
		printInitialSpaces(dayOfWeek);
		printCalendarDays(dayOfWeek, daysInMonth);
		

	
		
	}
	
	

	private static void printInitialSpaces(int dayOfWeek) {
		System.out.println(" P  U  S  C  P  S  N");
		String initialSpace = "";
		for (int i = 0; i < dayOfWeek - 1; i++) {
		    initialSpace += "   ";
		}
		System.out.print(initialSpace);
		
	}
	
	private static void printCalendarDays(int dayOfWeek, int daysInMonth) {
		for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysInMonth; i++) {
		    for (int j = ((i == 0) ? dayOfWeek - 1 : 0); j < 7 && (dayOfMonth <= daysInMonth); j++) {
		        System.out.printf("%2d ", dayOfMonth);
		        dayOfMonth++;
		    }
		    System.out.println();
		}
	}



	private static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number <= 12 && number >= 1) {
			return number-1;
		}
		
		return 0;
		
		
	}

	
}



