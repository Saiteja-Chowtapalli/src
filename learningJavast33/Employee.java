package learningJavast33;

public class Employee {
	void calculateSalary() {
		System.out.println("this is calculate salary function");
	}
}

//Subclasses extending Eployee
class Manager extends Employee{
	void calculateSalary() {
		System.out.println("50,000 rupees");
	}
}
//Subclasses extending Eployee
class Programmer extends Employee{
	void calculateSalary() {
		System.out.println("30,000 rupees");
	}
}
// a class to make objects of the above classes 
class Answer {
	public static void main(String [] ar) {
		//createing objects
		Manager obj1 = new Manager();
		Programmer obj2 = new Programmer();
		obj1.calculateSalary();
		obj2.calculateSalary();
	}
}