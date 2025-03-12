package Day1;

import java.util.*;

/*1. Loop/conditions : write program for checking prime number, calculating factorial

*/

public class Assignment_1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("Given number is Prime");
		}
		else {
			System.out.println("Given number is not Prime");
		}
	}
	

}
