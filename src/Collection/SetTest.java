package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		// TreeSet
		// LinkedHashTest
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("Php");
		set.add("Sql");
		set.add("java");
		set.add("Html");
		set.add("Andriod");
		set.add("PHP");
		set.add("js");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		
	}
	
	/*
	 * 1> set of employee
	 * 2> set of car
	 * 3> set of cow 
	 * 
	 */

}
