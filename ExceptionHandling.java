package core_java;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {2,3,4};

		try {
			System.out.println(age[5]);
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exceptions Handled " + e.getMessage());

		}


	}
}