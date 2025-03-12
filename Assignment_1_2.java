package Day1;
import java.util.*;

public class Assignment_1_2 {
//	 calculating factorial
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered number : ");
		int n = sc.nextInt();
		int sum = 1;
		for(int i =1; i<=n; i++) {
			sum *= i;
			
		}
		System.out.println("Factorial of "+n+ " is : "+sum);
	}
}
