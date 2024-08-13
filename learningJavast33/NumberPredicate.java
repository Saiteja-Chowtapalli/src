package learningJavast33;
import java.util.*;
//creating an interface
public interface NumberPredicate {
	void numcheck(int n);
		
	
}
//implementation class for the interface
class Implement{
	//main method
	public static void main(String [] ar) {
		// implementing the logic.
		NumberPredicate n = (int j)->{
			if(j>0 && j%2==0) {
				System.out.println("positive number and even number");
			}
			else if(j<0) {
				System.out.println("negative number");
			}
			else {
				System.out.println("odd number");
			}	
		};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check if it is odd or even or positive");
		int i= sc.nextInt();
		n.numcheck(i);
		
	}
	
}