package Encapsulation;

public class Test {
	public static void main(String[] args) {
		customer c = new customer();
		c.setName("Roman giri");
		c.setAge (20);
		c.setPhone (98034702);
		c.setCity("Phokara");
		
		System.out.println(c);
	
		/*
		System.out.println("Name = "+c.getName());
		System.out.println("Age = "+c.getAge());
		System.out.println("Phone = "+c.getPhone());
		System.out.println("city = "+c.getCity());
		
		 */

	}

}
