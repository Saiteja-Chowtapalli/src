package learningJavast33;

public class EightPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the below number is for the first element of the series
		int count=8;
		// for printing the number of rows as well as for number of elements in a row
		for(int i=1;i<=8;i=i*2) {
			int disp=count;
			for(int j=1;j<=i;j++) {
				System.out.print(disp+" ");
				disp++;
			}
			//to print the numbers in the next line
			System.out.println("");
			// to increment the first number of the row
			count*=2;
		}
	}

}
