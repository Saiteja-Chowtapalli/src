package learningJavast33;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// taking input from the user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of fibonacci numbers you want to display : ");
		int n=sc.nextInt();
		System.out.println("");
		// initializing the starting fibonacci numbers
		int i=0;
		int j=1;
		int fib;
		//checking the input number of positions
		if(n==1) {
			System.out.println(0);
			
		}
		//checking the input number of positions
		else if (n==2) {
			System.out.println(1);
		}
		//checking if the input is valid
		else if(n<=0) {
			System.out.println("Give Proper input: number of fib positions you want to display");
		}
		else {
			// algorithm for fibonacci series
			System.out.println(0);
			System.out.println(1);
			for(int k=2;k<n;k++) {
				fib=i+j;
				i=j;
				j=fib;
				System.out.println(fib);
			}
		}
	}

}
