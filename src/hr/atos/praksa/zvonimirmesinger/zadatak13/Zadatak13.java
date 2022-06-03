package hr.atos.praksa.zvonimirmesinger.zadatak13;

public class Zadatak13 implements IZadatak13 {
	
	public static void main(String[] args) {
		
		Zadatak13 zadatak13 = new Zadatak13();
		
		zadatak13.printSum(zadatak13.sum(10, 1));
		
	}

	@Override
	public int sum(int firstNum, int secondNum) {
		int sum = firstNum + secondNum;
		return sum;
	}

	@Override
	public void printSum(int sum) {
		
		System.out.println("Sum of numbers is: " + sum);
		
	}

}
