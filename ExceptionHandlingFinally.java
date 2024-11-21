package core_java;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
	
		 // Array initialization
		int arr[ ]= new int[] {10,20,30,40,50};

		//try block to handle the errors/exceptions
		try {
			for(int i=0;i<=arr.length;i++) {	

				System.out.println(arr[i]);   // Print array element
			}
		}
		// Catch the specific exception
		catch(ArrayIndexOutOfBoundsException e) {        
			System.out.println("ArrayIndexOutOfBoundException occurs");
		}
		// This will always execute, regardless of exception
		finally{
			System.out.println("Connection Closed");

		}
	}
} 

/*
10
20
30
40
50
Connection Closed
*/