package learningJavast33;

public class PrimePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count variable to start the series
		int count=3;
		// algorithm for printing the prime numbers.
		//System.out.println("2");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
//				System.out.print("2");
				
				while(true) {
					byte flag= 0;
					for(int k=2;k<count;k++) {
						if(count%k==0) {
							flag = 1;
						}
					}
					if(flag==0) {
						System.out.print(count);
					}
					count++;
				}
				
			}
		}
	}

}
