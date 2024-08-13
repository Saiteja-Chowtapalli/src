package learningJavast33;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the FizzBuzz Series for the numbers 1 to 100 : ");
		System.out.println("");
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
