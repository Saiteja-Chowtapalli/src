package learningJavast33;

import java.util.Scanner;

public class FactorsOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking input from the user 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to find its factors : ");
		int n=sc.nextInt();
		System.out.println("");
		System.out.println("The Factors of the given number " + n + " are : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
	}

}
