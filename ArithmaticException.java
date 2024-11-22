package core_java;

public class ArithmaticException {

	void m1() {
		System.out.println("In m1");
		
		try {
		System.out.println(10/0);        // Code that might throw an exception
	}
		catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("ArithmaticException." +e);          
		}
	}
	  void m2() {
		System.out.println("In m2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start Main");
		ArithmaticException obj = new ArithmaticException();
		obj.m1();
		System.out.println("End Main");
	}

}

/*
Start Main
In m1
Error: Division by zero is not allowed.
ArithmaticException.java.lang.ArithmeticException: / by zero
End Main
*/