package learningJavast33;

public abstract class BankAccount {
	//defining abstract methods
	public abstract void deposit();
	public abstract void withdraw();
	

}
//extending BankAccount abstract class
class SavingsAccount extends BankAccount{
	//implementing abstract methods
	public void deposit() {
		System.out.println("the amount has been deposited to savings account");
		
	}
	public void withdraw() {
		System.out.println("the amount has been withdrawn to savings account");
		
	}
	
}
//extending BankAccount abstract class
class CurrentAccount extends BankAccount{
		//implementing abstract methods
		public void deposit() {
			System.out.println("the amount has been deposited to current account");
			
		}
		public void withdraw() {
			System.out.println("the amount has been withdrawn to current account");
			
		}
		
}

class BankAnswers {
	public static void main(String [] ar){
		//creating class objects
		CurrentAccount obj1 = new CurrentAccount();
		//calling class methods
		obj1.deposit();
		obj1.withdraw();
		//creating class objects
		SavingsAccount obj2 = new SavingsAccount();
		//calling class methods
		obj2.deposit();
		obj2.withdraw();
	}
}