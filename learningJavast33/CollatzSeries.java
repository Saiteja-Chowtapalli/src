package learningJavast33;

import java.util.Scanner;

public class CollatzSeries {

	public static void main(String[] args) {
		// taking input from user using scanner class and nextInt() method.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for printing collatz series : ");
		int n=sc.nextInt();
		System.out.println("");
		// checking if the input value is greater than or equal to 1.
		if(n>1) {
			//printing the value of the given number for the first time.
			System.out.println(n);
			//printing the collatz series.
			while(n>=2) {
				
			
				if(n%2==0) {
					n=n/2;
				}
			
				else {
					n=n*3+1;
				}
				System.out.println(n);
			}
		}
		else if(n==1) {
			System.out.println(1);
			System.out.println(4);
			System.out.println(2);
			System.out.println(1);
		}
		// runs when the number entered is invalid.
		else {
			System.out.println("Enter a number greater than or equal to 1");
		}

	}
}
