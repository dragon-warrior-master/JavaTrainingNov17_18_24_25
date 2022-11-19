package training.java.abstraction;

public class BaseEmployee {

	public BaseEmployee() {
		System.out.println("Base Emp ctor");
	}

	void doWork() {

	}

//	public BaseEmployee(String fName, String lName) {
//		this.firstName = fName;
//		this.lastName = lName;
//	}

	String firstName;
	String lastName;
	static int salary;

	public void fullname() {
		System.out.println(this.firstName + " " + this.lastName);
	}

}
