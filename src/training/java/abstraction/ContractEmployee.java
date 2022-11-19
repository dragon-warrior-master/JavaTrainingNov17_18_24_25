package training.java.abstraction;

public class ContractEmployee extends BaseEmployee {

	public ContractEmployee(){
		System.out.println("Contract Employee ");
	}

	public static void main(String[] args) {
		
		
		
		ContractEmployee ctr = new ContractEmployee();
		//ContractEmployee emp1 = new ContractEmployee("Amit", "Tripathi");
		//ContractEmployee contEmp1 = new ContractEmployee("Anil", "Tripathi");

		//FTEmployee fteEmp1 = new FTEmployee("Raghav", "Singh");

		//fteEmp1.doWork();

		//emp1.fullname();
		

		// Any Abstract Class can not have any Object which means it can not be
		// instantiated
		// BaseEmployee baseemp = new BaseEmployee("Raghav", "SIngh");
	}

	@Override
	void doWork() {
			BaseEmployee.salary = 100;
			System.out.println(BaseEmployee.salary);
		
	}

}
