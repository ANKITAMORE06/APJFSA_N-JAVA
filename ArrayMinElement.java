package core_java;

public class ArrayMinElement {

	public static void main(String[] args) {
	

        // Define the array
        int[] arr = {4, 8, 12, 15, 66};

        // Initialize the Smallest element as the first element of the array
        int min = arr[0];

        // Traverse the array to find the Smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Output the Smallest element
        System.out.println("The Smallest element in the array is: " + min);
    }


	}


/*
OUTPUT
The Smallest element in the array is:4
*/