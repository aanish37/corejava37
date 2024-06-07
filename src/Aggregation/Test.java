package Aggregation;

public class Test {

	public static void main(String[] args) {
		Car c = new Car ();
		
		c.setColor("Blue");
		c.setPrice(9933937);
		c.setCompany("Tesla");
		
		Employee emp = new Employee();
		emp.setId(343);
		emp.setName("Anish");
		emp.setSalary(50000);
		emp.setCar(c);
		
		System.out.println("ID =" +emp.getId());
		System.out.println("Name =" +emp.getName());
		System.out.println("ID =" +emp.getSalary());
		
		System.out.println("-----------Get Car Info----------------");
		
		System.out.println("colaro ="+c.getColor());
		System.out.println("Comapny ="+c.getCompany());
		System.out.println("Price ="+c.getPrice());
		
		
		
	}
}
