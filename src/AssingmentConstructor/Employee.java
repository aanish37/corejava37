package AssingmentConstructor;

class Employee {	
	int salary;
	int hoursPerDay;
	
	void getInfo(int salary, int hoursPerDay) {
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;	
	}
	
	 void AddSal() {
	        if (this.salary < 500) {
	            this.salary += 10;
	        }
	    }
	 
	 void AddWork()
	 {
		 if (this.hoursPerDay > 6) {
			 this.salary += 5;
		 }
	 }
	 void printSalary() {
	        System.out.println("Total Salary = $" + this.salary);
	    }
	 
	 public static void main(String[] args) {
	        Employee em = new Employee(); 
	        em.getInfo(450, 7);
	        em.AddSal();
	        em.AddWork();
	        em.printSalary();
	    }
	 
	
}

