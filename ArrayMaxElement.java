package core_java;

public class ArrayMaxElement {

	public static void main(String[] args) {
		
		        // Define the array
		        int[] arr = {4, 8, 12, 15, 66};

		        // Initialize the largest element as the first element of the array
		        int max = arr[0];

		        // Traverse the array to find the largest element
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }

		        // Output the largest element
		        System.out.println("The largest element in the array is: " + max);
		    }
		}

/*
 OUTPUT
The largest element in the array is: 66
*/