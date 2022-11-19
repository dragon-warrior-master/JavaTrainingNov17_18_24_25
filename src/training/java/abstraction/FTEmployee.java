package training.java.abstraction;

public class FTEmployee extends BaseEmployee {

//	public FTEmployee(String fName, String lName) {
//		super(fName, lName);
//		// TODO Auto-generated constructor stub
//	}

	void doWork() {
		BaseEmployee.salary = 50;
		System.out.println(BaseEmployee.salary);

	}

}
