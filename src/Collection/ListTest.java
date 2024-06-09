package Collection;
//premitiv = int rapper integer 

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Anish");
		list.add("hello");
		list.add("Ano");
		
		// list.remove(2);
		list.remove("Anish");
		System.out.println(list.contains("something"));
		
		
		for(String s : list) {
			System.out.println(s);
			
		}
		
	}

}
