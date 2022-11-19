package training.employee;


public  class Employee {
	
	private int empId;
	public String empName;
	protected String address;
	String mobile;
	
	 void joinMeeting() {
		 
	 }
	
	 
	
	void doWork() {
		
		System.out.println("Do work...");
		
	}
	
	void eatLunch() {
		this.address = "Pune";
		System.out.println("Eat Lunch...");
	}
	

}

