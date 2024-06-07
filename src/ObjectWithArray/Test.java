package ObjectWithArray;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// store and print data of 5 students
		// create array
		Student students[] = new Student[5];
		// write data in array
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<students.length; i++) {
			
			Student s = new Student();
			
			System.out.println("Enter Id");
			s.setId(sc.nextInt());
			System.out.println("Name");
			s.setFname(sc.next());
			System.out.println("last");
			s.setLname(sc.next());
			System.out.println("Age");
			s.setAge(sc.nextInt());
			System.out.println("College");
			s.setCollege(sc.next());
			System.out.println("City");
			s.setCity(sc.next());
			students[i] = s;
		}

		for(Student s : students) {
			System.out.println(s);
		}
		// write data in array
		// read data from array
		
	}

}
